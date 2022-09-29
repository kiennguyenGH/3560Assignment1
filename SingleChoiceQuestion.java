public class SingleChoiceQuestion implements Question{

    private String question; //Question asked to students
    private String[] answers = new String[2]; //Single choice answers, only 1 or the other can be chosen
    

    public SingleChoiceQuestion(String question, String[] answers)
    {
        this.question = question;
        this.answers[0] = answers[0];
        this.answers[1] = answers[1];
    }

    //Prints the question and 2 possible answers
    @Override
    public void displayQuestion() {
        System.out.println(question);
        System.out.println("1. " + answers[0]);
        System.out.println("2. " + answers[1]);
        System.out.println();
    }

    //Getter and setter methods for single choice question
    public void setQuestion(String question)
    {
        this.question = question;
    }

    public String getQuestion()
    {
        return question;
    }

    //Only 2 answers are possible
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
