public class SingleChoiceQuestion implements Question{

    private String question;
    private String[] answers = new String[2];
    

    public SingleChoiceQuestion(String question)
    {
        this.question = question;
    }

    @Override
    public void displayQuestion() {
        System.out.println(question);
        System.out.println("1. " + answers[0]);
        System.out.println("2. " + answers[1]);
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
        return 2;
    }

    //If more than 2 answers are given, only the first 2 are taken
    @Override
    public void setAnswers(String[] answers)
    {
        this.answers[0] = answers[0];
        this.answers[1] = answers[1];
    }
    
}
