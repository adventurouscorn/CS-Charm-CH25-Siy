import java.util.*;

public class GradesHandler{
    ArrayList<Grades> gradesList = new ArrayList<Grades>();

    public void addGrade(Grades a){
        gradesList.add(a);
    }

    public void showGrades(){
        for (Grades grade : gradesList){
            System.out.printf("You have a grade of %.2f with a unit of %.1f in the subject of %s \n", grade.grade, grade.weight, grade.subject);
        }
    }
    
    public void findAverageAndFailing(){
        float average = 0;
        float averageDivisor = 0;
        boolean failing = false;
        for (Grades grade : gradesList) {
            average += grade.grade*grade.weight;
            averageDivisor += grade.weight;
            if (grade.grade < 50){
                failing = true;
            }
        }
        average = average/averageDivisor;
        if (average < 70){
            failing = true;
        }

        System.out.println(String.format("Your average is %.2f", average));
        System.out.println("Are you failing?: " + failing);
    }

    public void findMinimum(){
        float minimumGrade = 101;
        String minimumGradeName = "";
        for (Grades grade : gradesList) {
            if (grade.grade < minimumGrade){
                minimumGrade = grade.grade;
                minimumGradeName = grade.subject;
            }
        }
        System.out.printf("Your minimum grade is in %s with a Grade of: %.2f \n", minimumGradeName, minimumGrade);
    }

    public void findMaximum(){
        float maximumGrade = -1;
        String maximumGradeName = "";
        for (Grades grade : gradesList) {
            if (grade.grade > maximumGrade){
                maximumGrade = grade.grade;
                maximumGradeName = grade.subject;
            }
        }
        System.out.printf("Your maximum grade is in %s with a Grade of: %.2f \n", maximumGradeName, maximumGrade);
    }

    public void standardProcedure(){
        showGrades();
        findAverageAndFailing();
        findMinimum();
        findMaximum();
    }

  
  
}