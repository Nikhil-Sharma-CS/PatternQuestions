import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();

        for(int line=0; line<N; line++)
        {
            int var=0;
            //For Space
            for(int space=0; space<N-line-1; space++)
                System.out.print("\t");

            int limit = line*2+1;

            for(int num=0; num<limit; num++) {

                if(num>limit/2)
                    var--;
                else
                    var++;

                System.out.print(var + "\t");
            }
            System.out.println();
        }
    }
}