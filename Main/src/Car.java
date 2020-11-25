

public abstract class Car {
   // public int cargo;
    public int maxWeight;
    public String name;
    int status;
    public abstract int getMax();

    public abstract int load(int cargo);
    public abstract int unLoad(int cargo);

    public abstract int getStatus();
    public abstract String getName();
    public abstract void setStatus(int s);
}
enum Status {
    OVERLOADED,
    EMPTY,
    WORKING
}