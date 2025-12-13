class vehicle {
  private int speed;
  private String color;
  private String model;
  private String brand;
  private int year;

  public vehicle(int speed, String color, String model, String brand, int year) {
    this.speed = speed;
    this.color = color;
    this.model = model;
    this.brand = brand;
    this.year = year;
  }

  public vehicle() {
    this.speed = 0;
    this.color = "Unknown";
    this.model = "Unknown";
    this.brand = "Unknown";
    this.year = 0;
  }


  public void start() {
    System.out.println("Vehicle started.");
  } 

}
class Car extends vehicle {
  private int numberOfDoors;

  public Car(int speed, String color, String model, String brand, int year, int numberOfDoors) {
    super();
    this.numberOfDoors = numberOfDoors;
  }

  public Car() {
    super();
    this.numberOfDoors = 4;
  }
}

class inheritance {
  public static void main(String[] args) {
    Car myCar = new Car(120, "Red", "Model S", "Tesla", 2020, 4);
    myCar.start();
  }
}