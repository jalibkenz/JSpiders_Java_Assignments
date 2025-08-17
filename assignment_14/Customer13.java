class Myntra {
  void product() {
    System.out.println("Bike");
  }
}

class Delhivery {
  static void dispatch(Myntra a2) {
    a2.product();
  }
}

class Customer13 {
  public static void main(String[] args) {
    Myntra a1 = new Myntra();
    Delhivery.dispatch(a1);
  }
}