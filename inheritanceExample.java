class inheritanceExample {
    public static void main(String[] args) {
        bike b1 = new bike(100, "Red", "Sport", "Yamaha", 2020, 1);
        b1.start();
        System.out.println("Bike speed: " + b1.get_speed());
        // b1.speed(150);
        // System.out.println("Bike new speed: " + b1.speed());
    }
}
class vehicle {
    private int speed;
    private String color;
    private String model;
    private String brand;
    private int year;

    public vehicle() {
        this.speed = 100;
        this.color = "unknown";
        this.model = "model";
        this.brand = "brand";
        this.year = 2003;
    }
    public void start() {
        System.out.println("Vehicle started.");
    }
    public int get_speed(){
      return 45;
    }
    // public int speed(int speed){
    //   return speed;
    // }
}
class bike extends vehicle {
    int type;
    public bike(int speed, String color, String model, String brand, int year, int type) {
        super();
        this.type = type;
    }
  }