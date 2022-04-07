/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
Se crea la clase cuadrilatero que contiene las caracterizticas:alfa,beta,gama,a,b,base,altura y hereda de poligono
 */
public class Cuadrilatero extends Poligono {
private int alfa, beta, gama;
private float a, b;
private float base, altura;

    public Cuadrilatero() {
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        
        return "Cuadrilatero{" + '}';
    }


}
