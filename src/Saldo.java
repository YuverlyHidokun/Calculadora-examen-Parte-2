import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame {
    private JTextField textField1;
    private JButton menubtn;
    private JPanel panelsl;
    public static float saldobanco = 200;

    public Saldo() {
        super("Saldo");
        setContentPane(panelsl);
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        menubtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.setVisible(true);
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelsl);
                frame.dispose();
            }
        });
        textField1();
    }

    private void textField1() {
        String saldo = String.valueOf(saldobanco);
        textField1.setText(saldo);
    }
}
