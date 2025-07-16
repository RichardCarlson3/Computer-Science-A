public class WhileLoops {
    public int addOdds(int n){
        int sum=0;
        int a=1;
        while(a<=n){
            sum+=a;
            a+=2;
        }
        return sum;
    }
    public int sumDigits(int b){
        int sum=0;
        int a;
        while(b>0){
            a=b%10;
            sum+=a;
            b/=10;
        }
        return sum;
    }
    public int howManyYears(double startpop, double endpop){
        int years=0;
        while(endpop>startpop){
            startpop=startpop*1.0113;
            years+=1;
        }
        return years;
    }
    public void printSum(int n){
        int a=1;
        int sum=0;
        while(n>=a){
            System.out.print(a);
            sum+=a;
            a+=1;
            if(n>=a)
            System.out.print("+");
            else
            System.out.println("="+sum);
        }
    }
    public boolean isPerfectSquare(int n){
        int a=1;
        int sum=0;
        while(n>sum){
            sum+=a;
            a+=2;
        }
        if(n==sum) return true;
        else return false;
    }

public static void main(String [] args){
    WhileLoops a= new WhileLoops();
    System.out.println(a.addOdds(1));
    System.out.println(a.addOdds(3));
    System.out.println(a.addOdds(2));
    System.out.println("");
    System.out.println(a.sumDigits(123));
    System.out.println(a.sumDigits(476));
    System.out.println(a.sumDigits(149));
    System.out.println("");
    System.out.println(a.howManyYears(111.2,120));
    System.out.println(a.howManyYears(111.2,150));
    System.out.println("");
    a.printSum(8);
    a.printSum(6);
    System.out.println("");
    System.out.println(a.isPerfectSquare(16));
    System.out.println(a.isPerfectSquare(25));
    System.out.println(a.isPerfectSquare(15));
    System.out.println(a.isPerfectSquare(10));
}
}