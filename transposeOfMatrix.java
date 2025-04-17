import java.util.*;

// 1. Enter 3 numbers from the user & make a function to print their average.

// public class averageOfThreeNum{

//     public static int averageFunc(int a, int b, int c){
//         int sum = a + b + c;
//         return sum / 3;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int avg = averageFunc(a, b, c);
//         System.out.println("Average of 3 numbers: " + avg);
//     }
// }

// Write a function to print the sum of all odd numbers from 1 to n.

// public class SumOfOddNums{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;

//         for(int i = 1; i <= n; i++){
//             if(i % 2 != 0){
//                 sum += i;
//             }
//         }
//         System.out.println("Sum of odd numbers is: " + sum);
//     }
// }

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

// public class CountPositiveNegativeZeroNum{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int positiveCount = 0;
//         int negativeCount = 0;
//         int zeroCount = 0;
//         char choice;

//         do{
//             System.out.print("Enter a number: ");
//             int num = sc.nextInt();

//             if(num > 0){
//                 positiveCount += 1;
//             } else if(num < 0){
//                 negativeCount += 1;
//             } else if(num == 0){
//                 zeroCount += 1;
//             }else{
//                 System.out.println("Invalid Choice");
//             }

//             System.out.println("Do you want to continue? (y /n): ");
//             choice = sc.next().charAt(0);
//         } while(choice == 'y' || choice == 'Y');

//         System.out.println("\n Results:");
//         System.out.println("Positive count: " + positiveCount);
//         System.out.println("Negative count: " + negativeCount);
//         System.out.println("Zero count: " + zeroCount);
//     }
// }

// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

// public class OneNumberRaisedToOther{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int n = sc.nextInt();

//         double result = Math.pow(x, n);

//         System.out.println("Result is: "+ result);
//     }
// }

// Take an array as input from the user. Search for a given number x  and print the index at which it occurs.

// public class ArrayConcept{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int nums[] = new int[size];

//         // input
//         for(int i =0; i < size; i++){
//             nums[i] = sc.nextInt();
//         }

//         int x = sc.nextInt();

//         // output
//         for(int i =1; i < nums.length; i++){
//             if(nums[i] == x){
//                 System.out.println("x found on index: " + i);
//             }
//         }

//     }
// }

// Take an array of names as input from the user and print them on the screen.

// public class arrayNames{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String names[] = new String[size];

//         // input
//         for(int i = 0; i < size; i++){
//             names[i] = sc.nextLine();
//         }

//         // output
//         for(int i = 0; i < names.length; i++){
//             System.out.println("names at " + (i + 1) +  names[i]);
//         }
//     }
// }

// Find the maximum & minimum number in an array of integers. 

// public class maxMinNum{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int nums[] = new int[size];

//         // input
//         for(int i = 0; i < size; i++){
//             nums[i] = sc.nextInt();
//         }

//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         // output
//         for(int i =0; i < nums.length; i++){
//             if(nums[i] < min){
//                 min = nums[i];
//             }
//             if(nums[i] > max){
//                 max = nums[i];
//             }
//         }
//         System.out.println("Max num is: " + max);
//         System.out.println("Min num is: " + min);


//     }
// }

// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// {3, 4, 6, 2} is not sorted in ascending order.

// public class sortedUnsortedArray{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int nums[] = new int[size];

//         // input
//         for(int i = 0; i < size; i++){
//             nums[i] = sc.nextInt();
//         }

//         boolean isAscending = true;

//         for(int i = 0; i < nums.length-1; i++){
//             if(nums[i] > nums[i+1]){
//                 isAscending = false;
//             }
//         }

//         if(isAscending){
//             System.out.println("The array is sorted");
//         }else{
//             System.out.println("The array is not sorted");
//         }

//     }
// }

// 2D ARRAY

// public class TwoDArray{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int[][] nums = new int[rows][cols];

//         // input
//         // rows
//         for(int i = 0; i < rows; i++){
//             // columns
//             for(int j = 0; j < cols; j++){
//                 nums[i][j] = sc.nextInt();
//             }
//         }

//         // output
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 System.out.print(nums[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Searching for an element x in a matrix.

// public class SearchingX{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int[][] nums = new int[rows][cols];

//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 nums[i][j] = sc.nextInt();
//             }
//         }
//         int x = sc.nextInt();

//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 if(nums[i][j] == x){
//                     System.out.println("X found on: (" + (i  +"," + j) + ")");
//                 }
//             }
//         }
//     }
// }

// For a given matrix of N x M, print its transpose.

public class transposeOfMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
