import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); //this makes user input possible
      
        //collects grade percentage data and stores in an array
        System.out.println("What are your grade percentages? Separate by spaces:");
        String[] Grades = scan.nextLine().split(" "); //make an array out of the input by getting an element and choosing the next element after the next space

        //collects subject data and stores in an array
        System.out.println("Subjects for these grades respectively? Separate by spaces:");
        String[] subjects = scan.nextLine().split(" ");

        //collects weight data and stores in an array
        System.out.println("What are the units for these subjects respectively? Separate by spaces:");
        String[] Weight = scan.nextLine().split(" ");

        //variable declaration
        int lowestGradeIndex = 0;
        int averageDivisor=0;
        int average = 0;
        String failing = "No";


        //this for loop simultaneously gets the average of the grades, the lowest grade, and if the student is failing
        for (int i = 0; i < Grades.length; i++){
            int intGrade = Integer.parseInt(Grades[i]); //Integer.parseint turns str into int
            int otherGrade = Integer.parseInt(Grades[lowestGradeIndex]);

            //average calculation
            average += intGrade*(Float.parseFloat(Weight[i]));
            averageDivisor+= Float.parseFloat(Weight[i]); //the divisor should not be amount of items but rather and sum of the weights of each item

            //gets lowest grade
            if (intGrade < otherGrade){
                lowestGradeIndex=i;
            }

            //checks if you're failing
            if (intGrade < 50){
                failing = "Yes";
            }
        }

        //final average and failing computation
        average = average/averageDivisor;
        if (average < 70){
            failing = "Yes";
            }

        //this for loop prints out put information on each subject
        for (int i=0; i < Grades.length; i++){
            System.out.println("You have a grade of " + Grades[i] + " (Unit of " + Weight[i] + ") in " + subjects[i]);
        }

        //the rest prints out the average, the lowest grade, and the failing status
        System.out.println("Your average is: " + average);
        System.out.println("Your lowest subject is: " + subjects[lowestGradeIndex] + " With a Grade of: " + Grades[lowestGradeIndex]);
        System.out.println("Are you Failing? " + failing);
    }
}

