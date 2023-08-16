import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int N = S.nextInt();

        for(int line=0; line<N; line++)
        {
            int var=line;
            //For spaces
            for(int space=0; space<N-line-1; space++)
                System.out.print("\t");

            //For nums
            for(int num=0; num<line*2+1; num++)
            {
                if(num>(line*2+1)/2)
                    var--;
                else
                    var++;
                System.out.print(var + "\t");
            }

            System.out.println();
        }
    }
}