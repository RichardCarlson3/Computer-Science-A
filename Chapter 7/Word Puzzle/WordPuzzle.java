public class WordPuzzle {
    
    private Box [][] puzzle;


    public boolean toBeLabeled(int r, int c, boolean [][] blackBoxes){
        if(blackBoxes[r][c]) return false;
        if(r==0||c==0) return true;
        if((blackBoxes[r-1][c])||(blackBoxes[r][c-1]))return true;
        else return false;

    }

    /* Write the WordPuzzle Constructor.  The constructor should initialize the
    puzzle grid to have the same dimensions as the parameter blackBoxes.
    Each element of the puzzle grid should be initialized with a
    reference to a Box object with the appropriate color and number.
    The number is positive if the box is labeled and 0 if the box is not
    labeled.
     */
    /** Constructs a Word Puzzle grid.
     * Precondition: There is at least one row in blackBoxes
     * Postcondition:
     * - The puzzle grid has the same dimensions as blackBoxes.
     * - The Box object at row r, column c, in the word puzzle grid
     * is black if and only if blackBoxes[r][c] is true.
     * - The boxes in the puzzle are labeled according to the word
     * puzzle labeling rule.
     * @param blackBoxes - a 2D array of Boxes
     */
    public WordPuzzle(boolean [][] blackBoxes){
        puzzle = new Box[blackBoxes.length][blackBoxes[0].length]; 
        int a = 1;
        for(int c = 0; c < blackBoxes.length; c++){ 
            for(int b = 0; b < blackBoxes[0].length; b++){ 
                if(toBeLabeled(c,b,blackBoxes)){
                    puzzle[c][b] = new Box(blackBoxes[c][b],a); 
                    a++; 
                }    
                else{
                    puzzle[c][b] = new Box(blackBoxes[c][b],0);
                }
            }
        }	
    }


    public String toString(){
        String s = "";
        for(int r =0; r < puzzle.length; r++){
            for(int c = 0; c < puzzle[0].length; c++){
                s += puzzle[r][c].toString();
            }
            s += "\n";
        }
        return s;
    }


    public static void main(String[] args){
		/* represents the word puzzle in the example */
        boolean[][]blackBoxes = {
                {true,false,false,true,true,true,false,false,false},
                {false,false,false,false,true,false,false,false,false},
                {false,false,false,false,false,false,true,true,true},
                {false,false,true,false,false,false,true,false,false},
                {true,true,true,false,false,false,false,false,false},
                {false,false,false,false,true,false,false,false,false},
                {false,false,false,true,true,true,false,false,true}};

        WordPuzzle wp = new WordPuzzle(blackBoxes);
        System.out.println(wp);
    }
}