public class SwapTwoNumbers2 {
    public static void main(String[] args) {

        //Using + and - operators not using a third variable

        int a =10, b = 20;

        System.out.println("Before swapping: a = "+a+ ", b = "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping: a = "+a+ ", b = "+b);

    }
}
