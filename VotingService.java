import java.util.HashMap;

public class VotingService{
    
    private int[] singleAnswer = {0, 0};
    private int[] multipleAnswer;
    private int numAnswers;
    private SingleChoiceQuestion singleChoiceQuestion;
    private MultipleChoiceQuestion multipleChoiceQuestion;
    private HashMap<String, Student> studentList = new HashMap<String, Student>();

    public VotingService(HashMap<String, Student> list, SingleChoiceQuestion question)
    {
        studentList = list;
        singleChoiceQuestion = question;
        numAnswers = singleChoiceQuestion.getNumAnswers();
    }

    public VotingService(HashMap<String, Student> list, MultipleChoiceQuestion question)
    {
        studentList = list;
        multipleChoiceQuestion = question;
        numAnswers = question.getNumAnswers();
        multipleAnswer = new int[multipleChoiceQuestion.getNumAnswers()];
        for (int i = 0; i < multipleAnswer.length; i++)
        {
            multipleAnswer[i] = 0;
        }
    }

    public void getSingleChoiceSubmissions()
    {
        for (Student student: studentList.values())
        {
            singleAnswer[student.getSingleChoiceAnswer()-1]++;
        }
    }

    public void getMultipleChoiceSubmissions()
    {
        for (Student student: studentList.values())
        {
            for (int i = 0; i < student.getMultipleChoiceAnswer().length; i++)
            {
                multipleAnswer[student.getMultipleChoiceAnswer()[i]-1]++;
            }
        }
    }

    public int[] getSingleChoiceAnswer()
    {
        return singleAnswer;
    }

    public int[] getMultipleChoiceAnswer()
    {
        return multipleAnswer;
    }
    
    public int getNumAnswers()
    {
        return numAnswers;
    }

    public void displayAnswers()
    {
        System.out.println("Student answers: ");
        System.out.println("1. " + singleAnswer[0]);
        System.out.println("2. " + singleAnswer[1]);
        System.out.println();
    }

    public void displayMultipleAnswers()
    {
        System.out.println("Student answers: ");
        for (int i = 0; i < multipleAnswer.length; i++)
        {
            
            System.out.println((i + 1) + ": " + multipleAnswer[i]);
        }
        System.out.println();
    }

}
