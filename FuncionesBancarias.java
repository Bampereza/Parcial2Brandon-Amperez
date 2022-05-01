
package funcionesbancarias;

import java.util.Scanner;

/**
 *
 * @author aldan
 */
public class FuncionesBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("--------------------------------------------------------------");
         System.out.println("---------Bienvenido al Programa de transacciones BA-----------");
         System.out.println("--------------------------------------------------------------");
       
         Scanner sc= new Scanner(System.in);
           
          System.out.println("Porfavor ingrese su usuario: ");
          String nom=sc.nextLine();
          System.out.println("\n");
         
          System.out.println("--------------------------------------------");
          System.out.println("--------------Menu de opciones--------------");
          System.out.println("--------------------------------------------");
         
          System.out.println("Elija que tipo de tarjeta desearia utilizar");
          System.out.println("{1) Tarjeta de credito"); 
          System.out.println("{2) Tarjeta de debito"); 
          
          System.out.println("Ingrese la opcion que desea usar: ");
          int opcion =sc.nextInt();
          System.out.println("\n");
          
          FuncionesCredito nuevoProgramaBA = new FuncionesCredito();
          FuncionesDebito nuevoProgramaBAC = new FuncionesDebito();
    
    switch(opcion){
             case 1:
                  System.out.println("----------------------------------------------------------");
                  System.out.println("--------Porfavor ingrese el numero de su tarjeta: --------");
                  System.out.println("----------------------------------------------------------");
                  float num=sc.nextFloat();
                    System.out.println ("\n");
                    System.out.println("Elija la funcion que desee utilizar");
                    System.out.println("Limite de credito (1)");
                    System.out.println("Taza de intereses (2)");
                    System.out.println("Saldo (3)");
                    System.out.println("Comprar (4)");
                    System.out.println("Pagar (5)");
                    
                
                    System.out.println("Ingrese la opcion que desee utilizar: ");
                       int opCredito =sc.nextInt();
                       
                       
                switch (opCredito){

                    case 1:
                           
                        System.out.println("El limite de su credito es: "+nuevoProgramaBA.limiteCredito);
                           
			   break;

	            case 2:
		        System.out.println("--------------------------------------");  
                        System.out.println("---Ingrese el valor de su credito: ---");
                        System.out.println("--------------------------------------");
                         float primerNumero = sc.nextFloat();
                   
                        System.out.println("--------------------------------------");  
                        System.out.println("----Ingrese la tasa de intereses: ----");
                        System.out.println("--------------------------------------");
                         float segundoNumero = sc.nextFloat();
                         
                        System.out.println("---------------------------------------------");  
                        System.out.println("---Ingrese el periodo de tiempo en meses: ---");
                        System.out.println("---------------------------------------------"); 
                         float tercerNumero = sc.nextFloat();
                         
                        System.out.println(nuevoProgramaBA.interesBA(primerNumero, segundoNumero, tercerNumero));
                        System.out.println("El interes total es de:  "+nuevoProgramaBA.tasatotal);
                         
			   break;
                           
                    case 3:
			  
                        System.out.println("Su saldo actual es de: "+nuevoProgramaBA.saldoB);
                        
			   break;
}
}
}
}




