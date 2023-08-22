import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

public class MagicSquares {
    static ArrayList<ArrayList<Integer>> nums = new ArrayList<ArrayList<Integer>>();
    static String[] fileNames = {"Luna.txt", "Mercury.txt"};
    public static void main(String[] args) throws Exception {
        for (String file : fileNames) {
            readNums(file);
            System.out.println("Are the numbers in " + file + " magic? " + checkRows());
            nums.clear();
        }
    }

    public static boolean checkRows() {
        // sum value to check against
        double sumVal = -1;
        // running sum to check rows
        double currSum;

        // array to store sum of each col
        double[] colSum = new double[ nums.size() ];
        Arrays.fill(colSum, 0);
        // array to store sum of each diagnol
        double[] diagSum = new double[ 2 ];
        Arrays.fill(diagSum, 0);

        for(int i = 0; i < nums.size(); i++) {
            currSum = 0;
            for(int j = 0; j < nums.get(i).size(); j++) {
                // sum for row
                currSum += nums.get(i).get(j);
                // j is current column
                colSum[j] += nums.get(i).get(j);
                
                // on middle num of an even square
                if(i == j && i + j == nums.size() - 1) {
                    diagSum[0] += nums.get(i).get(j);
                    diagSum[1] += nums.get(i).get(j);
                // on left diagonal
                } else if(i == j) {
                    diagSum[0] += nums.get(i).get(j);
                // on right diagonal
                } else if (i + j == nums.size() - 1) {
                    diagSum[1] += nums.get(i).get(j);
                }
            }

            // sum val must be set for the first time
            if(sumVal == -1) {
                sumVal = currSum;
            } else if (sumVal != currSum){
                return false;
            }
        }
        
        // each diagonal and each column must sum to the same value
        return (DoubleStream.of(colSum).sum() == sumVal * nums.size() &&
                DoubleStream.of(diagSum).sum() == sumVal * 2);
    }

    public static void readNums(String fileName) {
        try {
            File myObj = new File(fileName);
            Scanner scanner = new Scanner(myObj);

            while(scanner.hasNextLine()) {
                String myLine = scanner.nextLine();
                if(!myLine.equals("")) {
                    //System.out.println(myLine);
                    String[] lineString = myLine.split("\t");
                    ArrayList<Integer> ints = new ArrayList<Integer>();
                    for (String string : lineString) {
                        ints.add(Integer.parseInt(string));
                    }
                    nums.add(ints);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

