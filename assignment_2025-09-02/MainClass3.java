public class MainClass3 {

    String schoolName;
    String schoolGrade;
    int schoolStrength;

    MainClass3(String schoolName, String schoolGrade, int schoolStrength) {
        this.schoolName = schoolName;
        this.schoolGrade = schoolGrade;
        this.schoolStrength = schoolStrength;
    }

    public boolean equals(Object obj) {
        MainClass3 s = (MainClass3) obj;
        return this.schoolGrade.equals(s.schoolGrade);
    }

    public static void main(String[] args) {
        MainClass3 s1 = new MainClass3("Oxford", "A", 1200);
        MainClass3 s2 = new MainClass3("Cambridge", "A", 1500);

        if (s1.equals(s2)) {
            System.out.println("Both schools have the same grade");
        } else {
            System.out.println("Schools have different grades");
        }
    }
}