import java.util.Random;

public class Die {
    int sides;
    public Die(int sides){
        this.sides = sides;
    }

    public int roll(){
       int value;
       Random v = new Random();
       value = v.nextInt(sides);
       return value;
    }




}
