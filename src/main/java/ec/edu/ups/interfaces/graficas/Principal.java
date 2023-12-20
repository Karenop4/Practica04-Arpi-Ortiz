package ec.edu.ups.interfaces.graficas;

import java.awt.*;
import java.awt.event.*;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;



public class Principal {
	public static void main(String[] args) {
		Frame ventanaPrincipal = new Frame();
		ventanaPrincipal.setLayout(new BorderLayout());
		
		///////////////PANEL CON TITULO///////////////////////////////
		Panel panelTitulo = new Panel();
		Label titulo = new Label("SISTEMA GESTION DE BIBLIOTECAS");
		titulo.setFont(new Font("",Font.BOLD,24));
		panelTitulo.setBackground(Color.decode("#DB9494"));
		panelTitulo.setPreferredSize(new Dimension(700,43));
		panelTitulo.add(titulo);
		ventanaPrincipal.add(panelTitulo, BorderLayout.NORTH);
		
		//////////////PANEL CENTRO////////////////////////////
		Panel panelCentro = new Panel(new GridLayout(1,2));
        
		Panel izquierdaCentro = new Panel() {
			public void paint(Graphics g) {
                super.paint(g);
                int ancho = getWidth();
                int alto = getHeight();
                
                // Definir un color para el borde
                g.setColor(Color.decode("#000000"));
                
                // Dibujar un borde alrededor del panel
                g.drawRect(7, 0, ancho-15, alto - 5);
            }
		};
		
		Panel derechaCentro = new Panel(){
			public void paint(Graphics g) {
                super.paint(g);
                int ancho = getWidth();
                int alto = getHeight();
                int anchoBorde = 5; // Ancho del borde
                // Definir un color para el borde
                g.setColor(Color.decode("#454343"));
             // Dibujar un borde con el ancho definido
                for (int i = 0; i < anchoBorde; i++) {
                    g.drawRect(i, i, ancho - 1 - 2 * i, alto - 1 - 2 * i);
                }
			}
		};
		panelCentro.setPreferredSize(new Dimension(700,105));
		//_______________________________________________________________________________________________________
		
		izquierdaCentro.setLayout(new BoxLayout(izquierdaCentro, BoxLayout.Y_AXIS));

        // Cuadro de texto con texto predeterminado y tamaño específico
        TextField cuadroTextoBiblio = new TextField("Nombre Biblioteca");
        // Espaciador vertical
        izquierdaCentro.add(Box.createVerticalStrut(15));
        izquierdaCentro.add(cuadroTextoBiblio); // Agregar el cuadro de texto
        cuadroTextoBiblio.setMaximumSize(new Dimension(300,30));
        // Espaciador vertical
        izquierdaCentro.add(Box.createVerticalStrut(15)); // Espaciador de 10 píxeles

        // Botones en disposición vertical con espaciador
        Panel panelBotonesBiblio1 = new Panel();
        panelBotonesBiblio1.setLayout(new GridLayout(1, 2)); // GridLayout con filas flexibles
        Button crearBiblio = new Button("Crear");
        Button seleccionarBiblio = new Button("Seleccionar");
        panelBotonesBiblio1.add(crearBiblio);
        panelBotonesBiblio1.add(seleccionarBiblio);
        izquierdaCentro.add(panelBotonesBiblio1); // Agregar el panel de botones
        panelBotonesBiblio1.setMaximumSize(new Dimension(300,30));
        
        // Espaciador vertical
        izquierdaCentro.add(Box.createVerticalStrut(10)); // Espaciador de 10 píxeles
        
        Button modificarBiblio = new Button("Modificar");
        izquierdaCentro.add(modificarBiblio); // Agregar el botón adicional
        modificarBiblio.setMaximumSize(new Dimension(150,30));
        //__________________________________________________________________________________________________
		derechaCentro.setBackground(Color.decode("#D9D9D9"));
        derechaCentro.setLayout(new BoxLayout(derechaCentro, BoxLayout.Y_AXIS));
        Label labelUsuario = new Label("Usuario");
        labelUsuario.setMaximumSize(new Dimension(300,30));
        labelUsuario.setFont(new Font("",Font.BOLD,15));
     // Espaciador vertical
        derechaCentro.add(Box.createVerticalStrut(15)); // Espaciador de 15 píxeles
        derechaCentro.add(labelUsuario);
        // Cuadro de texto con texto predeterminado y tamaño específico
        TextField cuadroTextoUsuario = new TextField("ejemplo@correo.com");
        derechaCentro.add(cuadroTextoUsuario); // Agregar el cuadro de texto
        cuadroTextoUsuario.setMaximumSize(new Dimension(300,30));
        // Espaciador vertical
        derechaCentro.add(Box.createVerticalStrut(15)); // Espaciador de 15 píxeles

        // Botones en disposición vertical con espaciador
        Panel panelBotonesUsuario = new Panel();
        panelBotonesUsuario.setLayout(new GridLayout(1, 2)); // GridLayout con filas flexibles
        Button iniciarUsuario = new Button("Crear");
        Button crearUsuario = new Button("Seleccionar");
        panelBotonesUsuario.add(iniciarUsuario);
        panelBotonesUsuario.add(crearUsuario);
        derechaCentro.add(panelBotonesUsuario); // Agregar el panel de botones
        panelBotonesUsuario.setMaximumSize(new Dimension(300,30));
        
        //________________________________________________________________________________________-
		panelCentro.add(izquierdaCentro);
		panelCentro.add(derechaCentro);
		
		ventanaPrincipal.add(panelCentro, BorderLayout.CENTER);
		
		/////////////////////////////PANEL BAJO///////////////////////
		Panel panelBajo = new Panel(new GridLayout(1,2));
		Panel izquierdaBajo = new Panel(){
			public void paint(Graphics g) {
                super.paint(g);
                int ancho = getWidth();
                int alto = getHeight();
                int anchoBorde = 7; // Ancho del borde
                // Definir un color para el borde
                g.setColor(Color.decode("#454343"));
                
             // Dibujar un borde con el ancho definido
                for (int i = 0; i < anchoBorde; i++) {
                    g.drawRect(i, i, ancho - 1 - 2 * i, alto - 1 - 2 * i);
                }
			}
		};
		Panel derechaBajo = new Panel(){
			public void paint(Graphics g) {
                super.paint(g);
                int ancho = getWidth();
                int alto = getHeight();
                int anchoBorde = 5; // Ancho del borde
                // Definir un color para el borde
                g.setColor(Color.decode("#454343"));
                
             // Dibujar un borde con el ancho definido
                for (int i = 0; i < anchoBorde; i++) {
                    g.drawRect(i, i, ancho - 1 - 2 * i, alto - 1 - 2 * i);
                }
			}
		}; 
		
		
        
		panelBajo.setPreferredSize(new Dimension(700,470));
		
		izquierdaBajo.setBackground(Color.decode("#D9D9D9"));
		izquierdaBajo.setPreferredSize(new Dimension(300, 470));
		
		izquierdaBajo.setLayout(new BoxLayout(izquierdaBajo, BoxLayout.Y_AXIS));
        Label labelLibro = new Label("Libros");
        labelLibro.setMaximumSize(new Dimension(300,30));
        labelLibro.setFont(new Font("",Font.BOLD,15));
        //Espaciador vertical
        izquierdaBajo.add(Box.createVerticalStrut(15)); // Espaciador de 15 píxeles
        izquierdaBajo.add(labelLibro);
        
        TextField cuadroTextoTitulo = new TextField("Título");
        izquierdaBajo.add(cuadroTextoTitulo); // Agregar el cuadro de texto
        cuadroTextoTitulo.setMaximumSize(new Dimension(300,30));
        // Espaciador vertical
        izquierdaBajo.add(Box.createVerticalStrut(15)); // Espaciador de 15 píxeles
        
        TextField cuadroTextoAutor = new TextField("Autor");
        izquierdaBajo.add(cuadroTextoAutor); // Agregar el cuadro de texto
        cuadroTextoAutor.setMaximumSize(new Dimension(300,30));
        // Espaciador vertical
        izquierdaBajo.add(Box.createVerticalStrut(15)); // Espaciador de 15 píxeles
        
        TextField cuadroTextoAnho = new TextField("Año");
        izquierdaBajo.add(cuadroTextoAnho); // Agregar el cuadro de texto
        cuadroTextoAnho.setMaximumSize(new Dimension(300,30));
        // Espaciador vertical
        izquierdaBajo.add(Box.createVerticalStrut(15)); // Espaciador de 15 píxeles
        
        Panel panelBotonBuscar = new Panel();
        Button buscarLibro = new Button("Buscar");
        panelBotonBuscar.add(buscarLibro);
      //Espaciador vertical
        
        izquierdaBajo.add(panelBotonBuscar);
        panelBotonBuscar.setMaximumSize(new Dimension(90,30));
        izquierdaBajo.add(Box.createVerticalStrut(15)); // Espaciador de 15 píxeles
        
        Panel librosMostrados = new Panel();
        librosMostrados.setLayout(new BoxLayout(librosMostrados, BoxLayout.Y_AXIS));
        GridLayout opciones = new GridLayout(4,1);
        JCheckBox checkbox = new JCheckBox();
        checkbox = new JCheckBox("Libro 1");
        //Boton
        Button agregarCarrito = new Button("AgregarCarrito");
        librosMostrados.add(checkbox);
        //SetLayout
        librosMostrados.setLayout(opciones);
        librosMostrados.add(new Panel());
        librosMostrados.add(agregarCarrito);
      //Espaciador vertical
        derechaBajo.add(Box.createVerticalStrut(15)); // Espaciador de 15 píxeles
        izquierdaBajo.add(librosMostrados);
        librosMostrados.setBackground(Color.decode("#E7E2E2"));
        librosMostrados.setMaximumSize(new Dimension(250,70));
      //Espaciador vertical
        izquierdaBajo.add(Box.createVerticalStrut(20)); // Espaciador de 20 píxeles
        Panel panelBotonesLibro = new Panel();
     // Botones en disposición vertical con espaciador
        panelBotonesLibro.setLayout(new GridLayout(0, 1)); // GridLayout con filas flexibles
        Button nuevoLibro = new Button("Nuevo Libro");
        Button modificar = new Button("Modificar");
        Button eliminar = new Button("Eliminar");
        panelBotonesLibro.add(nuevoLibro);
        panelBotonesLibro.add(modificar);
        panelBotonesLibro.add(eliminar);
        panelBotonesLibro.setMaximumSize(new Dimension(300,130));
        
        izquierdaBajo.add(panelBotonesLibro);
        //___________________________________________________________________________________________________
		derechaBajo.setBackground(Color.decode("#D9D9D9"));
		derechaBajo.setPreferredSize(new Dimension(400,470));
		
		derechaBajo.setLayout(new BoxLayout(derechaBajo, BoxLayout.Y_AXIS));
        Label labelPrestamo = new Label("Préstamos");
        labelPrestamo.setMaximumSize(new Dimension(300,15));
        labelPrestamo.setFont(new Font("",Font.BOLD,15));
        //Espaciador vertical
        derechaBajo.add(Box.createVerticalStrut(15)); // Espaciador de 15 píxeles
        derechaBajo.add(labelPrestamo);
        
        Label labelDatosUsuario = new Label("Datos Usuario");
        labelDatosUsuario.setMaximumSize(new Dimension(300,20));
        labelDatosUsuario.setFont(new Font("",Font.ITALIC,12));
        //Espaciador vertical
        derechaBajo.add(Box.createVerticalStrut(15)); // Espaciador de 15 píxeles
        derechaBajo.add(labelDatosUsuario);
      //Espaciador vertical
        derechaBajo.add(Box.createVerticalStrut(15)); // Espaciador de 15 píxeles
        
        
        Panel datosPrestamo = new Panel();
        datosPrestamo.setLayout(new GridLayout(1, 3)); // GridLayout con filas flexibles
        Panel nombreLibros = new Panel();
        nombreLibros.setLayout(new GridLayout(4,1));
        Label libro = new Label("Libros");
        libro.setFont(new Font("",Font.BOLD,15));
        nombreLibros.add(libro);
        Label label = new Label("Libro 1");
        nombreLibros.add(label);
        Label label2 = new Label("Libro 2");
        nombreLibros.add(label2);
        
        Panel fechaActual = new Panel();
        fechaActual.setLayout(new GridLayout(4,1));
        Label fechaAct = new Label("Fecha Actual");
        fechaAct.setFont(new Font("",Font.BOLD,15));
        fechaActual.add(fechaAct);
        Label fechal = new Label("dd/mm/yyyy");
        fechaActual.add(fechal);
        Label fecha2 = new Label("dd/mm/yyyy");
        fechaActual.add(fecha2);
        
        
        Panel fechaDevolucion = new Panel();
        fechaDevolucion.setLayout(new GridLayout(4,1));
        Label fechaDev = new Label("Devolver");
        fechaDev.setFont(new Font("",Font.BOLD,15));
        fechaDevolucion.add(fechaDev);
        TextField text = new TextField("dd/mm/yyyy");
        text.setMaximumSize(new Dimension(20,15));
        fechaDevolucion.add(text);
        TextField text2 = new TextField("dd/mm/yyyy");
        text2.setMaximumSize(new Dimension(20,15));
        fechaDevolucion.add(text2);
        
        datosPrestamo.add(nombreLibros);
        datosPrestamo.add(fechaActual);
        datosPrestamo.add(fechaDevolucion);
        datosPrestamo.setMaximumSize(new Dimension(300,150));
        derechaBajo.add(datosPrestamo);
      //Espaciador vertical
        derechaBajo.add(Box.createVerticalStrut(150)); // Espaciador de 15 píxeles
        
        Panel botonesLibro = new Panel();
        botonesLibro.setLayout(new GridLayout(1, 2)); // GridLayout con filas flexibles
        Button prestar = new Button("Prestar");
        Button devolver = new Button("Devolver");
        botonesLibro.add(prestar);
        botonesLibro.add(devolver);
        derechaBajo.add(botonesLibro); // Agregar el panel de botones
        botonesLibro.setMaximumSize(new Dimension(300,30));
		//___________________________________________________________________________________________________
		panelBajo.add(izquierdaBajo);
		panelBajo.add(derechaBajo);
		
		ventanaPrincipal.add(panelBajo , BorderLayout.SOUTH);
		
		
		///////////////////CERRAR VENTANA/////////////////////////////////
		//WindowListener para manejar el cierre de la ventana
		ventanaPrincipal.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // Acción al cerrar la ventana
                System.exit(0); // Sale de la aplicación
            }
        });
		
		ventanaPrincipal.setBackground(Color.decode("#454343"));//Color frame
		ventanaPrincipal.setSize(700,700);//tamaño frame
		//Frame visible
		ventanaPrincipal.setVisible(true);
		
		
        
        
        
	}
}
