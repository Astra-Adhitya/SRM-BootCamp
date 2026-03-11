import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height;
        System.out.print("Enter the height: ");
        height = input.nextInt();
        double in_inch = height * (1.0/2.54);
        double in_feet = in_inch / 12;
        System.out.println("Your Height in cm is " + height + " while in feet is " + in_feet + " and inches is " + in_inch);
    }
}
