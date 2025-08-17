class School {
    static String school_name = "HTPS";
    char school_grade;
    static int school_strength = 1500;

    School(char a) {
        school_grade = a;
    }

    public static void main(String[] args) {
        School s = new School('A');

        System.out.println("School: " + school_name +
                " Grade: " + s.school_grade +
                " Strength: " + school_strength);
    }
}