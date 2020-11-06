import java.util.Random;

public class PassengerCar extends Car {
    int weight;
    String name;

    public PassengerCar() {        //конструктор
        max = 3500;
        Random random = new Random();
        weight = random.nextInt(3500);
    }
    public PassengerCar(String name){
        this.name = name;
    }
   // @Override
    public Status Status() {
        Status st;
        if (weight> max) {
            st = Status.Overloaded;
        } else if (cargo == 0) {
            st = Status.Empty;
        } else {
            st = Status.Working;
        }
        return st;
    }
    @Override
    public int Load(int cargo) {
        this.weight += cargo;
        return weight;
    }

    @Override
    public int Unload(int cargo) {
        this.weight -= cargo;
        return weight;
    }
}