import java.util.*;

public class GradesHandler{ //this class handles the Grades objects
    private ArrayList<Grades> gradesList = new ArrayList<Grades>();

    public void addGrade(Grades a){ //adding to an ArrayList
        gradesList.add(a);
    }

    public void showGrades(){ //displays the info Input by the user into a more condensed form
        for (Grades grade : gradesList){
            System.out.printf("You have a grade of %.2f with a unit of %.1f in the subject of %s \n", grade.getGrade(), grade.getWeight(), grade.getSubject());
        }
    }
    
    public void findAverageAndFailing(){ //looks for the average and checks if the user is failing
        float average = 0;
        float averageDivisor = 0;
        boolean failing = false;
        for (Grades grade : gradesList) {
            average += grade.getGrade()*grade.getWeight();
            averageDivisor += grade.getWeight();
            if (grade.getGrade() < 50){
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
            if (grade.getGrade() < minimumGrade){
                minimumGrade = grade.getGrade();
                minimumGradeName = grade.getSubject();
            }
        }
        System.out.printf("Your minimum grade is in %s with a Grade of: %.2f \n", minimumGradeName, minimumGrade);
    }

    public void findMaximum(){
        float maximumGrade = -1;
        String maximumGradeName = "";
        for (Grades grade : gradesList) {
            if (grade.getGrade() > maximumGrade){
                maximumGrade = grade.getGrade();
                maximumGradeName = grade.getSubject();
            }
        }
        System.out.printf("Your maximum grade is in %s with a Grade of: %.2f \n", maximumGradeName, maximumGrade);
    }

    public void standardProcedure(){ //runs the 4 above methods so you only have to call once to get all 4
        showGrades();
        findAverageAndFailing();
        findMinimum();
        findMaximum();
    }
}