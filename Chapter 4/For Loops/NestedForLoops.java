public class NestedForLoops {
    public int addEvens(int n){
        int sum=0;
        for(int a=2; a<=n; a+=2){
            sum+=a;
        }
        return sum;
    }
    public void printSquaresBack(int n){
        for(int a=0; n>a; n--){
            System.out.print(n*n+" ");
        }
        System.out.println();
    }
    public void sillyNumbers(){
        for(int b=1; b<=3; b++){
            for(int a=0; a<=9; a++){
                System.out.print(""+a+a+a);
            }
        System.out.println();}
    }
    public void sillyNumbers2(){
        for(int b=1; b<=4; b++){
            for(int a=9; a>=0; a--){
                for(int c=0; c<a; c++){
                    System.out.print(a);
                }
            }
        System.out.println();}
    }
    public void dollarsAndStars(){
        for(int b=1; b<=7; b++){
            for(int a=1; a<b; a++){
                System.out.print("**");
            }
            for(int c=8; c>b; c--){
                System.out.print("$");
            }
            for(int d=8; d>b; d--){
                System.out.print("**");
            }
            for(int c=8; c>b; c--){
                System.out.print("$");
            }
            for(int a=1; a<b; a++){
                System.out.print("**");
            }
       System.out.println();}
    }
    public static void main(String [] args){
        NestedForLoops a= new NestedForLoops();
        System.out.println("addEvens");
        System.out.println(a.addEvens(10));
        System.out.println(a.addEvens(8));
        System.out.println(a.addEvens(6));
        System.out.println();
        System.out.println("printSquaresBack");
        a.printSquaresBack(8);
        a.printSquaresBack(7);
        a.printSquaresBack(9);
        System.out.println();
        System.out.println("sillyNumbers");
        a.sillyNumbers();
        System.out.println();
        System.out.println("sillyNumbers2");
        a.sillyNumbers2();
        System.out.println();
        System.out.println("dollarsAndStars");
        a.dollarsAndStars();
    }
}
