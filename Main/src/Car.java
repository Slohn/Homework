

public abstract class Car {
    public int max;
    public int cargo;
    public abstract int load(int cargo);
    public abstract int unLoad(int cargo);


}
enum Status {
    Overloaded,
    Empty,
    Working
}