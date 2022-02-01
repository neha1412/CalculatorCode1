import java.util.List;

 public class Car {
    public Engine engine;
    private List<Wheel> wheels;

     public Car() {
         engine = new Engine();
     }

     public void start(){
        System.out.println("Car start");
         engine.start();
    }
    public void stop(){
        System.out.println("Car stops");
    }
}


