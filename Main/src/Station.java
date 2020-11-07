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

   public String getCargoCars() {
      // cargoCars[] list = null;

      // String[] str = new String[cargoCars.size()];
    //  for (cargoCars obj: list) {
       //String str = String.valueOf(obj.get());
      //     str[i] = ((cargoCars) obj).name;
      // String[] str = new String[cargoCars.size()];
       String g = "";
         for(int i = 0;i < cargoCars.size(); i++){
             String d = cargoCars.get(i).getName();
           //  String n = car.getName();
            // str[i] = d;
             g +=d + ", ";
        }
        return g;
    }

    public String getPassengerCars() {
        String l = "";
        for(int i = 0;i < passengerCars.size(); i++){
            String d = passengerCars.get(i).getName();
            //  String n = car.getName();
            // str[i] = d;
            l +=d + ", ";
        }
        return l;
    }
}
