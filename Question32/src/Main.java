import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Please enter a number : ");

        int N = S.nextInt();

        for(int row=0; row<N; row++)
        {
            for(int col=0; col<row*2+1; col++)
            {
                if(col%2!=0)
                    System.out.print("* ");
                else
                    System.out.print(row+1 + " ");
            }
            System.out.println();
        }

        for(int row=N-2; row>-1; row--)
        {
            for(int col=0; col<row*2+1; col++)
            {
                if(col%2!=0)
                    System.out.print("* ");
                else
                    System.out.print(row+1 + " ");
            }
            System.out.println();
        }
    }
}