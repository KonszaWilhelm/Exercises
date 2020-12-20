package javaprogrammingmasterclass.oopmasterproject.billsburgercompany;

public class Additions {
    private String name;
    private int price;


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Additions(String name, int price) {
        if (name.equalsIgnoreCase("lettuce") ||
                name.equalsIgnoreCase("tomato") ||
                name.equalsIgnoreCase("carrot") ||
                name.equalsIgnoreCase("chilly"))
            this.name = name;
        else
            System.out.println("No such additional item!");

        this.price = price;
    }

    @Override
    public String toString() {
        return "Additions{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
