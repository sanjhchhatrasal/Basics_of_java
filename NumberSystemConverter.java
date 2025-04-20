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
// public class CountOnes{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int count = 0;

//         while (n > 0){
//             if((n & 1) == 1){
//                 count += 1;

//             }
//             n = n >> 1;
//         }
//         System.out.println("Number of 1's in binary representation: " + count);

//     }
// }

// Write a program to toggle a bit a position = “pos” in a number “n”.
// public class ToggleBitPos{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number (n): ");
//         int n = sc.nextInt();

//         System.out.print("Enter the position you want to toggle: ");
//         int pos = sc.nextInt();

//         int result = n ^ (1 << pos);
//         System.out.println("Number after toggling the bit: " + result);
//     }
// }

// Write a program to find if a number is a power of 2 or not.
// public class powerOfTwo{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         if(isPowerOfTwo(n)){
//             System.out.println(n + " is a power of 2");
//         }else{
//             System.out.println(n + " is not a power of 2");
//         }
//     }

//     public static boolean isPowerOfTwo(int n){
//         return n > 0 && (n & (n - 1)) == 0;
//     }
// }

// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.

public class NumberSystemConverter {

    // Function to convert decimal to binary
    public static String decimalToBinary(int n) {
        if (n == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);  // Prepend remainder
            n = n / 2;
        }
        return binary.toString();
    }

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Binary: " + binary);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binaryInput = sc.next();
        int decimalResult = binaryToDecimal(binaryInput);
        System.out.println("Decimal: " + decimalResult);
    }
}
