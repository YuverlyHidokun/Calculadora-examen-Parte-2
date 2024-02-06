import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Bienvenida extends JFrame {
    private JTextField text1;
    private JTextField text2;
    private JButton ingresarbtn;
    private JButton salirbtn;
    private JPanel panelbn;

    public Bienvenida() {
        super("Banco el Buho");
        setContentPane(panelbn);
        setSize(550, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);

        ingresarbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = "Lady";
                String contrasenia = "123456";
                try {
                    if (usuario.equals(text1.getText()) && contrasenia.equals(text2.getText())) {
                        Menu menu = new Menu();
                        menu.setVisible(true);
                        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelbn);
                        frame.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error en las credenciales");
                        text1.setText("");
                        text2.setText("");
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        salirbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int opcion = JOptionPane.showConfirmDialog(Bienvenida.this, "¿Quieres salir del sistema?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
