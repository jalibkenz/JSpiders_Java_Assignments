public class MainClass8 {

    String homeName;
    int homeCost;
    String homeColour;

    MainClass8(String homeName, int homeCost, String homeColour) {
        this.homeName = homeName;
        this.homeCost = homeCost;
        this.homeColour = homeColour;
    }

    public boolean equals(Object obj) {
        MainClass8 h = (MainClass8) obj;
        return this.homeCost == h.homeCost;
    }

    public static void main(String[] args) {
        MainClass8 h1 = new MainClass8("Villa Paradise", 5000000, "White");
        MainClass8 h2 = new MainClass8("Dream House", 5000000, "Beige");

        if (h1.equals(h2)) {
            System.out.println("Both homes cost the same");
        } else {
            System.out.println("Homes cost differently");
        }
    }
}