import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double salaryPerHour = 150;
        double salaryOvertimePerHour = 250;

        double taxes = 0.7;
        double taxesOvertime = 0.8;

        double salary =0;
        double overtime;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many hours did you work last month?");
        double hours = sc.nextInt();

        if (hours <= 0 || hours > 350){
            System.out.println("Invalid input, hours must be more than 0 and less than 350.");
            System.exit(0);
        }
        if (hours <= 160){
            salary = salaryPerHour * hours * taxes;
        }
        else if (hours > 160) {
            overtime = hours - 160;
            salary = (salaryPerHour * 160) * taxes + (salaryOvertimePerHour * overtime) * taxesOvertime;
        }
        System.out.println("Your salary after taxes is: " + salary);

    }
}