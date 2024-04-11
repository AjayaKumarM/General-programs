public class SwapTwoNumbers4 {
    public static void main(String[] args) {

        //Using logic bitwise XOR(^)

        int a =10, b = 20;

        System.out.println("Before swapping: a = "+a+ ", b = "+b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After swapping: a = "+a+ ", b = "+b);
    }
}
