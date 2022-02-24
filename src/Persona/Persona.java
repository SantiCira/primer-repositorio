/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author desktop
 */
public class Persona {
    private String nombre;
    private String sexo;
    private int edad;
    private double peso;
    private double altura;
    private int ICM;
    private boolean mayor;
    

    public Persona() {
    }

    public int getICM() {
        return ICM;
    }

    public void setICM(int ICM) {
        this.ICM = ICM;
    }

    public Persona(String nombre, String sexo, int edad, double peso, double altura,boolean mayor, int ICM) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.mayor= mayor;
        this.ICM= ICM;
    }

    public boolean isMayor() {
        return mayor;
    }

    public void setMayor(boolean mayor) {
        this.mayor = mayor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
