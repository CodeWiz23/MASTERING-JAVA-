

public class constructorbasic {

    int add; // always fix variable int or flote to use it any where in the class
    int sub;
    int mul;
    int div;
    public constructorbasic(int a, int b){

        add = a +b; //no int for used up

        sub = a -b;


         mul = a *b;


         div = a /b;

    }

    void display () {
        System.out.println("The sum is :" + " " + add);
        System.out.println("The sub is :" + " " + sub);
        System.out.println("The mul is :" + " " + mul);
        System.out.println("The div is :" + " " + div);
    }

    public static void main(String[]args) {

        constructorbasic obj = new constructorbasic(5,5); // its passing value on the paramitter on line 9 as a constructor call and the value
        // returend returend after all line executed on that constructor and stored in (obj)
        obj.display(); // to show the value calling the display function





    }
}