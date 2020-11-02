import java.util.Random;

public class PassengerCar extends Car {
    int weight;
    public PassengerCar() {        //конструктор
        max = 3500;
        Random random = new Random();
        weight = random.nextInt(3500);
    }

    @Override
    public String Status() {
        if (weight + cargo > max) {
            status = "Overloaded";
        } else if (cargo == 0) {
            status = "Empty";
        } else {
            status = "Working";
        }
        return status;
    }
    @Override
    public int Load(int cargo) {
        this.cargo = cargo;
        return cargo;
    }

    @Override
    public int Unload() {
        cargo = 0;
        return cargo;
    }
}