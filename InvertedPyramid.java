// public class FirstClass{
//     public static void main(String[] args){
//         System.out.println("Hello World!!");
//     }
// }

// 
// public class SumOfNum{
//     public static void main (String[] args){
//         int a = 10;
//         int b = 20;
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

import java.util.*;

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

// public class AreaOfCircle {
//     public static void  main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int radius = sc.nextInt();
//         double area = Math.PI * radius * radius;
//         System.out.println(area);
//     }
// }

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

// public class AnonymousNums{
//     public static void main(String[] args){
//         for(; ;) {
//             System.out.println("Apna College");
//         }

//     }
// }

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

public class InvertedPyramid{
    public static void main(String[] args){
        int n = 4;

        for (int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}