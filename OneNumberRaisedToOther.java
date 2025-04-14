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

public class OneNumberRaisedToOther{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        double result = Math.pow(x, n);

        System.out.println("Result is: "+ result);
    }
}