

public abstract class Car {
    public int max;
    public int cargo;
    public abstract int Load(int cargo);
    public abstract int Unload();
    public abstract String Status();

   public String status;
}