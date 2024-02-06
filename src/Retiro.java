import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro extends JFrame {
    private JTextField pantallar;
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
    private JButton borrarButton;
    private JButton enter;
    private JButton menu;
    private JPanel Retiro;

    public Retiro(){
        super("Retiro");

        setContentPane(Retiro);
        setSize(550,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.setVisible(true);
                JFrame frameRegreso = (JFrame) SwingUtilities.getWindowAncestor(Retiro);
                frameRegreso.dispose();
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantallar.setText("");
            }
        });
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float saldoactual= Saldo.saldobanco;
                String retiro = pantallar.getText();
                float retiro1 =Integer.parseInt(retiro);
                if(retiro1> saldoactual){
                    JOptionPane.showMessageDialog(null,"Saldo Insuficiente","Error", JOptionPane.WARNING_MESSAGE);
                    pantallar.setText("");
                }else{
                    Saldo.saldobanco = saldoactual - retiro1;
                    pantallar.setText("");
                    JOptionPane.showMessageDialog(null, "Se retiró: " + retiro1 + "\nSaldo actual: " + Saldo.saldobanco);
                }

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallar.getText() + "1";
                pantallar.setText(cons);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallar.getText() + "2";
                pantallar.setText(cons);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallar.getText() + "3";
                pantallar.setText(cons);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallar.getText() + "4";
                pantallar.setText(cons);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallar.getText() + "5";
                pantallar.setText(cons);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallar.getText() + "6";
                pantallar.setText(cons);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallar.getText() + "7";
                pantallar.setText(cons);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallar.getText() + "8";
                pantallar.setText(cons);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallar.getText() + "9";
                pantallar.setText(cons);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cons = pantallar.getText() + "0";
                pantallar.setText(cons);
            }
        });

    }
}
