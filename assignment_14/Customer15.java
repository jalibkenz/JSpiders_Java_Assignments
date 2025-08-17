class Apple {
  void product() {
    System.out.println("Bike");
  }
}

class AppleStore {
  static void dispatch(Apple a2) {
    a2.product();
  }
}

class Customer15 {
  public static void main(String[] args) {
    Apple a1 = new Apple();
    AppleStore.dispatch(a1);
  }
}