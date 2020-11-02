import java.util.ArrayList;

public class Station {
    ArrayList<CargoCar> cargoCars = new ArrayList<>();
    ArrayList<PassengerCar> passengerCars = new ArrayList<>();

    public  void setCargoCars(String name){
     cargoCars.add(new CargoCar(name));
    }
    public  void setPassengerCars(String name){
        passengerCars.add(new PassengerCar(name));
    }

    public ArrayList<CargoCar> getCargoCars() {
        return cargoCars;
    }

    public ArrayList<PassengerCar> getPassengerCars() {
        return passengerCars;
    }
}
