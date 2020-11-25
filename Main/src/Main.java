//import java.util.Random;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  @Override
        // public void actionPerformed(ActionEvent e) {
        // String getValue = Scaner.getText();
        // Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        //    Matcher matcher = pat.matcher(getValue);
        Station st = new Station();
        st.setСars("Kamaz" , 2);
        st.setСars("Tesla" , 1);
        st.setСars("Ural" , 2);
        st.setСars("Toyota" , 1);
        st.setСars("Kia" , 1);
        st.setСars("Kamaz2" , 2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во людей");
        int man = sc.nextInt();
        System.out.println("Введите массу груза");
        int cargo = sc.nextInt();

        int peopleCars;
        int cargoCars;

        if (man != 0 && cargo <= 3500)  {
            peopleCars = man;
            if (peopleCars % 4 != 0) {
                peopleCars = peopleCars / 4 + 1;
                st.callCar(peopleCars, 1);
            } else if (peopleCars % 4 == 0) {
                peopleCars = peopleCars / 4;
                st.callCar(peopleCars, 1);
            }
        }
            if (cargo != 0 && cargo > 3500) {
                cargoCars = cargo;
                if(man !=0){
                    peopleCars = man;
                    if (peopleCars % 4 != 0) {
                        peopleCars = peopleCars / 4 + 1;
                        st.callCar(peopleCars, 1);
                    } else if (peopleCars % 4 == 0) {
                        peopleCars = peopleCars / 4;
                        st.callCar(peopleCars, 1);
                    }
                }
                if (cargoCars % 10000 != 0) {
                    cargoCars = cargoCars / 10000 + 1;
                    st.callCar(cargoCars , 2);
                } else if (cargoCars % 10000 == 0) {
                    cargoCars = cargoCars / 10000;
                    st.callCar(cargoCars , 2);
                }
            }
    }
}
