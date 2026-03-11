public class Question2 {
    public static void main(String[] args){
        int Maths = 94, Physics = 95, Chemistry = 96;
        int totalMarks = 300;
        int marksObtained = Maths + Physics + Chemistry;
        String name = "Sam";
        double percentage = (double) marksObtained / totalMarks * 100;
        System.out.println(name + "'s average mark in PCM is " + percentage + "%");
    }
}
