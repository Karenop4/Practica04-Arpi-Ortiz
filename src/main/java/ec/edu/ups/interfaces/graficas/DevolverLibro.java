package ec.edu.ups.interfaces.graficas;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JCheckBox;

public class DevolverLibro {
	//Hex to Color
    private static Color hex2Rgb(String colorStr) {
        return new Color(
                Integer.valueOf(colorStr.substring(1, 3), 16),
                Integer.valueOf(colorStr.substring(3, 5), 16),
                Integer.valueOf(colorStr.substring(5, 7), 16)
        );
    }    
    public void windowClosing(WindowEvent e) {
                // Acción al cerrar la ventana
                System.exit(0); // Sale de la aplicación
    }    

    public static void main(String [] args) {
        int alto = 175;
        int ancho = 300;
        //Ventana
        Frame miVentana = new Frame();  
        //Paneles
        Panel miPanel = new Panel();
        //Color
        Color color1 = hex2Rgb("#454343");
        Color color2 = hex2Rgb("#d9d9d9");
        GridLayout opcionesMenu = new GridLayout(4,1);
        //Box
        JCheckBox[] checkbox = new JCheckBox[3];
        for (int i = 0; i < 3; i++) {
            checkbox[i] = new JCheckBox("Libro "+(i+1));
        }
        //Boton
        Button anadir = new Button("Devolver");
        anadir.setSize(300, 120);
        anadir.setBackground(color2);
        //SetLayout
        miPanel.setLayout(opcionesMenu);
        //
        for (int i = 0; i < 3; i++) {
            checkbox[i].setForeground(Color.WHITE);
            checkbox[i].setBackground(color1);
            miPanel.add(checkbox[i]);
        }
        
        miPanel.add(anadir);
        miVentana.add(miPanel);
        //Mostrar
        miVentana.setBackground(color1);
        miVentana.setSize(ancho,alto);
        miVentana.setTitle("Devolver Libro");
        //Centra la ventana
        miVentana.setLocation(new Point((1920/2-ancho/2),(1080/2-alto/2)));
        miVentana.setVisible(true);   
        //Cierra la ventana
	miVentana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // Acción al cerrar la ventana
                System.exit(0); // Sale de la aplicación
            }
        });        
    }
}
