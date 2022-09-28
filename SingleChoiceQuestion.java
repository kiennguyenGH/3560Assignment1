public class SingleChoiceQuestion implements Question{

    private String question;
    private String[] answers;
    private final int numAnswers = 2;

    public SingleChoiceQuestion(String question)
    {
        this.question = question;
    }

    @Override
    public void displayQuestion() {
        System.out.println(question);
        System.out.println("1. " + answers[0]);
        System.out.println("2. " + answers[1]);
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
