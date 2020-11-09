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

   public String[] getCargoCars() {
       String[] str = new String[cargoCars.size()];
         for(int i = 0;i < cargoCars.size(); i++){
             String d = cargoCars.get(i).getName();
            str[i] = d;
            System.out.println(d);
        }
       return str;
    }

    public String getPassengerCars() {
        String l = "";
        for(int i = 0;i < passengerCars.size(); i++){
            String d = passengerCars.get(i).getName();
            l +=d + ", ";
        }
        return l;
    }
}
