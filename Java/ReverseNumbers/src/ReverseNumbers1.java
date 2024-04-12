import java.util.Scanner;

public class ReverseNumbers1 {
    public static void main(String[] args) {

        // Using algorithm only use this when there is no 0 in 1st or last place in number

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int num = scanner.nextInt();
        int rev = 0;

       while(num!=0){

           rev = rev*10 + num%10; // (1). 0*10 + 1234%10 = 0 + 4 = 4  (2). 4*10 + 123%10 = 40+3 = 43
           num = num/10;          // (1). 1234/10 = 123               (2). 123/10 = 12
       }

        System.out.println("The reversed numbers are "+rev);

    }
}
