 import java.util.*;
 class vehicle_publish{
  public static void main(String[] args) {
    // car myCar = new car("Toyota", "Red", 30000, 5);
    // bike myBike = new bike("Yamaha", "Blue", 1500, true);
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter 1 to create Car and 2 to create Bike:");
    switch(sc.nextInt()){
      case 1:
        //System.out.println("Car created with name: Toyota, color: Red, price: 30000, seats: 5");
        car c1 = create_car();
        System.out.println("Car created successfully.");  
        System.out.println("Car "+c1.toString());
        break;
      case 2:
        //System.out.println("Bike created with name: Yamaha, color: Blue, price: 1500, has carrier: true");
        bike b1 = create_bike();
        System.out.println("Bike created successfully.");
        System.out.println("Bike "+b1.toString());
        break;
      default:
        System.out.println("Invalid choice");
        break;
      }
  }
    public static car create_car(){
      String name ;
      String color ;
      int price ;
      int seat ;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter car name : ");
      name = sc.nextLine();
      System.out.println("Enter car color : ");
      color = sc.nextLine();
      System.out.println("Enter car price : ");
      price = sc.nextInt();
      System.out.println("Enter number of seats : ");
      seat = sc.nextInt();
      // car newCar = new car(name, color, price, seat); 
      return new car(name, color, price, seat);
    }

    public static bike create_bike() {
      String name ;
      String color ;
      int price ;
      boolean carrier ;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter bike name : ");
      name = sc.nextLine();
      System.out.println("Enter bike color : ");
      color = sc.nextLine();
      System.out.println("Enter bike price : ");
      price = sc.nextInt();
      System.out.println("Does the bike have a carrier (true/false) : ");
      carrier = sc.nextBoolean();
      // bike newBike = new bike(name, color, price, carrier);
      return new bike(name, color, price, carrier);
  }
 }
 class vehicle{
  protected String vehicle_name;
  protected String vehicle_color;
  protected int vehicle_price;
  public vehicle(String name, String color, int price){
    this.vehicle_name = name;
    this.vehicle_color = color;
    this.vehicle_price = price;
  }
  public vehicle(){
    this.vehicle_name = "default_name";
    this.vehicle_color = "default_color";
    this.vehicle_price = 0;
  }
 }
  class car extends vehicle{
    private int car_seat;
    public car(String name, String color, int price, int seat){
      super(name, color, price);
      this.car_seat = seat;
    }
    public car(){
      super();
      this.car_seat = 4;
    }

    public String toString(){
      return super.vehicle_name+", "+super.vehicle_color+", "+super.vehicle_price+", "+this.car_seat;
    }
    
  }

  class bike extends vehicle{
    private boolean has_carrier;
    public bike(String name, String color, int price, boolean carrier){
      super(name, color, price);
      this.has_carrier = carrier;
    }
    public bike(){
      super();
      this.has_carrier = false;
    }

    public String toString(){
      return super.vehicle_name+", "+super.vehicle_color+", "+super.vehicle_price+", "+this.has_carrier;
    }
  }