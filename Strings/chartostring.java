import java.util.Scanner;

public class chartostring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String str = String.valueOf(ch);

        System.out.println("String is: " + str);

        sc.close();
    }
}