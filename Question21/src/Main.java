import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int N = S.nextInt();

        for (int line = 0; line < N; line++)
        {
            //For first half of star
            for(int star=0; star<line+1; star++)
                System.out.print("*\t");

            //For space in between
            for(int space=0; space<(N*2-3)-line*2; space++)
                System.out.print("\t");

            //For second half of star
            for(int star=0; star<line+1; star++) {
                if(star ==  N-1)
                    break;
                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}