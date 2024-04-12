import java.util.Scanner;

public class ReverseNumbers2 {
    public static void main(String[] args) {

        // Using String buffer class method use this when 0 is the first or last number

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int num = scanner.nextInt();

        StringBuffer rev;
        StringBuffer sb = new StringBuffer(String.valueOf(num));

        rev = sb.reverse();

        System.out.println("The reversed numbers are: "+rev);
    }
}
