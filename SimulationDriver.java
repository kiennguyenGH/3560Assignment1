import java.util.*;

public class SimulationDriver {
    public static void main(String[] args)
    {
        // Create 30 students
        HashMap<String, Student> students = new HashMap<String, Student>();
        for (int i = 0; i < 30; i++)
        {
            Student newStudent = new Student();
            students.put(newStudent.getID(), newStudent);
        }

        SingleChoiceQuestion question1 = new SingleChoiceQuestion("What is 1+1?");
        String[] tempAnswers = {"1","2"};
        question1.setAnswers(tempAnswers);
        VotingService iVote = new VotingService(students, question1);
        for (Student i : students.values())
        {
            i.generateSingleChoiceAnswer();
        }
        iVote.getSingleChoiceSubmissions();
        iVote.displayAnswers();
        // for (Student i : students.values())
        // {
        //     System.out.println(i.getSingleChoiceAnswer());
        // }

        String[] tempAnswers2 = {"1","2","3","4","5"};
        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("Who dunnit?", tempAnswers2);
        
        for (Student i : students.values())
        {
            i.generateMultipleChoiceAnswer(question2);
        }
        // for (Student i : students.values())
        // {
        //     for (int k = 0; k < i.getMultipleChoiceAnswer().length; k++)
        //     {
        //         System.out.print(i.getMultipleChoiceAnswer()[k]);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
            
        // }

    }
}
