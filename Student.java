public class Student {
    private String id;
    private int answer; //Single-Choice Answer
    private int[] answers; //Multiple-Choice Answers

    public Student()
    {
        id = String.valueOf(generateID());
    }

    public void setSingleChoiceAnswer(int answer)
    {
        this.answer = answer;
    }

    public int getSingleChoiceAnswer()
    {
        return answer;
    }

    public void setMultipleChoiceAnswers(int[] answers)
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

    private int generateID()
    {
        int num = 0;
        for (int i = 0; i < 10; i++)
        {
            num += (((int)(Math.random()*8) + 1) * (int)Math.pow(10,i));
        }
        return num;
    }

    public void generateSingleChoiceAnswer()
    {
        int num = (int)(Math.random()) + 1;
        setSingleChoiceAnswer(num);
    }

    public void generateMultipleChoiceAnswer(MultipleChoiceQuestion question)
    {
        int numAns = (int)(Math.random()*(question.getNumAnswers()-1)) + 1;
        for (int i = 0; i < numAns; i++)
        {
            answers[i] = (int)(Math.random()*(question.getNumAnswers()-1)) + 1;
        }
    }

}
