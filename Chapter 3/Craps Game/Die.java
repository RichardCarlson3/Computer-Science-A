public class Die {
    int number;
    public void roll(){
        number=(int)(Math.random()*6)+1;
    }
    public int getNumDots(){
        return number;
    }

    public static void main(String[] args) {
        Die die = new Die();
        die.roll();
       System.out.println(die.getNumDots());
 }

}
