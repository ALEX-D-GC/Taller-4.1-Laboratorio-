package ejecutarestudiante;

import packageEstudiante.Estudiante;
import packageEstudiante.Universidad;

public class EjecutarEstudiante {

    public static void main(String[] args) {

        Universidad universidad = new Universidad("UNL", "Avenida Pio Jaramillo Alvarado");
        Estudiante estudiante1 = new Estudiante("Alex", 7, 5, 1, universidad);
        System.out.println(estudiante1);
    }
}

//Integrantes: 
//Alex Gutiérrez
//Israel Asanza

