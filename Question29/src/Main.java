import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();
        int var=1;

        for(int line=0; line<N; line++)
        {
            //For Space
            for(int space=0; space<N-line-1; space++)
                System.out.print("\t");

            for(int num=0; num<line*2+1; num++) {

                if(num==0 || num == line*2)
                    System.out.print(var + "\t");
                else
                    System.out.print(0+"\t");
            }
            System.out.println();
            var++;
        }
    }
}