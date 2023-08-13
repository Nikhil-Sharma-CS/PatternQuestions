import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int N = S.nextInt();

        for(int i=0; i<N; i++)
        {
            for(int star=0; star<=i; star++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}