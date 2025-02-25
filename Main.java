import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        frame.setSize(350, 450);
        frame.add(new JLabel("Hello World"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelnome = new JLabel("nome:");
        labelnome.setBounds(30, 30, 50, 20);
        JTextField textnome = new JTextField();
        textnome.setBounds(70, 30, 200, 20);
        JCheckBox check = new JCheckBox("check");
        check.setBounds(50, 50, 100, 40);
        JPasswordField password = new JPasswordField("123");
        password.setBounds(50, 100, 80, 20);
        frame.setLayout(null);
        frame.getContentPane().add(labelnome);
        frame.getContentPane().add(textnome);
        frame.getContentPane().add(check);
        frame.getContentPane().add(password);
        frame.setVisible(true);

    }
}
