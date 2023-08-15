import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();

        for(int line=0; line<N; line++)
        {
            int var=1;
            //For Space
            for(int space=0; space<N-line-1; space++)
                System.out.print("\t");

            for(int num=0; num<line*2+1; num++) {
                System.out.print(var + "\t");
                var++;
            }
            System.out.println();
        }
    }
}