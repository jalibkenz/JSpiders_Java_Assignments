class Tvs {
  void product() {
    System.out.println("Bike");
  }
}

class PopularMotors {
  static void dispatch(Tvs a2) {
    a2.product();
  }
}

class Customer14 {
  public static void main(String[] args) {
    Tvs a1 = new Tvs();
    PopularMotors.dispatch(a1);
  }
}