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
        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("How many digits is the number 5?", tempAnswers2);
        question2.displayQuestion();
        
        VotingService iVote2 = new VotingService(students, question2);
        for (Student i : students.values())
        {
            i.generateMultipleChoiceAnswer(question2);
        }
        iVote2.getMultipleChoiceSubmissions();
        iVote2.displayMultipleAnswers();

        String[] tempAnswers3 = {"1984","Lord of the Flies","Fahrenheit 451","Animal Farm"};
        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("Which books did George Orwell write?", tempAnswers3);
        question3.displayQuestion();
        
        VotingService iVote3 = new VotingService(students, question3);
        for (Student i : students.values())
        {
            i.generateMultipleChoiceAnswer(question3);
        }
        iVote3.getMultipleChoiceSubmissions();
        iVote3.displayMultipleAnswers();

        String[] tempAnswers4 = {"red","yellow","blue"};
        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("What are the possible colors of the sky?", tempAnswers4);
        question4.displayQuestion();
        
        VotingService iVote4 = new VotingService(students, question4);
        for (Student i : students.values())
        {
            i.generateMultipleChoiceAnswer(question4);
        }
        iVote4.getMultipleChoiceSubmissions();
        iVote4.displayMultipleAnswers();

        String[] tempAnswers5 = {"True","False"};
        SingleChoiceQuestion question5 = new SingleChoiceQuestion("What is the shape of the Earth?", tempAnswers5);
        question5.displayQuestion();
        
        VotingService iVote5 = new VotingService(students, question2);
        for (Student i : students.values())
        {
            i.generateSingleChoiceAnswer();
        }
        iVote5.getSingleChoiceSubmissions();
        iVote5.displayAnswers();

    }
}
