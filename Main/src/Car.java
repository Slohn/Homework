

public abstract class Car {
    public int max;
    public int cargo;
    public abstract int Load(int cargo);
    public abstract int Unload(int cargo);
}
enum Status {
    Overloaded,
    Empty,
    Working
}