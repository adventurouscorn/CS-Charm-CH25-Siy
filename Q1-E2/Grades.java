public class Grades{
    float grade;
    String subject;
    float weight;

    public Grades(String a, String b, String c){
        grade = Float.parseFloat(a);
        subject = b;
        weight = Float.parseFloat(c);
    }
}