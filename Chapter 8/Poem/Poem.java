public class Poem {
    private int numLines;

    public Poem(){
        numLines=0;
    }

    public Poem(int lines){
        numLines=lines;
    }
    public int getNumLines(){
        return numLines;
    }
    public void printRhythm(){
        System.out.println("Free Verse!");
    }
    public void specialRhythm(int syllables){
        for(int j=syllables;j>0;j--){
            if(j==syllables) System.out.print("ta");
            else{
                System.out.print("-ta");
            }
        }
        System.out.println();
        
        
    }
    
}