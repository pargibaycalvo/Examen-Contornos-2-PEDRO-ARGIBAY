
package lovivido;

import javax.swing.JOptionPane;


public class Lovivido {
       
String n, e;
int m,d,h,a;
a = Integer.parseInt (e);

public void pedirdatos(){
n = JOptionPane.showInputDialog ("Escriba su nombre: ");
e = JOptionPane.showInputDialog ("Escriba su edad: ");
}

public void calculardatos(){

JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +n,JOptionPane.INFORMATION_MESSAGE); 
m = (a*12);

JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+n,JOptionPane.INFORMATION_MESSAGE);
d = (a*365);

JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+n,JOptionPane.INFORMATION_MESSAGE);
h = (d*24);
 
System.exit (0); 


 


 

   

}
   

}

