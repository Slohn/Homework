

public class Main {
    public static void main(String[] args) {
        Station st = new Station();
        st.setPassengerCars("Tesla");
        st.setPassengerCars("KIA");
        st.setCargoCars("Kamaz");
        st.setCargoCars("Tata");
        System.out.println(st.getCargoCars());
        System.out.println(st.getPassengerCars());
    }
}
