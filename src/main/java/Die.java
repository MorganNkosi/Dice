import java.util.Random;

public class Die {
    int sides;
    int value;
    int probabilities[];

    public Die(int sides, int probabilities[]){
        this.sides = sides;
        int sumArray = 0;

        for (int i = 0; i < probabilities.length ; i++)
        {
            sumArray += probabilities[i];
        }
        for (int x = 0; x < probabilities.length ; x++)
        {
            if (probabilities[x] < 0)
            {
                System.out.println("negative probabilities not allowed");
            } else if (sumArray < 1)
            {
                System.out.println("probability sum must be greater than 0");
            }else if (probabilities[x] != (int)probabilities[x])
            {
                System.out.println("only integer values allowed");
            }
        }
        setProbabilities(probabilities);
    }


    public int roll(){
       Random v = new Random();
       value = v.nextInt(sides);
       return value;
    }

    public static void setProbabilities(int probabilities[])
    {
        for (int i = 0; i < probabilities.length ; i++)
        {
            probabilities[i] = probabilities[i];
        }
    }




}
