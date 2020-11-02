

public class Main {
    public static void main(String[] args) {
        PassengerCar toyota = new PassengerCar();
        CargoCar kamaz = new CargoCar();
        kamaz.Load(5000);
        toyota.Load(30000);
        toyota.weight = 2000;
        System.out.println(toyota.Status());
        System.out.println(toyota.weight);
        toyota.Unload();
        System.out.println(toyota.Status());

    }
}
