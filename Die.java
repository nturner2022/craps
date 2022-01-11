public class Die{

    public int dieRoll(){ //rolls the dice
        int firstRoll = (int)Math.random()*6 + 1;
        int secondRoll = (int)Math.random()*6 + 1;
        return firstRoll+secondRoll;
    }

}