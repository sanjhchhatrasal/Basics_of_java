//**************************** BIT MANIPULATION ****************************

// Get Bit

// public class GetBit{
//     public static void main(String[] args){
//         int n = 5;
//         int i = 3;
//         int bitMask = 1 << i;

//         if((bitMask & n ) == 0){
//             System.out.println("Bit was zero");
//         } else{
//             System.out.println("Bit was one");
//         }
//     }
// }

// Set Bit
public class SetBit{
    public static void main(String[] args){
        int n = 5;
        int i = 1;
        int bitMask = 1 << i;

        int newNumber = bitMask | n;
        System.out.println(newNumber);

    }
}