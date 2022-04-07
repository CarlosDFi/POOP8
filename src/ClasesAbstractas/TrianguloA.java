/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesAbstractas;

/**
Se crea la clase abstracta triangulo que contiene las caracterizticas:alfa,beta,gama,a,b,c,base,altura y hereda de poligono
 */
public class TrianguloA extends PoligonoAbstracto{
    
private int alfa, beta, gama;
private float a, b, c;
private float base, altura;

    public TrianguloA() {
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "TrianguloA{" + '}';
    }

    @Override
    public double area() {
    return base*altura/2;
    }

    @Override
    public double perimetro() {
    return a+b+c;
    }

    
}
