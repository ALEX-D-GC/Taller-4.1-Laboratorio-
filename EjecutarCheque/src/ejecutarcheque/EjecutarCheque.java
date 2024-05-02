
package ejecutarcheque;

import packageCheque.Banco;
import packageCheque.Cheque;
import packageCheque.Cliente;


public class EjecutarCheque {

    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente ("Alex Daniel","Gutierrez Cordova", "1105884595");
        Banco banco1 = new Banco ("Banco de Loja",17);
        Cheque cheque1 = new Cheque(cliente1,banco1,50000.75);
        cheque1.calcularComisionbanco();
        System.out.println(cheque1);
    }
}

//Integrantes: 
//Alex Gutiérrez
//Israel Asanza