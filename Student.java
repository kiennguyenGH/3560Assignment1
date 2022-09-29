public class Student {
    private String id; //Unique ID to student
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

    public void setMultipleChoiceAnswer(int[] answers)
    {
        this.answers = answers;
    }
    
    public int[] getMultipleChoiceAnswer()
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

    // Generate a 9 digit ID for student
    private int generateID()
    {
        int num = 0;
        for (int i = 0; i < 9; i++)
        {
            num += (((int)(Math.random()*9) + 1) * (int)Math.pow(10,i));
        }
        return num;
    }

    //Generates a random answer between 1 or 2
    public void generateSingleChoiceAnswer()
    {
        int num = (int)(Math.random()*2) + 1;
        setSingleChoiceAnswer(num);
    }

    /*
     * First generates a random number between 1 to question.getNumAnswers (numAns)
     * 
     * Then generates numAns amount of answers
     * 
     */
    public void generateMultipleChoiceAnswer(MultipleChoiceQuestion question)
    {
        
        int numAns = (int)(Math.random()*(question.getNumAnswers())) + 1;
        answers = new int[numAns];
        for (int i = 0; i < numAns; i++)
        {
            int temp = (int)(Math.random()*(question.getNumAnswers())) + 1;
            for (int k = 0; k < i; k++)
            {
                if (answers[k] == temp)
                {
                    temp = (int)(Math.random()*(question.getNumAnswers())) + 1;
                    k = -1;
                }
            }
            answers[i] = temp;
        }
    }

}
