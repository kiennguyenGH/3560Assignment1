public class MultipleChoiceQuestion implements Question{

    private String question;
    private String[] answers;
    private int numAnswers;
    private final int MAX_NUM_ANSWERS = 10;

    public MultipleChoiceQuestion(String question, String[] answers)
    {
        this.question = question;
        this.answers = answers;
        if (answers.length > 10)
        {
            numAnswers = MAX_NUM_ANSWERS;
        }
        else numAnswers = answers.length;
        
    }

    @Override
    public void displayQuestion() {
        System.out.println(question);
        for (int i = 1; i < answers.length + 1; i++)
        {
            System.out.println(i + ". " + answers[i-1]);
        }
        System.out.println();
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

    @Override
    public void setAnswers(String[] answers) {
        for (int i = 0; i < this.answers.length; i++)
        {
            this.answers[i] = answers[i];
        }
        
    }
    
}
