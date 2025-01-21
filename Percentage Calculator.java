import java.util.Scanner;

public class test1 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject NO 1 Mark :");
        int a = sc.nextInt();
        System.out.println("Enter Subject NO 2 Mark :");
        int b = sc.nextInt();
        System.out.println("Enter Subject NO 3 Mark :");
        int c = sc.nextInt();
        System.out.println("Enter Subject NO 4 Mark :");
        int d = sc.nextInt();
        System.out.println("Enter Subject NO 5 Mark :");
        int e = sc.nextInt();

        int sum = a+b+c+d+e;
        double per = (sum/500.0)*100.0;
        System.out.println("Percentage is : "+ per);
      
    }

}
