

public abstract class Car {
    public int max;
    public int cargo;
    public abstract int Load(int cargo);
    public abstract int Unload(int cargo);

    //public abstract String getName();
}
enum Status {
    Overloaded,
    Empty,
    Working
}