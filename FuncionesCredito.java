
package funcionesbancarias;

/**
 *
 * @author aldan
 */
public class FuncionesCredito extends TarjetasB {
    
     
     
     public int limiteCreditoBA (int credito) {
    
           
      return limiteCredito;
}
     
     public int saldoCreditoBA (int saldoBA) {
    
           
      return saldoB;
}
     public float interesBA (float primerNumero, float segundoNumero, float tercerNumero) {
    
          tasatotal = (float)(Math.pow((float)(1+ segundoNumero/100),(float)tercerNumero))*primerNumero;
          
         return tasatotal;
   
} 
     
}
