import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();
        int var = 0;

        for (int line = 0; line < N; line++) {

            //For spaces
            for(int space=0; space<N-line-1; space++)
                System.out.print("\t");

            //For stars
            for(int stars=0; stars<=line+var; stars++)
            {
                if(stars%2==0)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            var++;
            System.out.println();
        }
    }
}