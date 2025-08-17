class Ibm {
  void product() {
    System.out.println("Bike");
  }
}

class Naukri {
  static void dispatch(Ibm a2) {
    a2.product();
  }
}

class Customer8 {
  public static void main(String[] args) {
    Ibm a1 = new Ibm();
    Naukri.dispatch(a1);
  }
}