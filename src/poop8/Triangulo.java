/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 Se crea la clase triangulo que contiene las caracterizticas:alfa,beta,gama,a,b,c,base,altura y hereda de poligono
 */
public class Triangulo extends Poligono{
    
private int alfa, beta, gama;
private float a, b, c;
private float base, altura;

    public Triangulo() {
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + '}';
    } 


    
}
