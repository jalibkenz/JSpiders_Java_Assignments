class Car {
    double car_cost;
    static String car_model_name = "Tata Tiago";
    String car_type;

    Car(double car_cost, String car_type){
        this.car_cost=car_cost;
        this.car_type=car_type;
    }

    public static void main(String[] args) {
        Car c = new Car(150000,"XL");
    

        System.out.println("Car: " + car_model_name + " | " +
                           "Car Type = " + c.car_type + " | " +
                           "Car Cost = " + c.car_cost);
    }
}