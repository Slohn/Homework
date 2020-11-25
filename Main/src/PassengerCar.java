import java.util.Random;

public class PassengerCar extends Car {
    int weight;
    String name;
    int maxPassangers;
    int maxWeight;
    int num = 0;
    int status;
    public PassengerCar(String name) {
        this.name = name;
        status = 1;
        maxPassangers = 4;
        maxWeight = 3500;
        Random random = new Random();
        weight = random.nextInt(3500);
    }
    public int getMax() {
        return maxWeight;
    }
    public int getStatus(){return status;}
    public void setStatus(int s){
        this.status = s;
    }
   // public PassengerCar(String name){
   //     this.name = name;
   // }

   public String getName(){
        return name;
   }

    public Status Status() {
        Status massCar;
        if (weight> maxWeight) {
            massCar = Status.OVERLOADED;
        } else if (num == 0) {
            massCar = Status.EMPTY;
        } else {
            massCar = Status.WORKING;
        }
        return massCar;
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