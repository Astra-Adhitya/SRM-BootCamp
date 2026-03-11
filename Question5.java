public class Question5 {
    public static void main(String[] args) {
        int totl_pens = 14 , students = 3 ;
        int pens_per_student = totl_pens / students ;
        int remaining_pens = totl_pens % students ;
        System.out.println("The Pen Per Student is " + pens_per_student + " and the remaining pen not distributed is " + remaining_pens);
    }
}
