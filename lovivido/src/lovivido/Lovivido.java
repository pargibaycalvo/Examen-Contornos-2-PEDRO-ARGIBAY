
package lovivido;

import javax.swing.JOptionPane;


public class Lovivido {
       
String nombre, edad;
int mes,dia,hora,a;


public void pedirdatos(){
nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
edad = JOptionPane.showInputDialog ("Escriba su edad: ");
a = Integer.parseInt (edad);
}

public void calculardatos(){

JOptionPane.showMessageDialog(null,  "Meses: "  +mes,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE); 
mes = (a*12);

JOptionPane.showMessageDialog(null, "Días: " +dia,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
dia = (a*365);

JOptionPane.showMessageDialog(null, "Horas: " +hora,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
hora = (dia*24);
 
System.exit (0); 


 


 

   

}
   

}

