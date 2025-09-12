public class School {
    String schoolName;
    String schoolGrade;
    int schoolStrength;

    School(String schoolName, String schoolGrade, int schoolStrength) {
        this.schoolName = schoolName;
        this.schoolGrade = schoolGrade;
        this.schoolStrength = schoolStrength;
    }

    @Override
    public String toString() {
        return "School [name=" + schoolName + ", grade=" + schoolGrade + ", strength=" + schoolStrength + "]";
    }

    public static void main(String[] args) {
        School s1 = new School("DPS", "A", 1200);
        School s2 = new School("KV", "B", 900);

        System.out.println(s1);
        System.out.println(s2);
    }
}