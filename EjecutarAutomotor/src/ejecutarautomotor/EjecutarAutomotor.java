
package ejecutarautomotor;

import packageAutomotor.Automotor;
import packageAutomotor.Fabricante;


public class EjecutarAutomotor {

    
    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante("AEADE","Quito");
       Automotor automotor1 = new Automotor ("11145789795",fabricante1,2017,1745.68);
       System.out.println(automotor1);
    }
}

//Integrantes: 
//Alex Gutiérrez
//Israel Asanza