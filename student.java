import java.util.Scanner;

public class student {

    void add(int a, int b)
    {
        int add = a +b;
        System.out.println("The sum is :"+" "+add);
    }
    void sub(int a, int b)
    {
        int sub = a -b;
        System.out.println("The sub is :"+" "+sub);
    }
    void mul(int a, int b)
    {
        int mul = a *b;
        System.out.println("The mul is :"+" "+mul);
    }
    void div(int a, int b)
    {
        int div = a /b;
        System.out.println("The div is :"+" "+div);
    }
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        student obj = new student();
        System.out.println("Enter the numbers :");
        int a = s.nextInt();
        int b = s.nextInt();
        obj.sub(a, b);
        obj.mul(a , b);
        obj.div(a , b);
        obj.add(a , b);
    }
    }