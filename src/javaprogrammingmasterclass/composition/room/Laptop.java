package javaprogrammingmasterclass.composition.room;

public class Laptop {
    private String manufacturer;
    private String cpuType;
    private String graphicsCardType;
    private int cores;
    private int memory;
    private int displayRefreshRate;

    public Laptop(String manufacturer, String cpuType, String graphicsCardType, int cores, int memory, int displayRefreshRate) {
        this.manufacturer = manufacturer;
        this.cpuType = cpuType;
        this.graphicsCardType = graphicsCardType;
        this.cores = cores;
        this.memory = memory;
        this.displayRefreshRate = displayRefreshRate;
    }

    public void watchTutorialsToStudy(String topic, int durationInMinutes) {
        System.out.println("You are studying: " + topic + " for the duration of: " + durationInMinutes + " minutes");
    }

    public void playGames(String gameTitle, int durationInMinutes) {
        System.out.println("You are playing: " + gameTitle + " for the duration of: " + durationInMinutes + " minutes");

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "manufacturer='" + manufacturer + '\'' +
                ", cpuType='" + cpuType + '\'' +
                ", graphicsCardType='" + graphicsCardType + '\'' +
                ", cores=" + cores +
                ", memory=" + memory +
                ", displayRefreshRate=" + displayRefreshRate +
                '}';
    }
}
