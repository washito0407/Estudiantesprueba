import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;

public class Estudiantes {
    private JPanel panel1;
    private JPanel Estudiantes;
    private JLabel Codigo;
    private JLabel Cedula;
    private JLabel Nombres;
    private JLabel Apelidos;
    private JLabel Signo;
    private JButton cargarDatosDesdeElButton;
    private JTextField texcodigo;
    private JTextField textcedula;
    private JTextField textnombres;
    private JTextField textapellidos;
    private JComboBox Signos;
    private JButton buttonguardar;
    private JLabel Fecha;
    private JLabel Color;
    private JLabel Casado;
    private JButton buttonregistroanterior;
    private JButton buttonregistrosiguiente;
    private JComboBox Anio;
    private JComboBox Mes;
    private JComboBox Dia;
    private JCheckBox checkBoxrojo;
    private JCheckBox verdeCheckBox;
    private JCheckBox ningunoCheckBox;
    private JCheckBox siCheckBox;
    private JCheckBox noCheckBox;

    public Estudiantes() {
        Signos.addFocusListener(new FocusAdapter() {
        });
        Signos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Estudiantes");
        frame.setContentPane(new Estudiantes().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
