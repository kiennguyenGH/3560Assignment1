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

        
        String[] tempAnswers = {"1","2"};
        SingleChoiceQuestion question1 = new SingleChoiceQuestion("What is 1+1?", tempAnswers);

        question1.displayQuestion();
        VotingService iVote = new VotingService(students, question1);
        for (Student i : students.values())
        {
            i.generateSingleChoiceAnswer();
        }
        iVote.getSingleChoiceSubmissions();
        iVote.displayAnswers();
       

        String[] tempAnswers2 = {"1","2","3","4","5"};
        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("How big is the number 5?", tempAnswers2);
        question2.displayQuestion();
        
        VotingService iVote2 = new VotingService(students, question2);
        for (Student i : students.values())
        {
            i.generateMultipleChoiceAnswer(question2);
        }
        iVote2.getMultipleChoiceSubmissions();
        iVote2.displayMultipleAnswers();

    }
}
