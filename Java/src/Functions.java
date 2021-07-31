public class Functions {
    public static void main(String[] args) {

        sayHello();
        blackBoardPunishment(5);
        System.out.println("Discount = " + getDiscount(10));
        System.out.println("Return from f1 Overloading Ex:" + getDiscountPrice(10, 15));
        System.out.println("Return from f2 Overloading Ex:" + getDiscountPrice(20.20,15));


    }

    static void sayHello(){
        System.out.println("Hi");
    }

    static void blackBoardPunishment(int repeatNumber){
        for(int i = 1; i <= repeatNumber; i++) {
            System.out.println("May the force be with you!!");
        }
    }

    static double getDiscount(int price){
        return price * 0.9;
    }

    static double getDiscountPrice(int price, int percent){
        return price * percent / 100.0;
    }

    static double getDiscountPrice(double price, int percent){
        return price * percent / 100;
    }

}
