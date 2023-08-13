import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();

        for(int line = 0; line <N; line++)
        {
            //For spaces
            for(int space=0; space<N-line-1; space++)
                System.out.print("\t");
            //For stars
            for(int star=0; star<=line; star++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}