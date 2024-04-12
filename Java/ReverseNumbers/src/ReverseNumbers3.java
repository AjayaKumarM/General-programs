import java.util.Scanner;

public class ReverseNumbers3 {
    public static void main(String[] args) {

        //Using String builder class

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int num = scanner.nextInt();

        StringBuilder sbl = new StringBuilder();
        sbl.append(num);

//        StringBuilder rev = sbl.reverse();
//        System.out.println("The reversed numbers are: "+rev);

        System.out.println("The reversed numbers are: "+sbl.reverse());
    }
}
