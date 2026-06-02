import java.util.Scanner;

public class stringlength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int len = str.length();

        System.out.println("Length = " + len);

        sc.close();
    }
}