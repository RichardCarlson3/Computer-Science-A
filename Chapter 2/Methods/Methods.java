public class Methods {
    public static void main(String [] args){
        method1(4);
        method1(7);
        int y = method2("Yash", 7);
        System.out.println(y);
        int z = method2("Aiden ", 16);
        System.out.println(z);
        double d1 = method3(4, 2.5);
        System.out.println(d1);
    }
    public static void method1(int x){
        int y = x+1;
        System.out.println("added one to get " + y);
    }
    public static int method2(String name, int x){
        System.out.println("hello " + name);
        int rem =x%2;
        return rem;
    }
    public static double method3(int y, double z){
        double result = z*y+7;
        return result;
    }
}
