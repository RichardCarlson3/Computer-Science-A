public class AdvancedForLoops {
    
    public void eights(){
        for(int a=8; a>0; a-=2){
            for(int c=8-a; c>0; c-=2){
                System.out.print(" ");
            }
            for(int b=a; b>0; b--){
                System.out.print(a);
            }
            System.out.println();
        }
    }
    
    public void alternate(int x){
        for(int a=1; a<=x; a++){
            if(a%2==1){
                for(int b=1; b<=a; b++){
                System.out.print(b);
            }
            System.out.println();
        }
            if(a%2==0){
                for(int b=a; b>0; b--){
                    System.out.print(b);
                }
            System.out.println();
        }
        }
    }

    public void isosceles(int x){
        for(int a=1; a<=x; a++){
            for(int b=x-a; b>0; b--){
                System.out.print(" ");
            }
            for(int b=1; b<=a; b++){
                System.out.print(b);
            }
            for(int b=a-1; b>0; b--){
                System.out.print(b);
            }
            System.out.println();
        }
    }
    public void upSideDown(int x, int y){
        for(int a=x; a>=y; a--){
            for(int b=a; b<x; b++){
                System.out.print(" ");
            }
            for(int b=a; b>=y; b--){
                System.out.print(b);
            }
            for(int b=y+1; b<=a; b++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        AdvancedForLoops a= new AdvancedForLoops();
        System.out.println("eights");
        a.eights();
        System.out.println();
        System.out.println("alternate");
        a.alternate(5);
        System.out.println();
        a.alternate(6);
        System.out.println();
        System.out.println("isosceles");
        a.isosceles(5);
        System.out.println();
        System.out.println("upSideDown");
        a.upSideDown(9,5);
        System.out.println();
        a.upSideDown(8,6);
    }
}
