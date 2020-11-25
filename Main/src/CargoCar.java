import java.util.Random;
public class CargoCar extends Car {
    int weight;
    String name;
    public int maxWeight;
    int num = 0;
    int status;
    Random random = new Random();
    public CargoCar(String name) {
        this.name = name;
        status = 1;
        maxWeight = 10000;
        weight = random.nextInt(10000);
    }
    //public CargoCar(String name){
   //     this.name = name;
   // }

    public int getStatus() {
        return status;
    }

    public void setStatus(int s){
        this.status = s;
    }


    public String getName(){
            return name;
    }


    public int getMax(){
        return maxWeight;
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
        this.num = 0;
        return weight;
    }
}