
public class all_alphabets {

    public static void main(String[]args) {
        char a = 'a';
        char b = 'A';

        System.out.println("Here are all Small Alphabets : ");

        for (int i = 0; i < 26; i++) {

            System.out.println(a++);

        }
        System.out.println("Here are all Capital Alphabets : ");

        for (int i = 0; i < 26; i++) {

            System.out.println(b++);

        }
        
    }
}
