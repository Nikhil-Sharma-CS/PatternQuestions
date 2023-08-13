import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();

        //For first half
        for (int line = 0; line < N/2+1; line++) {

            //For spaces
            for (int space = 0; space < N/2-line; space++)
                System.out.print("\t");
            //For stars
            for(int stars = 0; stars<line*2+1; stars++)
                System.out.print("*\t");
            System.out.println();
        }

        //For second half
        for(int line = 0; line<N/2; line++)
        {
            //For spaces
            for(int space = 0; space<line+1; space++)
                System.out.print("\t");

            //For stars
            for(int stars = 0; stars<N-2-line*2; stars++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}