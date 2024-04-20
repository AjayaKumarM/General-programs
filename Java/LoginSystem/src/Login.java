import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;


    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();


        frame.setSize(400,400);
        frame.setTitle("Login page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(80,100,80,25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(160,100,150,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(80,130,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(160,130,150,25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(140,180,80,25);
        button.addActionListener(new Login());
        panel.add(button);

        success = new JLabel();
        panel.add(success);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String user = userText.getText();
        String password = passwordText.getText();

        if(user.equals("admin")&&password.equals("1234")){
            success.setBounds(130,220,300,25);
            success.setText("Login Successful!");
        }
        else{
            userText.setText("");
            passwordText.setText("");
            success.setBounds(100,220,300,25);
            success.setText("Invalid username and password");
        }
    }
}
