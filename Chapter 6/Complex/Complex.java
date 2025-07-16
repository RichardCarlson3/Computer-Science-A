public class Complex {
    private double a;
    private double b;

    public Complex(double a, double b){
    this.a=a;
    this.b=b;
    }

    public Complex(double a){
    this(a,0.0);
    }

    public double abs(){
        double c=Math.sqrt(a*a+b*b);
        return c;
    }

    public Complex add(Complex other){
        Complex c=new Complex(a+other.a,b+other.b);
        return c;
    }
    public String toString(){
        String e=""+a+" "+"+"+" "+b+"i";
        return e;
    }
    public Complex multiply(Complex other){
        Complex f=new Complex(a*other.a-b*other.b,a*other.b+b*other.a);
        return f;
    }
    public Complex add(double g){
        Complex h=new Complex(a+g,b);
        return h;
    }
    public Complex multiply(double i){
        Complex j=new Complex(a*i,b*i);
        return j;
    }
        public static void main(String[] args){
        Complex z=new Complex(2,4);
        Complex y=new Complex(3,5);
        Complex x=new Complex(-2,5);
        Complex v=new Complex(3,-2);
        Complex u=new Complex(2,0);
        Complex t=new Complex(0,5);
        System.out.println(z.abs());
        System.out.println(z.add(y));
        System.out.println(z.multiply(y));
        System.out.println(z.add(3));
        System.out.println(z.multiply(3));
        System.out.println(x.abs());
        System.out.println(x.add(v));
        System.out.println(x.multiply(v));
        System.out.println(x.add(4));
        System.out.println(x.multiply(4));
        System.out.println(u.abs());
        System.out.println(u.add(t));
        System.out.println(u.multiply(t));
        System.out.println(u.add(5));
        System.out.println(u.multiply(5));
    }
}