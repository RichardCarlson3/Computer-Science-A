public class Factorial {
    public long calcFactorial(int n){
        long sum=1;
        for(int a=1; a<=n; a++){
            sum*=a;
        }
        return sum;
    }
    public double calcE(){
        double e=1;
        double olde=0;
        int a=1;
        while(e-olde > .001){
            olde=e;
            e+=((double)1/calcFactorial(a));
            a++;
        }
        return e;

        }
    public double calcEX(int x){
        double e=1;
        int y=1;
        double olde=0;
        int a=1;
        while(e-olde > .001){
            olde=e;
            e+=((double)Math.pow(x,y)/calcFactorial(a));
            a++;
            y++;
        }
        return e;
    }
    public static void main(String [] args){
        Factorial a= new Factorial();
        for(int b=1; b<=20; b++){
        System.out.println(a.calcFactorial(b));
        }
        System.out.printf("e is %2.3f \n", a.calcE());
        for(int b=1; b<=5; b++){
        System.out.printf("e is %2.3f \n", a.calcEX(b));
        }
    }
}
