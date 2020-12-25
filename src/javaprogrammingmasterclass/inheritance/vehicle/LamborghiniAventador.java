package javaprogrammingmasterclass.inheritance.vehicle;


public class LamborghiniAventador extends Car {

    private int roadServiceMonths;

    public LamborghiniAventador(int roadServiceMonths) {
        super("Lamborghini Aventador", "2 person",4,2,7,true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate (int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0 ){
            stop();
            changeGear(1);
        }else if (newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
