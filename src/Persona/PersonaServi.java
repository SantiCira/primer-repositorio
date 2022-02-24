/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Scanner;

/**
 *
 * @author desktop
 */
public class PersonaServi {

    /*
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(Persona C1) {
        System.out.println("Ingrese su nombre");
        C1.setNombre(leer.next());

        System.out.println("Ingrese el sexo: (M), (H), u (O)");
        C1.setSexo(leer.next());
        while ((!C1.getSexo().equalsIgnoreCase("H") && !C1.getSexo().equalsIgnoreCase("M") && !C1.getSexo().equalsIgnoreCase("O"))) {
            System.out.println("Ingrese alguna letra de las especificadas anteriormente!");
            C1.setSexo(leer.next());
        }

        System.out.println("Ingrese su edad");
        C1.setEdad(leer.nextInt());
        System.out.println("Ingrese su peso");
        C1.setPeso(leer.nextInt());
        System.out.println("Ingrese su altura");
        C1.setAltura(leer.nextInt());
        return C1;
    }

    //CALCULAR ICM
    public void calcularIMC(Persona C1) {
   
        C1.setICM((int) ((C1.getPeso()) / C1.getAltura()*C1.getAltura()));
        if (C1.getICM() <= 20) {
            System.out.println("Esta por debajo del peso ideal");
           
        }else if (C1.getICM() >= 20 && C1.getICM() <= 25) {
            System.out.println("Esta en un peso ideal");
         
        }else if (C1.getICM() > 25) {
            System.out.println("Usted tiene sobrepeso");
        
        }
      
    }
    /*public Persona2 CalcularIMC(Persona2 L1) {
        double IMC = 0;
        IMC IM = L1.getPeso() / L1.getAltura() * L1.getAltura();
        if (IMC < 20) {
            L1.setIMC(-1);
            System.out.println("-1");
        } else if (IMC <= 25) {
            L1.setIMC(0);
            System.out.println("0");
        } else {
            L1.setIMC(1);
            System.out.println("1");
        }
        return L1;

    */

    /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
     */
    public void esMayorDeEdad(Persona C1) {
        if (C1.getEdad() >= 18) {
            C1.setMayor(true);
            System.out.println("Es mayor de edad");
        } else {
            C1.setMayor(false);
            System.out.println("No es mayor de edad");
        }
        
    }
}
