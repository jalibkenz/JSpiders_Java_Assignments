class Cowin {
  void product() {
    System.out.println("Bike");
  }
}

class Thyrocare {
  static void dispatch(Cowin a2) {
    a2.product();
  }
}

class Customer11 {
  public static void main(String[] args) {
    Cowin a1 = new Cowin();
    Thyrocare.dispatch(a1);
  }
}