import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito extends JFrame {
    private JTextField pantallad;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton Enter;
    private JButton menu;
    private JButton borrarButton;
    private JPanel paneldp;

    public Deposito() {
        super("Deposito");
        setContentPane(paneldp);
        setSize(550, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);


        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.setVisible(true);
                JFrame frameRegreso = (JFrame) SwingUtilities.getWindowAncestor(paneldp);
                frameRegreso.dispose();
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantallad.setText("");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallad.getText() + "1";
                pantallad.setText(cons);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallad.getText() + "2";
                pantallad.setText(cons);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallad.getText() + "3";
                pantallad.setText(cons);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallad.getText() + "4";
                pantallad.setText(cons);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallad.getText() + "5";
                pantallad.setText(cons);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallad.getText() + "6";
                pantallad.setText(cons);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallad.getText() + "7";
                pantallad.setText(cons);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallad.getText() + "8";
                pantallad.setText(cons);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallad.getText() + "9";
                pantallad.setText(cons);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallad.getText() + "0";
                pantallad.setText(cons);
            }
        });


        Enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float saldoactual= Saldo.saldobanco;
                String deposito = pantallad.getText();
                float deposito1 =Integer.parseInt(deposito);
                if(deposito1> 0 ){
                    Saldo.saldobanco = saldoactual + deposito1;
                    pantallad.setText("");
                    JOptionPane.showMessageDialog(null, "Se deposito: " + deposito1 + "\nSaldo actual: " + Saldo.saldobanco);
                }
            }
        });
    }
}
