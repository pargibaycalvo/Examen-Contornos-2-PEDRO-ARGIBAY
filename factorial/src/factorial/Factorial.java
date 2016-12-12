
package factorial;

public class Factorial {
           
    int j,resultado,i;
   

public void calculos(){  
   j = 8;     
   if (j == 0)
   resultado = 1;
   else
   {
    resultado = 1;
    for (i = j; i >= 1; i--)
{
    resultado = resultado * i;
}
   }    
  
 

System.out.println(resultado); 


    }
    
}
    
    

