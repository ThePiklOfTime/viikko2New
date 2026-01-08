package viikko2;

public class Car {
  String brand;
  String model;
  int speed;

  public Car(String brand, String model, int speed){
    this.brand = brand;
    this.model = model;
    this.speed = speed;
    }

    public void status(){
      System.out.println("Auto: " + this.brand + " " + this.model + ", Nopeus: " + this.speed + " km/h");
    }
    
    public void Kiihdytä(int kiihdytys){
      this.speed += kiihdytys;
    }
    public void Jarruta(int jarrutus){
      this.speed -= jarrutus;
      if (this.speed < 0) {
        this.speed = 0;
      }
    }
}
