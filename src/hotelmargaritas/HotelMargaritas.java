
package hotelmargaritas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Usuario
 */
public class HotelMargaritas  extends JFrame {

 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HotelMargaritas().setVisible(true);
        });
    }
  

 
    private final ArrayList<Huesped> listaHuespedes = new ArrayList<>();
    
    
    public HotelMargaritas(){
       
        setTitle("Registro de Huespedes");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        initUI();
          
    } 
    
    private void initUI(){
        
        JLabel lblNombre  = new JLabel("Nombre");
        JLabel lbldni = new JLabel("Documento");
        JLabel lblTelefono = new JLabel("Telefono"); 
        JPanel Panel = new JPanel();
        JFrame Formulario = new JFrame();
        
        //Inicializamos componentes
        JTextField txtNombre = new JTextField(30);
        JTextField txtdni = new JTextField(30);
        JTextField txtTelefono = new JTextField(30);
        JButton btnGuardar = new JButton("guardar");
        Formulario abrir = new Formulario(); 
        Panel = new JPanel();
        
        
        abrir.setVisible(true);
        
        getContentPane().add(Panel);
        Panel.setLayout(null);
        Panel.setBackground(Color.red);
        
     
        btnGuardar.addActionListener((ActionEvent e) -> {
            String nombre = txtNombre.getText();
            String dni = txtdni.getText();
            String telefono = txtTelefono.getText();
            
            Huesped huesped = new Huesped(nombre, dni, telefono); // Creamos un objeto Huesped y lo añadimos a la lista
            listaHuespedes.add(huesped);
            
            JOptionPane.showMessageDialog(null, "Huésped guardado:\n" + huesped);// Mostramos un mensaje de confirmación
            
            txtNombre.setText(null);
            txtdni.setText(null);
            txtTelefono.setText(null);
        });

    }
    
}