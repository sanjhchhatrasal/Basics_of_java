// public class Recursion1{
//     public static void PrintNumb(int n){
//         if(n == 0){
//             return;
//         }
//         System.out.println(n);
//         PrintNumb(n - 1);
//     }
//     public static void main(String[] args){
//         int n = 5;
//         PrintNumb(n);
//     }
// }

// public class Recursion1{
//     public static void PrintNumb(int n){
//         if(n == 6){
//             return;
//         }
//         System.out.println(n);
//         PrintNumb(n+1);
//     }
//     public static void main(String[] args){
//         int n = 1;
//         PrintNumb(n);

//     }
// }

import java.util.*;

import java.util.Scanner;

public class SumOfNaturalNum{

    public static void NaturalNum(int num, int n, int sum){
        if(num == n + 1){
            return;
        }
        
        sum += num;
        System.out.println(sum);
        NaturalNum(num + 1, n, sum);
    }
    public static void main(String[] args){
        int num = 1;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        NaturalNum(num, n, sum);
    }
}