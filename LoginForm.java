package Spring.IntLoc_Demo.LoginForm;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LoginFrame {
    LoginFrame(String title, String email, String password, String button){
        JFrame jFrame = new JFrame();
        jFrame.setSize(600, 600);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        JLabel jLabel_login = new JLabel(title);
        jLabel_login.setBounds(200, 50, 200, 30);
        jFrame.add(jLabel_login);

        JLabel jLabel_email = new JLabel(email);
        jLabel_email.setBounds(60, 120, 200, 30);
        jFrame.add(jLabel_email);

        JTextField jTextField_email = new JTextField();
        jTextField_email.setBounds(60, 150, 500, 40);
        jFrame.add(jTextField_email);

        JLabel jLabel_password = new JLabel(password);
        jLabel_password.setBounds(60,220,200,30);
        jFrame.add(jLabel_password);

        JTextField jTextField_password = new JTextField();
        jTextField_password.setBounds(60, 250, 500, 40);
        jFrame.add(jTextField_password);

        JButton jButton_login = new JButton(button);
        jButton_login.setBounds(200,320,200,40);
        jFrame.add(jButton_login);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Any One Language : ");
        System.out.println("1. English - US");
        System.out.println("2. French - FR");
        System.out.println("3. Arabic - AE");
        System.out.println("4. Spanish - ES");

        int num = sc.nextInt();
        switch(num){
            case 1:
                LoginFrame.localeDetails("en", "US");
                break;
            case 2:
                LoginFrame.localeDetails("fr", "FR");
                break;
            case 3:
                LoginFrame.localeDetails("ar", "AE");
                break;
            case 4:
                LoginFrame.localeDetails("es", "ES");
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

    static void localeDetails(String languageCode, String countryCode){
        Locale locale = new Locale(languageCode, countryCode);
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("Spring/IntLoc_Demo/LoginForm/Properties/MyResourceBundle" ,locale);

        String key_login_title = resourceBundle1.getString("key_login_title");
        String key_email_title = resourceBundle1.getString("key_email_title");
        String key_pass_title = resourceBundle1.getString("key_pass_title");
        String key_button_title = resourceBundle1.getString("key_button_title");

        new LoginFrame(key_login_title, key_email_title, key_pass_title, key_button_title);
    }
}
