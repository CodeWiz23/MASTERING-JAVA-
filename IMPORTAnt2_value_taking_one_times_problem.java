import java.util.Scanner;

public class IMPORTAnt2_value_taking_one_times_problem {

    // Constructor to display team member details
    public IMPORTAnt2_value_taking_one_times_problem(String name, int sec, int intake, int id) {
        System.out.println("Welcome Team Member:");
        System.out.println("Name: " + name);
        System.out.println("Section: " + sec);
        System.out.println("Intake: " + intake);
        System.out.println("ID: " + id); //
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Arrays to store details of two team members
        String[] names = new String[2];
        int[] sections = new int[2];
        int[] intakes = new int[2];
        int[] ids = new int[2];

        // Collect details for two team members
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter name, section, intake, and ID:");
            names[i] = s.nextLine(); // Read name
            sections[i] = s.nextInt(); // Read section
            intakes[i] = s.nextInt(); // Read intake
            ids[i] = s.nextInt(); // Read ID
            s.nextLine(); // Consume the leftover newline
        }

        // Display details of both team members together
        System.out.println("\nTeam Members Details:");
        for (int i = 0; i < 2; i++) {
           IMPORTAnt2_value_taking_one_times_problem obj= new IMPORTAnt2_value_taking_one_times_problem(names[i], sections[i], intakes[i], ids[i]);
        }
    }
}
