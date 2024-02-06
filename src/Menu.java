import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JRadioButton saldobtn;
    private JRadioButton retirobtn;
    private JRadioButton depositobtn;
    private JRadioButton salirbtn;
    private JPanel panelmn;

    public Menu() {
        super("menu");
        setContentPane(panelmn);
        setSize(550, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        salirbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int respuesta = JOptionPane.showOptionDialog(Menu.this,
                        "¡Muchas gracias!",
                        "Salir",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        new Object[]{"OK"},
                        "OK");
                if (respuesta == JOptionPane.OK_OPTION) {
                    dispose();
                }
            }
        });
        saldobtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saldo saldo =  new Saldo();
                saldo.setVisible(true);
                dispose();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelmn);
                frame.dispose();
            }
        });
        retirobtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retiro retiro = new Retiro();
                retiro.setVisible(true);
                dispose();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelmn);
                frame.dispose();
            }
        });
        depositobtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Deposito deposito = new Deposito();
                deposito.setVisible(true);
                dispose();
                JFrame frame=(JFrame) SwingUtilities.getWindowAncestor(panelmn);
                frame.dispose();
            }
        });
    }
}
