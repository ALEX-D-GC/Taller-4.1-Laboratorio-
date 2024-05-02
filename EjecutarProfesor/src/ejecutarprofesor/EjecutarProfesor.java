

package ejecutarprofesor;

import packageProfesor.Profesor;
import packageProfesor.Provincia;


public class EjecutarProfesor {

    public static void main(String[] args) {
       Provincia provincia=new Provincia("Latacunga",92000);
        Profesor profesor1= new Profesor("Alex","Gutierrez",2000,"1105884595",provincia);
        profesor1.calcularSueldoTotal();
        System.out.println(profesor1);
    }
}

//Integrantes: 
//Alex Gutiérrez
//Israel Asanza


