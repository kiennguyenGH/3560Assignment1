public class MultipleChoiceQuestion implements Question{

    private String question;
    private String[] answers;
    private int numAnswers;

    public MultipleChoiceQuestion(String question, String[] answers)
    {
        this.question = question;
        this.answers = answers;
        numAnswers = answers.length;
        
    }

    @Override
    public void displayQuestion() {
        System.out.println(question);
        for (int i = 1; i < answers.length + 1; i++)
        {
            System.out.println(i + ". " + answers[i-1]);
        }
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public String getQuestion()
    {
        return question;
    }

    @Override
    public int getNumAnswers() {
        return numAnswers;
    }
    
}
