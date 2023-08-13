import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();


        for (int line = 0; line < N; line++) {
            if(line==0 || line == N-1)
            {
                for(int stars=0; stars<N; stars++)
                    System.out.print("*\t");
            }
            else {

                System.out.print("*\t");

                for (int space = 0; space < N - 2; space++)
                    System.out.print("\t");

                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}