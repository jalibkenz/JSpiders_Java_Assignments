class Car {
    double car_cost;
    static String car_model_name = "Tata Tiago";
    String car_type;

    Car(double a, String b){
        car_cost=a;
        car_type=b;
    }

    public static void main(String[] args) {
        Car c = new Car(150000,"XL");
    

        System.out.println("Car: " + car_model_name + " | " +
                           "Car Type = " + c.car_type + " | " +
                           "Car Cost = " + c.car_cost);
    }
}