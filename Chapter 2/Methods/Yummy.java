public class Yummy {
    public static void main(String [] args){
        System.out.println("Yummy");
        chocolate();    //call the chocolate method
        iceCream();
        System.out.println("done");
    }
    public static void chocolate(){
        System.out.print("Chocolate ");
        System.out.println("Cake");
    }
    public static void frenchFries(){
        System.out.println("french fries with ketchup");
        chocolate();
        System.out.println("that was yummy");
    }
    public static void iceCream(){
        System.out.println("ice"); 
        frenchFries();
        System.out.println("cream");
    }
}
