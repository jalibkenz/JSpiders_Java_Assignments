// Parent class
abstract class DBConnection {
    abstract void connect();
}

// Child classes
class MySQL extends DBConnection {
    void connect() {
        System.out.println("Connected to MySQL Database.");
    }
}

class Oracle extends DBConnection {
    void connect() {
        System.out.println("Connected to Oracle Database.");
    }
}

class Postgres extends DBConnection {
    void connect() {
        System.out.println("Connected to PostgreSQL Database.");
    }
}

// ChooseDB
class ChooseDB {
    static void choose(DBConnection db) {
        db.connect();
    }
}

// Main Class
public class MainClass11 {
    public static void main(String[] args) {
        ChooseDB.choose(new MySQL());
        ChooseDB.choose(new Oracle());
        ChooseDB.choose(new Postgres());
    }
}