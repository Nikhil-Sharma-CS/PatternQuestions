import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();

        //For first half
        for (int line = 0; line < N; line++) {
            //For spaces
            for(int space=0; space<line*2; space++)
                System.out.print("\t");

            //For stars
            for(int stars=0; stars<N-line; stars++)
                System.out.print("*\t");
            System.out.println();
        }

        //For second half
        for(int line=0; line<N-1; line++)
        {
            //For spaces
            for(int space=0; space<line+2; space++)
                System.out.print("\t");
            //For stars
            for(int star=0; star<line+2; star++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}