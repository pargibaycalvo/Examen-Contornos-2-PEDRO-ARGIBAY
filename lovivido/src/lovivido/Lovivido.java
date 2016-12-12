
package lovivido;

import javax.swing.JOptionPane;


public class Lovivido {
       
String nombre, edad;
int mes,dia,hora,numentero;


public void pedirdatos(){
nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
edad = JOptionPane.showInputDialog ("Escriba su edad: ");
numentero = Integer.parseInt (edad);
}

public void calculardatos(){

JOptionPane.showMessageDialog(null,  "Meses: "  +mes,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE); 
mes = (numentero*12);

JOptionPane.showMessageDialog(null, "Días: " +dia,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
dia = (numentero*365);

JOptionPane.showMessageDialog(null, "Horas: " +hora,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
hora = (dia*24);
 
System.exit (0); 


 


 

   

}
   

}

