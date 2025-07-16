public class SoccerTeam {

    private int wins;
    private int losses;
    private int ties;
    private int points;
    private static int goals;
    private static int games;

    public SoccerTeam(){
        wins=0;
        losses=0;
        ties=0;
        points=0;

    }
    public void played(SoccerTeam other, int myScore, int otherScore){
        goals+=myScore+otherScore;
        games++;
        if(myScore>otherScore){ 
            wins++;
            other.losses++;
        }
        else if(myScore<otherScore){ 
            losses++;
            other.wins++;
        }
        else{
             ties++;
             other.ties++;
        }
    }
    public int points(){
        points=wins*3+ties;
        return points;
    }
    public void reset(){
        wins=0;
        points=0;
        losses=0;
        ties=0;

    }
    public static void startTournament(){
        goals=0;
        games=0;
    }
    public static int Games(){
        return games;
    }
    public static int Goals(){
        return goals;
    }
    public static void main(String[] args){
        SoccerTeam s=new SoccerTeam();
        SoccerTeam s1= new SoccerTeam();
        SoccerTeam s2= new SoccerTeam();
        SoccerTeam s3= new SoccerTeam();

        startTournament();
        System.out.println("Tournament 1");
        s.played(s1,2,1);
        s2.played(s3,2,7);
        s3.played(s2,5,3);
        s1.played(s2,1,1);
        System.out.println("Wins: "+s.wins+"; Losses: "+s.losses+"; Ties: "+s.ties+"; Current Points "+s.points());
        System.out.println("Wins: "+s1.wins+"; Losses: "+s1.losses+"; Ties: "+s1.ties+"; Current Points "+s1.points());
        System.out.println("Wins: "+s2.wins+"; Losses: "+s2.losses+"; Ties: "+s2.ties+"; Current Points "+s2.points());
        System.out.println("Wins: "+s3.wins+"; Losses: "+s3.losses+"; Ties: "+s3.ties+"; Current Points "+s3.points());
        System.out.println("Number of Games: "+Games());
        System.out.println("Number of Goals: "+Goals());
        s.reset();
        s1.reset();
        s2.reset();
        s3.reset();
        System.out.println();

        startTournament();
        System.out.println("Tournament 2");
        s.played(s1,0,1);
        s2.played(s3,5,4);
        s3.played(s2,2,1);
        s1.played(s2,3,2);
        System.out.println("Wins: "+s.wins+"; Losses: "+s.losses+"; Ties: "+s.ties+"; Current Points "+s.points());
        System.out.println("Wins: "+s1.wins+"; Losses: "+s1.losses+"; Ties: "+s1.ties+"; Current Points "+s1.points());
        System.out.println("Wins: "+s2.wins+"; Losses: "+s2.losses+"; Ties: "+s2.ties+"; Current Points "+s2.points());
        System.out.println("Wins: "+s3.wins+"; Losses: "+s3.losses+"; Ties: "+s3.ties+"; Current Points "+s3.points());
        System.out.println("Number of Games: "+Games());
        System.out.println("Number of Goals: "+Goals());
    }
}

