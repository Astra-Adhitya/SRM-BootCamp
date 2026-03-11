import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,miles;
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();
        miles = km * 1.60934;
        System.out.println("The total miles is " + miles + " mile for the given " + km);
    }
}
