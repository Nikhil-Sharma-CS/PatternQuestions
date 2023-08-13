import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();

        for(int line = 0; line < N; line++) {
            //For spaces
            for(int space=0; space<line; space++)
                System.out.print("\t");
            //For star
            for(int star=0; star<N-line; star++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}