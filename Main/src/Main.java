import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        JFrame a = new JFrame("Taxi");
        JButton button = new JButton("click me");
        JTextField textField = new JTextField("");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(300, 300);
        textField.setBounds(50, 10, 200, 30);
        button.setBounds(40, 90, 85, 20);
        a.add(button);
        a.add(textField);
        a.setLayout(null);
        a.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getValue = textField.getText();
                Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
                Matcher matcher = pat.matcher(getValue);
                int peopleCars;
                int cargoCars;
                if(matcher.find()){
                     peopleCars = Integer.parseInt(matcher.group());
                    if(peopleCars%4 != 0) {
                        peopleCars = peopleCars/4 + 1;
                    } else if(peopleCars%4 == 0){
                        peopleCars = peopleCars/4;
                    }

                    if(matcher.find()){
                       cargoCars = Integer.parseInt( matcher.group());
                       if(cargoCars%3500 != 0){
                           cargoCars = cargoCars/3500 + 1;
                       } else if(cargoCars%3500 == 0) {
                           cargoCars = cargoCars/3500;
                       }
                        System.out.println(peopleCars + cargoCars);
                        JOptionPane.showMessageDialog(null,"Заказано " + String.valueOf(peopleCars + cargoCars) + " легковых машины");
                    }
                }
            }
        });
        }
    }
