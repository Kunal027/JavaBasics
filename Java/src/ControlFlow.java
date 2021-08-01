public class ControlFlow {
    public static void main(String[] args) {
        boolean isDamaged = false;
        String carColor = "Red";
        String energyEff = "G";

        if(isDamaged)
        {
            System.out.println("Damaged car");
        }else {
            System.out.println("Good Condition car");
        }

        if(carColor.equals("Blue")){
            System.out.println("This is a Blue car");
        }else if(carColor.equals("Black")){
            System.out.println("This is a Black car");
        }else{
            System.out.println("This is a Red car");
        }

        switch (energyEff){
            case "A":
                System.out.println("Low Energy");
                break;
            case "G":
                System.out.println("High Energy");
                break;
            default:
                System.out.println("not Defined");
        }

    }
}
