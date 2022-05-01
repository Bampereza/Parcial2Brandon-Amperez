
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
                           
                    case 4:
			
                       System.out.println("--------------------------------------------------");
                       System.out.println("-----------Que compra desea realizar:  -----------");
                       System.out.println("--------------------------------------------------");
                       System.out.println("Gorras (1)");
                       System.out.println("Televisores (2)");
                       System.out.println("Carros (3)");
                
                       System.out.println("Ingrese la opcion que desee utilizar: ");    
                       int compraCredito =sc.nextInt();
                    
              switch (compraCredito){

                    case 1:
                        System.out.println("-----------------------------------------------");
                        System.out.println("---------Cada Gorra vale Q 500.00:  -----------");
                        System.out.println("Ingrese la cantidad de ropa que desea comprar: ");
                        System.out.println("-----------------------------------------------");
                         int numeroBase = sc.nextInt();
                         
                        System.out.println(nuevoProgramaBA.compraTotal4(numeroBase));
                        System.out.println("Su saldo restante es de:  "+nuevoProgramaBA.compraTotal4);
                           
			   break;
                           
                    case 2:
                        System.out.println("--------------------------------------------------");
                        System.out.println("-------Cada television vale Q 2000.00:  ----------");
                        System.out.println("Ingrese la cantidad de ropa que desea comprar:    ");
                        System.out.println("--------------------------------------------------");
                        numeroBase = sc.nextInt();
                         
                        System.out.println(nuevoProgramaBA.compraTotal5(numeroBase));
                        System.out.println("Su saldo restante es de:  "+nuevoProgramaBA.compraTotal5);
                           
			   break;
                           
                    case 3:
                        System.out.println("--------------------------------------------------");
                        System.out.println("----------Cada carro vale Q 7000.00:  ------------");
                        System.out.println("Ingrese la cantidad de ropa que desea comprar:    ");
                        System.out.println("--------------------------------------------------");
                        numeroBase = sc.nextInt();
                         
                        System.out.println(nuevoProgramaBA.compraTotal6(numeroBase));
                        System.out.println("Su saldo restante es de:  "+nuevoProgramaBA.compraTotal6);
                           
			   break;
                           
                    case 5:
                       System.out.println("--------------------------------------------------");
                       System.out.println("------------Que pago desea realizar:  ------------");
                       System.out.println("--------------------------------------------------");
                       System.out.println("Pago de cable(1)");
                       System.out.println("Pago de luz  (2)");
                       System.out.println("Pago de agua (3)");
                
                       System.out.println("Ingrese la opcion que desee utilizar: ");    
                       int compraCredito2 =sc.nextInt();
                    
              switch (compraCredito2){

                    case 1 :
                        System.out.println("--------------------------------------------------------");
                        System.out.println("----------El pago de cable es de Q 500.00:  ------------");
                        System.out.println("--------------Porfavor realice su pago: ----------------");
                        System.out.println("--------------------------------------------------------");
                        int numeroBase2 = sc.nextInt();
                        
                        System.out.println(nuevoProgramaBA.compraTotal7(numeroBase2));
                        System.out.println("Su saldo restante es de:  "+nuevoProgramaBA.compraTotal7);
                        break;
                           
                    case 2 :
                        System.out.println("--------------------------------------------------------");
                        System.out.println("-----------El pago de luz es de Q 1000.00:  ------------");
                        System.out.println("--------------Porfavor realice su pago: ----------------");
                        System.out.println("--------------------------------------------------------");
                        numeroBase2 = sc.nextInt();
                        System.out.println(nuevoProgramaBA.compraTotal8(numeroBase2));
                        System.out.println("Su saldo restante es de:  "+nuevoProgramaBA.compraTotal8);
                        break;
                           
                    case 3 :
                        System.out.println("--------------------------------------------------------");
                        System.out.println("----------El pago del agua es de Q 500.00:  ------------");
                        System.out.println("--------------Porfavor realice su pago: ----------------");
                        System.out.println("--------------------------------------------------------");
                        numeroBase2 = sc.nextInt();
                        System.out.println(nuevoProgramaBA.compraTotal9(numeroBase2));
                        System.out.println("Su saldo restante es de:  "+nuevoProgramaBA.compraTotal9);
                        break;
              }
              }
              }
                   break;
                case 2:  
                  System.out.println("----------------------------------------------------------");
                  System.out.println("--------Porfavor ingrese el numero de su tarjeta: --------");
                  System.out.println("----------------------------------------------------------");
                    float num2=sc.nextFloat();
                       System.out.println ("\n");
                       System.out.println("Elija la funcion que desee utilizar");
                       System.out.println("Saldo total (1)");
                       System.out.println("Depositar (2)");
                       System.out.println("Pagar (3)");
                
                       System.out.println("Ingrese la opcion que desee utilizar: ");    
                       int opDebito =sc.nextInt();
                    
              switch (opDebito){

                    case 1:
                           
                        System.out.println("Su saldo total es de: "+nuevoProgramaBAC.saldoTotal);
                           
			   break;
                           
                    case 2:
			System.out.println("----------------------------------------------------------");
                        System.out.println("----Ingrese la cantidad de dinero que desea depositar: ---");
                        System.out.println("----------------------------------------------------------");
                         int primerNumero = sc.nextInt();
                         
                        System.out.println(nuevoProgramaBAC.depositoTotal(primerNumero));
                        System.out.println("Su saldo actual es de:  "+nuevoProgramaBAC.depositoTotal);
                        
			   break;
                           
                    case 3:
			  
                       System.out.println("--------------------------------------------------");
                       System.out.println("--------Que desea compra desea realizar:  --------");
                       System.out.println("--------------------------------------------------");
                       System.out.println("Camisas (1)");
                       System.out.println("Telefono (2)");
                       System.out.println("bicicleta (3)");
                
                       System.out.println("Ingrese la opcion que desee utilizar: ");    
                       int compraDebito =sc.nextInt();
                       
                       switch (compraDebito){

                    case 1:
                        System.out.println("-----------------------------------------------");
                        System.out.println("--------Cada camisa vale Q 250.00:  -----------");
                        System.out.println("Ingrese la cantidad de ropa que desea comprar: ");
                        System.out.println("-----------------------------------------------");
                         primerNumero = sc.nextInt();
                         
                        System.out.println(nuevoProgramaBAC.compraTotal(primerNumero));
                        System.out.println("Su saldo restante es de:  "+nuevoProgramaBAC.compraTotal);
                           
			   break;
                        
                         

}
}
}
}
}






