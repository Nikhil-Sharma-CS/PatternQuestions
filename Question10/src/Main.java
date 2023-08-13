import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();

        int var = 2*N-1;
        for (int line = 0; line < N; line++){
            //For spaces
            for(int space=0; space<line; space++)
                System.out.print("\t");

            //For stars
            for(int stars=var; stars>0; stars--)
                System.out.print("*\t");
            var-=2;
            System.out.println();
        }
    }
}