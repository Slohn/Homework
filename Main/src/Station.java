
import java.util.ArrayList;
import java.util.List;

public class Station {

    List<Car> cars = new ArrayList<>();
    List<Car> inActiveCars = new ArrayList<>();

    public void setСars(String name , int i) { // имя и тип
        if(i == 1){ cars.add(new PassengerCar(name)); }
        else { cars.add(new CargoCar(name));}
    }

    public List<Car> getСars() {
        return cars;
    }

    public void callCar(int c, int t) { //кол-во машин; тип: грузовая(2)/легковая(1)
        for(int i = 0; i < c;i++){
            int h = 0;
            while(h == 0){
                for(int j = 0;j < cars.size(); j++){
                    if( t == 1 && cars.get(j).getMax() == 3500  && cars.get(j).getStatus() == 1){ //getMax() == 3500
                        System.out.println("Легковая машина " + cars.get(j).getName() + " выезжает");
                        inActiveCars.add(cars.get(j));
                        cars.get(j).setStatus(0);
                        h = 1;
                        break;
                    } else if(t == 2 && cars.get(j).getMax() == 10000 && cars.get(j).getStatus() == 1){
                        System.out.println("Грузовая машина " +cars.get(j).getName() + " выезжает");
                        inActiveCars.add(cars.get(j));
                        cars.get(j).setStatus(0);
                        h = 1;
                        break;
                    }else if(h == 0) {
                        h = 2;

                    }
                }
            } if(h ==2) {
                System.out.println("ERROR");
            }
        }
    }

   /*public String[] getCargoCars() {
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
    } */
}
