/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesAbstractas;

/**
Se crea la clase abstracta poligono que contiene las caracterizticas:area,perimetro
 */
public abstract class PoligonoAbstracto {
    
    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "PoligonoAbstracto{" + '}';
    }
    
    
    
}
