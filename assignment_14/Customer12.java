class Tata {
  void product() {
    System.out.println("Bike");
  }
}

class RotanaMotors {
  static void dispatch(Tata a2) {
    a2.product();
  }
}

class Customer12 {
  public static void main(String[] args) {
    Tata a1 = new Tata();
    RotanaMotors.dispatch(a1);
  }
}