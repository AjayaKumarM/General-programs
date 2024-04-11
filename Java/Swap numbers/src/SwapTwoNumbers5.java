public class SwapTwoNumbers5 {
    public static void main(String[] args) {

        //Using a single statement with + and - operators

        int a =10, b = 20;

        System.out.println("Before swapping: a = "+a+ ", b = "+b);

        b = a+b-(a=b); // b = 10+20-(20) = 30-20 = 10  a value is previously assigned as 20

        // we can also use b = a*b/(a=b) gives same answer

        System.out.println("After swapping: a = "+a+ ", b = "+b);
    }
}
