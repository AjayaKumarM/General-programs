public class SwapTwoNumbers2 {
    public static void main(String[] args) {

        //Using + and - operators not using a third variable

        int a =10, b = 20;

        System.out.println("Before swapping: a = "+a+ ", b = "+b);

        a = a+b;  // a = 10+20 = 30;
        b = a-b;  // b = 30-20 = 10;
        a = a-b;  // a = 30-10 = 20;

        System.out.println("After swapping: a = "+a+ ", b = "+b);

    }
}
