public class Grades{
    private float grade;
    private String subject;
    private float weight;

    public Grades(String a, String b, String c){
        grade = Float.parseFloat(a);
        subject = b;
        weight = Float.parseFloat(c);
    }

    public float getGrade(){
        return grade;
    }
    public String getSubject(){
        return subject;
    }
    public float getWeight(){
        return weight;
    }
}