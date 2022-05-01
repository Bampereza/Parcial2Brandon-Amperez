
package funcionesbancarias;

/**
 *
 * @author aldan
 */
public class TarjetasB {
    
      //Atributos para heredar
     int limiteCredito = 10000;
     int saldoTotal = 5000;
     int saldoB = 10000;
     int deposito;
     int depositoTotal;
     float tasatotal;
     double i;
     double m;
     int camisasB = 250;
     int telefonoB = 1000;
     int bicicletaB = 750;
     int televisoresB = 2000;
     int carrosB = 7000;
     int gorrasB = 500;
     int cableB = 500;
     int luzB = 1000;
     int aguaB = 500;
     
     int compraTotal, compraTotal2, compraTotal3;
     int compraTotal4, compraTotal5, compraTotal6;
     int compraTotal7, compraTotal8, compraTotal9;
     
      public int getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public int getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(int saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public int getSaldoB() {
        return saldoB;
    }

    public void setSaldoB(int saldoB) {
        this.saldoB = saldoB;
    }
}


