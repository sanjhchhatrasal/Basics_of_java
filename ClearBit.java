//**************************** BIT MANIPULATION ****************************

// Get Bit

// public class GetBit{
//     public static void main(String[] args){
//         int n = 5;
//         int pos = 3;
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
public class ClearBit{
    public static void main(String[] args){
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}