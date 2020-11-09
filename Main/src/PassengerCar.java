import java.util.Random;

public class PassengerCar extends Car {
    int weight;
    String name;
    int num = 0;
    public PassengerCar() {
        max = 3500;
        Random random = new Random();
        weight = random.nextInt(3500);
    }
    public PassengerCar(String name){
        this.name = name;
    }
   public String getName(){
        return name;
   }
    public Status Status() {
        Status st;
        if (weight> max) {
            st = Status.Overloaded;
        } else if (num == 0) {
            st = Status.Empty;
        } else {
            st = Status.Working;
        }
        return st;
    }
    @Override
    public int load(int cargo) {
        this.weight += cargo;
        this.num =1;
        return weight;
    }

    @Override
    public int unLoad(int cargo) {
        this.weight -= cargo;
        this.num =0;
        return weight;
    }
}