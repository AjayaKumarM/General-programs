public class SwapTwoNumbers3 {
    public static void main(String[] args) {

        // Using * and / not using a third variable
        // Only works if the numbers are non-zero

        int a =10, b = 20;

        System.out.println("Before swapping: a = "+a+ ", b = "+b);

        a = a*b;  // a = 10*20 = 200;
        b = a/b;  // b = 200/20 = 10; 
        a = a/b;  // a = 200/10 = 20;

        System.out.println("After swapping: a = "+a+ ", b = "+b);
    }
}
