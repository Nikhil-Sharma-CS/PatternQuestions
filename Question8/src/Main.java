import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();
        int var=0;
        //For first half
        for (int line = 0; line < N/2; line++) {

            //For spaces
            for(int space=0; space<line; space++)
                System.out.print("\t");

            //For stars
            for(int star=0; star<N-line*2; star++) {
                if(star==0 || star==N-line*2-1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }

        //For second half
        for(int line=0; line<N/2+1; line++)
        {
            //For spaces
            for(int space=0; space<N/2-line; space++)
                System.out.print("\t");

            //For stars
            for(int star=0; star<line*2+1; star++) {
                if (star == 0 || star == line * 2)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            var++;
            System.out.println();
        }
    }
}