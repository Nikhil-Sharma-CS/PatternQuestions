import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();

        for(int i=0; i<N; i++) {
            for (int star=0; star<N; star++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}