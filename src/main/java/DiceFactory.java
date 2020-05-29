import java.util.ArrayList;

public class DiceFactory {
    private static ArrayList<Integer> value;
    private static int sides;

    DiceFactory(int sides){
        this.sides = sides;
        value = new ArrayList<Integer>();
    }

   public void makeDice(){
       for (int i = 1; i <= sides; ++i) {
           value.add(i);
       }
       System.out.println("Die : " + value);
   }
}
