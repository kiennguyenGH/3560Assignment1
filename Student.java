public class Student {
    private String id;
    private int answer; //Single-Choice Answer
    private int[] answers; //Multiple-Choice Answers

    public Student(String id)
    {
        this.id = id;
    }

    public void setAnswers(int[] answers)
    {
        this.answers = answers;
    }

    public int[] getAnswers()
    {
        return answers;
    }

    public void setID(String id)
    {
        this.id = id;
    }
    
    public String getID()
    {
        return id;
    }
}
