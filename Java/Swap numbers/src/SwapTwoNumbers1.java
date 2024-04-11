public class SwapTwoNumbers1 {
    public static void main(String[] args) {

        //Swapping two variables using a third variable//

        int a =10, b = 20, temp;

        System.out.println("Before swapping: a = "+a+ ", b = "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = "+a+ ", b = "+b);

    }
}
