
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
        public int compraTotal4 (int numeroBase) {
 
       compraTotal4 = numeroBase*gorrasB;
       
    
       return compraTotal4-limiteCredito;
}
     public int compraTotal5 (int numeroBase) {
 
       compraTotal5 = numeroBase*televisoresB;
       
    
       return compraTotal5-limiteCredito;
}
      public int compraTotal6 (int numeroBase) {
 
       compraTotal6 = numeroBase*carrosB;
       
    
       return compraTotal6-limiteCredito;
}
      public int compraTotal7 (int numeroBase2) {
 
       compraTotal7 = numeroBase2*cableB;
       
    
       return compraTotal7-limiteCredito;
}
      public int compraTotal8 (int numeroBase2) {
 
       compraTotal8 = numeroBase2*luzB;
       
    
       return compraTotal7-limiteCredito;
}
      public int compraTotal9 (int numeroBase2) {
 
       compraTotal9 = numeroBase2*aguaB;
       
    
       return compraTotal9-limiteCredito;
}
}
