
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

 
m = (a*12);
d = (a*365);
h = (d*24);
 
 JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +n,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+n,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+n,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);

}
   

}
}
