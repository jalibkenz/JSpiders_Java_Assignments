import java.util.LinkedHashMap;
import java.util.Map.Entry;

class School {
    String name;
    String grade;
    String strength;

    School(String name, String grade, String strength) {
        this.name = name;
        this.grade = grade;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Grade: " + grade + ", Strength: " + strength;
    }
}

class T3_School {
    public static void main(String[] args) {
        LinkedHashMap<Integer, School> lhm = new LinkedHashMap<>();

        lhm.put(1, new School("Beacon Hill", "High School", "500 Students"));
        lhm.put(2, new School("Maplewood Elementary", "Grade 5", "30 Students"));
        lhm.put(3, new School("Greenwood Middle", "Grade 8", "150 Students"));

        for (Entry<Integer, School> x : lhm.entrySet()) {
            System.out.println("Key -> " + x.getKey() + " | " + x.getValue());
        }
    }
}