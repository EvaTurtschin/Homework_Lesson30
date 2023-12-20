package homework;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Написать программу, которая при вводе с клавиатуры дня недели отвечает на вопрос
         является ли этот день выходным. (true/false) Использовать Enum !*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of a week, and I'll tell you if it is a Day Off (Weekend): ");
        String scan = scanner.nextLine();

        for (DaysOfAWeek weekDay : DaysOfAWeek.values()) {
            if (scan.equalsIgnoreCase(weekDay.name())){
                System.out.println("It is "+ weekDay.getDayOff()+" that "+scan+" is a Day Off.");
                break;
            }
        }
    }
}