package javaprogrammingmasterclass.encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.tonerLevel = 100;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int fillUpPercent) {
        if (fillUpPercent > 0 && fillUpPercent <= 100) {
            tonerLevel += fillUpPercent;
        } else if (tonerLevel + fillUpPercent > 100) {
            System.out.println("Too much ink, remainder: " + (tonerLevel + fillUpPercent - 100));
            tonerLevel = 100;
        } else if (fillUpPercent <= 0)
            System.out.println("INVALID INPUT!");

        System.out.println("The toner is filled up: " + tonerLevel + "%");
    }

    public void print(int pageNumber) {
        pagesPrinted += pageNumber;

        while (pageNumber > 0) {
            tonerLevel -= 1;
            pageNumber -= 3;

            if (tonerLevel < 0) {
                tonerLevel = 0;

                break;
            }
        }

        if (isDuplex)
            System.out.println("Pages printed: " + pagesPrinted / 2 + pagesPrinted % 2 + " as printer is a duplex, toner level: " + tonerLevel);
        else
            System.out.println("Pages printed: " + pagesPrinted + "toner level: " + tonerLevel);

        if (tonerLevel <= 0)
            System.out.println("Toner needs refill!!!");
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", isDuplex=" + isDuplex +
                '}';
    }
}
