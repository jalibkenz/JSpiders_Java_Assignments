class Eicher {
  void product() {
    System.out.println("Bike");
  }
}

class RoyalEnfield {
  static void dispatch(Eicher a2) {
    a2.product();
  }
}

class Customer10 {
  public static void main(String[] args) {
    Eicher a1 = new Eicher();
    RoyalEnfield.dispatch(a1);
  }
}