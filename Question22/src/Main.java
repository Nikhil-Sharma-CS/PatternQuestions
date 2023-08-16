import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int N = S.nextInt();

        for (int line = 0; line < N; line++)
        {
            //For first half of star
            for(int star=0; star<N-line; star++)
                System.out.print("*\t");

            //For space in between
            for(int space=0; space<line*2-1; space++)
                System.out.print("\t");

            //For second half of star
            for(int star=0; star<N-line; star++) {
                if(star == N-1)
                    continue;
                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}