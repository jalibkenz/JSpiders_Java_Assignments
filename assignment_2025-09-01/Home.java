public class Home {
    String homeName;
    int homeCost;
    String homeColour;

    Home(String homeName, int homeCost, String homeColour) {
        this.homeName = homeName;
        this.homeCost = homeCost;
        this.homeColour = homeColour;
    }

    @Override
    public String toString() {
        return "Home [name=" + homeName + ", cost=" + homeCost + ", colour=" + homeColour + "]";
    }

    public static void main(String[] args) {
        Home h1 = new Home("Villa", 5000000, "White");
        Home h2 = new Home("Apartment", 2000000, "Grey");

        System.out.println(h1);
        System.out.println(h2);
    }
}