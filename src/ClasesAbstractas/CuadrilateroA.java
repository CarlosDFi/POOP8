/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesAbstractas;

/**
Se crea la clase abstracta cuadrilatero que contiene las caracterizticas:alfa,beta,gama,a,b,base,altura y hereda de poligono
 */
public class CuadrilateroA extends PoligonoAbstracto {
private int alfa, beta, gama;
private float a, b;
private float base, altura;

    public CuadrilateroA() {
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        
        return "CuadrilateroA{" + '}';
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2*(a+b);
    }


}
