import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N =S.nextInt();
        int var=0;
        //For first half
        for(int line=0; line<N/2; line++)
        {
            //For first half of stars
            for(int stars=0; stars<N/2-line; stars++)
                System.out.print("*\t");

            //For space in between
            for(int space=0; space<=line*2; space++)
                System.out.print("\t");

            //For second half of stars
            for(int stars=0; stars<N/2-line; stars++)
                System.out.print("*\t");
            System.out.println();
        }
        System.out.println();

        //For second half
        for(int line=0; line<N/2; line++)
        {
            //For first half of stars
            for(int star=0; star<line+1; star++)
                System.out.print("*\t");

            //For space in between
            for(int space=0; space<N-2-var; space++)
                System.out.print("\t");

            //For second half of stars
            for(int star=0; star<line+1; star++)
                System.out.print("*\t");
            var+=2;
            System.out.println();
        }
    }
}