import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int N = S.nextInt();

        for(int line=0; line<N; line++)
        {
            //For spaces
            for(int space=0; space<N-line-1; space++)
                System.out.print("\t");

            //For first part of pattern
            for(int first=N-line; first<N; first++)
                System.out.print(first+"\t");

            //For middle part of pattern
            System.out.print(0+"\t");

            //For last part of pattern
            for(int second=0; second<line; second++)
                System.out.print(N-second-1 + "\t");

            System.out.println();
        }
    }
}