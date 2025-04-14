import java.util.*;

// ************************ HELLO WORLD ************************
// public class FirstClass{
//     public static void main(String[] args){
//         System.out.println("Hello World!!");
//     }
// }

// ************************ SUM OF TWO NUMBERS ************************
// public class SumOfNum{
//     public static void main (String[] args){
//         int a = 10;
//         int b = 20;
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// ************************ SUM OF TWO NUMBERS BY TAKING INPUT FROM USER ************************
// public class SumOfNumScanner{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);
//         sc.close();
//     }
// }

// ************************ AREA OF CIRCLE ************************
// public class AreaOfCircle {
//     public static void  main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int radius = sc.nextInt();
//         double area = Math.PI * radius * radius;
//         System.out.println(area);
//     }
// }


// ************************ TABLE OF NUMBER ************************
// public class TableofNum {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int  n = sc.nextInt();
//         // System.out.println( 1*n);
//         // System.out.println( 2*n);
//         // System.out.println( 3*n);
//         // System.out.println( 4*n);
//         // System.out.println( 5*n);
//         // System.out.println( 6*n);
//         // System.out.println( 7*n);
//         // System.out.println( 8*n);
//         // System.out.println( 9*n);
//         // System.out.println( 10*n);
//     }
// }


// ************************ CALCULATOR ************************
// public class CalculatorOfNum{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int operator = sc.nextInt();

//         switch(operator){
//             case 1: System.out.println(a + b);
//             break;

//             case 2: System.out.println(a - b);
//             break;

//             case 3: System.out.println(a * b);
//             break;

//             case 4: System.out.println(a / b);
//             break;

//             case 5: System.out.println(a % b);
//             break;

//             default : System.out.println("Invalid Operator");
//         }

//     }
// }


// ************************ MONTH DISPLAY ************************
// public class MonthDisplay{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int month = sc.nextInt();

//         switch (month){
//             case 1: System.out.println("January");
//             break;

//             case 2: System.out.println("February");
//             break;

//             case 3: System.out.println("March");
//             break;

//             case 4: System.out.println("April");
//             break;

//             case 5: System.out.println("May");
//             break;

//             case 6: System.out.println("June");
//             break;

//             case 7: System.out.println("July");
//             break;

//             case 8: System.out.println("August");
//             break;

//             case 9: System.out.println("September");
//             break;

//             case 10: System.out.println("October");
//             break;

//             case 11: System.out.println("November");
//             break;

//             case 12: System.out.println("December");
//             break;

//             default: System.out.println("Invalid Month");
//         }
//     }
// }


// ************************ EMPTY FOR LOOP ************************
// public class EmptyForLoop{
//     public static void main(String[] args){
//         for(; ;) {
//             System.out.println("Apna College");
//         }

//     }
// }


// ************************ EVEN NUMBERS ************************
// public class evenNums{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for (int i = 0; i <= num;  i++){
//             if (i % 2 == 0){
//                 System.out.println(i);
//             }

//         }
//     }
// }


// ************************ 0 AND 1 PROGRAM ************************
// public class menuDriven {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int choice ;

//         do{
//             System.out.println("Enter 1 to input marks or 0 to stop!: ");
//             choice = sc.nextInt();

//             if (choice == 1){
//                 System.out.println("Enter student's marks upto 100: ");
//                 int marks = sc.nextInt();

//                 if (marks >= 90 && marks <= 100) {
//                     System.out.println("This is Good");
//                 } else if (marks >= 60 && marks <= 89) {
//                     System.out.println("This is also Good");
//                 } else if (marks >= 0 && marks < 60) {
//                     System.out.println("This is Good as well");
//                 } else {
//                     System.out.println("Invalid marks. Please enter marks between 0 and 100.");
//                 }
//             } else if (choice != 0) {
//                 System.out.println("Invalid choice. Please enter 1 or 0.");
//             }
//             } while (choice != 0); 

//                 System.out.println("Program stopped!");
            

           
//         }
// }


// ************************ PRIME NUMBERS ************************
// public class PrimeNums{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int counter = 0;

//         for (int i = 1; i <= num; i++){
//             if (i % 2 == 0){
//                 counter += 1;
//             }else{
//                 counter = 1;
//             }

//             System.out.println(counter);    
//         }
//     }
// }


// ************************ RECTANGLE PATTERN ************************
// ****
// ****
// ****
// ****

// public class Rectangle{
//     public static void main(String[] args){
//         for (int i = 1; i <= 4; i++){
//             for (int j = 1; j < 4; j++){
//                 System.out.print("*");
//             }
//             System.out.println("*");
//         }
//     }
// }


// ************************ HOLLOW RECTANGLE PATTERN ************************
// * * * *
// *     *
// *     *
// * * * *

