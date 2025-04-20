//**************************** BIT MANIPULATION ****************************

// Get Bit

// public class GetBit{
//     public static void main(String[] args){
//         int n = 5;
// //         int pos = 3;
//         int bitMask = 1 << pos;

//         if((bitMask & n ) == 0){
//             System.out.println("Bit was zero");
//         } else{
//             System.out.println("Bit was one");
//         }
//     }
// }

// Set Bit
// public class SetBit{
//     public static void main(String[] args){
//         int n = 5;
//         int pos = 3;
//         int bitMask = 1 << pos;

//         int newNumber = bitMask | n;
//         System.out.println(newNumber);

//     }
// }

// Clear Bit
// public class ClearBit{
//     public static void main(String[] args){
//         int n = 5;
//         int pos = 2;
//         int bitMask = 1 << pos;
//         int notBitMask = ~(bitMask);

//         int newNumber = notBitMask & n;
//         System.out.println(newNumber);
//     }
// }

import java.util.*;
// Update Bit
// public class UpdateBit{
//     public static void main(String[] args){
//         Scanner  sc = new Scanner(System.in);
//         int oper = sc.nextInt();
//         int n = 5;
//         int pos = 1;
//         int bitMask = 1 << pos;

//         if (oper == 1){
//             // set
//             int newNumber = bitMask | n;
//             System.out.println(newNumber);
//         }else{
//             // clear
//             int notBitMask = ~(bitMask);
//             int newNumber = notBitMask & n;
//             System.out.println(newNumber);
//         }
//     }
// }

// Write a program to count the number of 1’s in a binary representation of the number.
public class CountOnes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        while (n > 0){
            if((n & 1) == 1){
                count += 1;

            }
            n = n >> 1;
        }
        System.out.println("Number of 1's in binary representation: " + count);

    }
}