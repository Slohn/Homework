import java.util.Random;

public abstract class Car {
    private int max;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(10000);
        PassengerCar toyota = new PassengerCar(r);
        toyota.setMax(3500);
        int r2 = random.nextInt(3500);
        CargoCar kamaz = new CargoCar(r2);
        kamaz.setMax(10000);
    }
}