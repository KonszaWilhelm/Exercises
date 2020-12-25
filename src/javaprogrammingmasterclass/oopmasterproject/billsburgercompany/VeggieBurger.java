package javaprogrammingmasterclass.oopmasterproject.billsburgercompany;

public class VeggieBurger extends Hamburger {
    public VeggieBurger(int price) {
        super("Brown bread", "veggie roll", price, "Veggie Burger");

    }

    @Override
    public void setAdditions(Additions additions, int num) {

        super.setAdditions(additions, num);
    }


}
