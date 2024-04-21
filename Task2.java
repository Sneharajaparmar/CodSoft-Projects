import java.util.Scanner;
public class Task2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of subjects :");
        int numSub = sc.nextInt();
        if(numSub<=0){
            System.out.println("please enter avalid number :");
            return;
        }
        int totalMarks = 0;
        int maxMarksPerSubject = 100;
        for(int i= 1;i<=numSub;i++){
            System.out.println("Enter marks obtained in subject "+ i + "(out of 100) :");
            int marks = sc.nextInt();
            if(marks < 0 || marks > maxMarksPerSubject){
                System.out.println("Marks should be in range of 0 to 100. Please enter valid marks :");
                i--;
            }
            else{
                totalMarks += marks;
            }
        }
        double avgPercentage = (double) totalMarks/(numSub * maxMarksPerSubject)*100; 
        System.out.println("Total Marks :"+ totalMarks);
        System.out.println("Average Percentage :"+ avgPercentage + "%");

        String grade;
        if(avgPercentage>=90){
            grade = "A";
        }
        else if(avgPercentage>=80){
            grade = "B";
        }
        else if(avgPercentage>=65){
            grade = "C";
        }
        else if(avgPercentage>=50){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.println("Grade :"+ grade);
    }
}