/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espch.primerproyectoa;

public class PrimerProyectoA {

    public static void main(String[] args) {
        Estudiantes estudianteUno = new Estudiantes();
        estudianteUno.nombre="Alicia";
        estudianteUno.identificacion= 220048937;
        System.out.println("calificaion"+estudianteUno.calificacionPromedio);
        estudianteUno.grado= "pao2";
        System.out.println("Alicia"+estudianteUno.nombre);
        System.out.println("Identificacion"+ estudianteUno.identificacion);
        System.out.println("Pao2"+estudianteUno.grado);
        System.out.println("calificacion"+estudianteUno.calificacionPromedio);
    }
}
