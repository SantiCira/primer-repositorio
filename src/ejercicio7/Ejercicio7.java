/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import Persona.Persona;
import Persona.PersonaServi;
import java.util.Scanner;

/**
 *
 * @author desktop
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores. */

        Scanner leer = new Scanner(System.in);
        PersonaServi P1 = new PersonaServi();
        Persona C1 = new Persona();
        Persona C2 = new Persona();
        Persona C3 = new Persona();
        Persona C4 = new Persona();

       
        
        System.out.println("Hola! Bienvenido a nuestro servicio de crear personas");
        int opcion;
        String confirmacion = null;
        do {
            System.out.println("---MENÚ---");
            System.out.println("Seleccione la opcion que quiera ejecutar");
            System.out.println("1-Crear persona");
            System.out.println("2-Calcular ICM");
            System.out.println("3-Saber si es mayor de edad");
            System.out.println("4-SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                     C1=P1.crearPersona(C1);
                    break;
                case 2:
                    P1.calcularIMC(C1);
                    break;
                case 3:
                    P1.esMayorDeEdad(C1);
                    break;
                case 4:
                    System.out.println("Esta seguro que quiere salir?(si/no)");
                    confirmacion = leer.next();
                    confirmacion = confirmacion.toUpperCase();
                    break;
            }
        } while (!"SI".equals(confirmacion));

        System.out.println("Hola! Bienvenido a nuestro servicio de crear personas");
        
        do {
            System.out.println("Persona 2");
            System.out.println("---MENÚ---");
            System.out.println("Seleccione la opcion que quiera ejecutar");
            System.out.println("1-Crear persona");
            System.out.println("2-Calcular ICM");
            System.out.println("3-Saber si es mayor de edad");
            System.out.println("4-SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                     C2=P1.crearPersona(C2);
                    break;
                case 2:
                    P1.calcularIMC(C2);
                    break;
                case 3:
                    P1.esMayorDeEdad(C2);
                    break;
                case 4:
                    System.out.println("Esta seguro que quiere salir?(si/no)");
                    confirmacion = leer.next();
                    confirmacion = confirmacion.toUpperCase();
                    break;
            }
        } while (!"SI".equals(confirmacion));
        
        System.out.println("Hola! Bienvenido a nuestro servicio de crear personas");
        do {
            System.out.println("Persona 3");
            System.out.println("---MENÚ---");
            System.out.println("Seleccione la opcion que quiera ejecutar");
            System.out.println("1-Crear persona");
            System.out.println("2-Calcular ICM");
            System.out.println("3-Saber si es mayor de edad");
            System.out.println("4-SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                     C3=P1.crearPersona(C3);
                    break;
                case 2:
                    P1.calcularIMC(C3);
                    break;
                case 3:
                    P1.esMayorDeEdad(C3);
                    break;
                case 4:
                    System.out.println("Esta seguro que quiere salir?(si/no)");
                    confirmacion = leer.next();
                    confirmacion = confirmacion.toUpperCase();
                    break;
            }
        } while (!"SI".equals(confirmacion));
        System.out.println("Hola! Bienvenido a nuestro servicio de crear personas");
        do {
            System.out.println("Persona 4");
            System.out.println("---MENÚ---");
            System.out.println("Seleccione la opcion que quiera ejecutar");
            System.out.println("1-Crear persona");
            System.out.println("2-Calcular ICM");
            System.out.println("3-Saber si es mayor de edad");
            System.out.println("4-SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                     C4=P1.crearPersona(C4);
                    break;
                case 2:
                    P1.calcularIMC(C4);
                    break;
                case 3:
                    P1.esMayorDeEdad(C4);
                    break;
                case 4:
                    System.out.println("Esta seguro que quiere salir?(si/no)");
                    confirmacion = leer.next();
                    confirmacion = confirmacion.toUpperCase();
                    break;
            }
        } while (!"SI".equals(confirmacion));
    }

}
