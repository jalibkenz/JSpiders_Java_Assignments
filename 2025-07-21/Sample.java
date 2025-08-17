public class Sample {

    public static void main(String[] args) {
        String monthSeason = "Jan";
        switch (monthSeason) {
            case "Dec", "Jan", "Feb":
                System.out.println("Winter");
                break;
                
            case "Mar", "Apr", "May":
                System.out.println("Spring");
                break;

            case "Jun", "Jul", "Aug":
                System.out.println("Summer");
                break;

            case "Sep", "Oct", "Nov":
                System.out.println("Autmn");
                break;

            default:
                break;
        }
    }
}