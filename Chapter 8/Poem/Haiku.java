public class Haiku extends Poem {

    public Haiku(){
        super(3);
}
    public int getSyllables(int k){
        if(k%2==0) return 7;
        else return 5;
}
    public void printRhythm(){
        for(int i=1;i<=getNumLines();i++)specialRhythm(getSyllables(i));
    }
}
    
   