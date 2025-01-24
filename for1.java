import java.util.Scanner;

public class for1 {
    public static void main (String []args)
    {


        System.out.println("Enter number to print the next 10 ahead of it :");

        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();

        for (int i =0;i<10;i++) {

            System.out.println(a+i);
        }



    }



}
