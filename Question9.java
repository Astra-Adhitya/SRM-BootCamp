import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fee, discountPercent;
        System.out.print("Enter the original fee: ");
        fee = input.nextInt();
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextInt();
        double discount = (double) fee * discountPercent / 100;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    } 
}

