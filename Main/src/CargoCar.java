import java.util.Random;
public class CargoCar extends Car {
    int weight;
    Random random = new Random();
    public CargoCar() {
        max = 10000;
        weight = random.nextInt(10000);
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