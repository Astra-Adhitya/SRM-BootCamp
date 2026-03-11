import java.lang.Math;
public class Question7 {
    public static void main(String[] args) {
        int rad_in_km = 6378 ;
        double rad_in_miles = rad_in_km * 1.6 ; 
        System.out.println("The Volume of earth in cubic kilometers is " + (4.0/3.0) * Math.PI * Math.pow(rad_in_km, 3) + " and cubic miles is " + (4.0/3.0) * Math.PI * Math.pow(rad_in_miles, 3));
    }
}