// public class HollowRectangle{
//     public static void main(String[] args){
//         int n = 4;
//         int m = 5;

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= m; j++){
//                 if(i == 1 || j == 1 || i == n || j == m){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }


// ************************ HALF PYRAMID PATTERN ************************
// *
// **
// ***
// ****

// public class HalfPyramid{
//     public static void main(String[] args){
//         int n = 4;

//         for (int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// ************************ INVERTED PYRAMID PATTERN ************************
// ****
// ***
// **
// *

// public class InvertedPyramid{
//     public static void main(String[] args){
//         int n = 4;

//         for (int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// ************************ INVERTED AND ROTATED HALF STAR PATTERN ************************

//    *
//   **
//  ***
// ****

// public class InvertedAndRotatedHalfStar{
//     public static void main(String[] args){
//         int n  = 4;

//         for (int i = 1; i <= n; i++){
//             // inner loop -> space print
//             for (int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }

//             //inner loop -> star print
//             for (int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }


// ************************ NUMBER PATTERN ************************
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5 

// public class NumberPattern {
//     public static void main(String[] args){
//         int n = 5;

//         for (int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// ************************ INVERTED NUMBER PATTERN ************************
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// public class InvertedNumberPattern{
//     public static void main(String[] args){
//         int n = 5;

//         for (int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// ************************ FLOYS TRIANGLE PATTERN ************************
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// public class FloysTriangle{
//     public static void main(String[] args){
//         int n = 5;
//         int num = 1;

//         for (int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(num+ " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }


// ************************ ZERO ONE PATTERN ************************
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// public class ZeroOnePattern{
//     public static void main(String[] args){
//         int n = 5;

//         for (int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 int  sum = i+j;
//                 if(sum % 2 == 0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// ************************ BUTTERFLY PATTERN ************************
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

// public class ButterflyPattern{
//     public static void main(String[] args){
//         int n = 4;

//         // Upper half
//         for(int i = 1; i <= n; i++){
//             // 1st part
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }

//             // spaces
//             int spaces = 2 * (n - i);
//             for(int j = 1; j <= spaces; j++){
//                 System.out.print(" ");
//             }

//             // 2nd part
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();           
//         } 

//         // Lower half

//         for(int i = n; i >= 1; i--){
//             // 1st part
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }

//             // spaces
//             int spaces = 2 * (n - i);
//             for(int j = 1; j <= spaces; j++){
//                 System.out.print(" ");
//             }

//             // 2nd part
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// ************************ SOLID RHOMBUS PATTERN ************************
//     *****
//    *****
//   *****
//  *****
// *****

// public class SolidRhombusPattern{
//     public static void main(String[] args){
//         int n = 5;

//         for(int i = 1; i <= n; i++){
//             // spaces
//             for(int j = 1; j <= (n - i); j++){
//                 System.out.print(" ");
//             }

//             for(int j = 1; j <= n; j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

// ************************ NUMBER TRIANGLE PATTERN ************************
//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

// public class NumberTrianglePattern{
//     public static void main(String[] args){
//         int n = 5;

//         for(int i = 1; i <= n; i++){
//             // spaces
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }

//             // star print
//             for(int j = 1; j <= i; j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// ************************ PALLINDROMIC PATTERN ************************
//     1
//    212
//   32123
//  4321234
// 543212345

// public class PallindromePattern{
//     public static void main(String[] args){
//         int n = 5;

//         for(int i = 1; i <= n; i++){
//             // spaces
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }
//             // 1st half
//             for(int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }

//             // 2nd half
//             for(int j = 2; j <= i; j++){
//                 System.out.print(j);
//             }

//             System.out.println();
//         }
//     }
// }

// ************************ DIAMOND PATTERN ************************
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     *

// public class DiamondPattern{
//     public static void main(String[] args){
//         int n = 5;

//         // upper half
//         for(int i = 1; i <= n; i++){
//             // spaces
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }

//             // Star print
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*" + " ");
//             }

//             System.out.println();
//         }

//         // lower half
//         for(int i = n; i >= 1; i--){
//             // spaces
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }

//             // Star print
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*" + " ");
//             }

//             System.out.println();
//         }

//     }
// }

// Make a function to add 2 numbers and return there sum

// public class sumOfTwoNumbers{

//     public static int sumOfNumbers(int a, int b){
//         int sum = a + b;
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = sumOfNumbers(a, b);
//         System.out.println("Sum of 2 numbers is: "+ sum);
//     }
// }

// Factorial of a number

// public class factorialOfNum{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         if(num < 0){
//             System.out.println("Invalid Number");
//             return;
//         }

//         int fact = 1;
//         for(int i = num; i >= 1; i--){
//             fact = fact * i;
//         }
//         System.out.println(fact);
//     }
// }

// Check if a number is prime or not

public class PrimeNumberCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count += 1;
            }
        }
        if (count > 2 ){
            System.out.println(num + " is not a prime number");
        } else{
            System.out.println(num + " is a prime number");
        }
    }
}