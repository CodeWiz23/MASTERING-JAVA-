import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Write your name :");
        String a = sc.nextLine();
        System.out.println("Please Write your Gender :");
        String b = sc.nextLine();
        System.out.println("Please Write your age :");
        int c = sc.nextInt();
        String d = "Male";
        String e = "Female";

        if (b.equals(d) && c > 18 ){
            System.out.println("Welcome Mr." + a+" "+"To our Party!");
        } else if (b.equals(e)&& c>18){
            System.out.println("Welcome Ms." +a +" "+"To our Party!");
        }
          else{
            System.out.print("Sorry Under 18 are not Allowed !");
}
       }
}