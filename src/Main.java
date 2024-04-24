import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Grade Score Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Score(out of 100): ");
        int courseLevel;
        for(courseLevel = 1;courseLevel<=7;courseLevel++ ) {
            int courseScore = 0;
            courseScore = input.nextInt();

            //this code validate the input as inatakiwa iwe mwisho 100
            while(courseLevel < 0 || courseScore >100) {
                    System.out.println("Please Enter Correct Score(Out of 100): " + courseScore);
            }

        }




    }
    public static gradeCalculator(){

    }

}