public class SwapTwoNumbers3 {
    public static void main(String[] args) {

        // Using * and / not using a third variable
        // Only works if the numbers are non-zero

        int a =10, b = 20;

        System.out.println("Before swapping: a = "+a+ ", b = "+b);

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("After swapping: a = "+a+ ", b = "+b);
    }
}
