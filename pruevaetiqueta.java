// Fig. 13.4: LabelTest.java
// Demostracion de la clave Jlabel 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pruevaetiqueta extends JFrame {
   private JLabel etiqueta1, etiqueta2, etiqueta3;

   // confugurar GUI
   public pruevaetiqueta()
   {
      super( "prueba  JLabel" );

      //optener panel de contenido y establecer esquema
      Container contenedor  = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      // constructor JLabel con un argumento cadena
     etiqueta1 = new JLabel( "etiqueta del contexto" );
      etiqueta1.setToolTipText( "esta es la etiqueta " );
      contenedor.add( etiqueta1);

      // constructor JLabel con argumento cadena , icono y aliniacion 
      Icon insecto = new ImageIcon( "insecto.jpg" );
     etiqueta2= new JLabel( "etiqueta con texto e icono ", insecto, 
         SwingConstants.LEFT );
     etiqueta2.setToolTipText( "esta es laetiqueta2" );
     contenedor.add( etiqueta2 );

      // constructor JLabel sin argumento
      etiqueta3= new JLabel();
      etiqueta3.setText( "etiqueta con icono y texto en parte inferior " );
      etiqueta3.setIcon( insecto );
      etiqueta3.setHorizontalTextPosition( SwingConstants.CENTER );
     etiqueta3.setVerticalTextPosition( SwingConstants.BOTTOM );
      etiqueta3.setToolTipText( "Testa es la etiqueta 33" );
      contenedor.add(etiqueta3    );

      setSize( 700, 700	 );
      setVisible( true );

   } // fin del costructor 

   public static void main( String args[] )
   { 
      pruevaetiqueta applicacion = new pruevaetiqueta();
      applicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} 