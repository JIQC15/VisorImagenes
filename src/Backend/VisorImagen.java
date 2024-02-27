package Backend;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class VisorImagen extends JFrame {

    private JScrollPane panel;
    private Pantalla pantalla;

    public VisorImagen(String archivo) {

        super("Visor imagen");

        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource(archivo));
        pantalla = new Pantalla(img);
        panel = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        getContentPane().add(panel);
        panel.setViewportView(pantalla);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        show();
    }
    
    public static void main(String[] args) {
        String archivo = "66032-h.jpg";
        new VisorImagen(archivo);
    }
}
