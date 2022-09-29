
public class VotingService{

    private int[] answers;
    private int numAnswers;

    public int getNumAnswers()
    {
        return numAnswers;
    }

    public void displayAnswers()
    {
        for (int i = 0; i < answers.length; i++)
        {
            System.out.println("Student answers: ");
            System.out.println((i + 1) + ": " + answers[i]);
        }
    }

}
