public class SwapTwoNumbers1 {
    public static void main(String[] args) {

        //Swapping two numbers using a third variable//

        int a =10, b = 20, temp;

        System.out.println("Before swapping: a = "+a+ ", b = "+b);

        temp = a;   // temp = 10  
        a = b;      // a = 20     
        b = temp;   // b = 10     

        System.out.println("After swapping: a = "+a+ ", b = "+b);

    }
}
