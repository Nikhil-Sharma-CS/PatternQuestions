import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();


        //For first half of the pattern
        for (int line = 0; line < N; line++) {
            //For stars
            for(int stars=0; stars<=line; stars++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

        //For second half
        for(int line = N-1; line>0; line--)
        {
            for(int stars=0; stars<line; stars++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}