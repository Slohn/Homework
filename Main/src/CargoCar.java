import java.util.Random;
public class CargoCar extends Car {
    int weight;
    String name;
    int num = 0;
    Random random = new Random();
    public CargoCar() {
        max = 10000;
        weight = random.nextInt(10000);
    }
    public CargoCar(String name){
        this.name = name;
    }

    public Status Status() {
        Status st;
        if (weight> max) {
            st = Status.Overloaded;
        } else if (num == 0) {
            st = Status.Empty;
        } else {
            st = Status.Working;
        }
        return st;
    }
        @Override
        public int Load(int cargo) {
            this.weight += cargo;
            this.num =1;
            return weight;
        }

    @Override
    public int Unload(int cargo) {
        this.weight -= cargo;
        this.num = 0;
        return weight;
    }
}