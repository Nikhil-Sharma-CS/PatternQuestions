import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();


        for(int row=0; row<N; row++)
        {
            int var=5;
            for(int col=0; col<N; col++) {
                System.out.print(var+"\t");
                var--;
            }
            System.out.println();
        }
    }
}