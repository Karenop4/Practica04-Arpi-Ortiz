package ec.edu.ups.interfaces.graficas;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CrearUsuario {
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
        int ancho = 400;
        //Ventana
        Frame miVentana = new Frame();  
        //Paneles
        Panel miPanel = new Panel();
        //Color
        Color color1 = hex2Rgb("#454343");
        Color color2 = hex2Rgb("#d9d9d9");
        FlowLayout opcionesMenu = new FlowLayout();
        //textField
        TextField nombre = new TextField("Nombre", 50);
        TextField cedula = new TextField("Cedula", 50);
        TextField correo = new TextField("correo@ejemplo.com", 50);
        //Boton
        Button anadir = new Button("Crear Usuario");
        anadir.setSize(300, 120);
        anadir.setBackground(color2);
        //SetLayout
        miPanel.setLayout(opcionesMenu);
        //
        miPanel.add(nombre);
        miPanel.add(cedula);
        miPanel.add(correo);
        miPanel.add(anadir);
        miVentana.add(miPanel);
        //Mostrar
        miVentana.setBackground(color1);
        miVentana.setSize(ancho,alto);
        miVentana.setTitle("Crear Usuario");
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
