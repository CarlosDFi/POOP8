/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 funcion instrumento viento permite ejecutar la funcion tocar y afinar
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{

    public InstrumentoViento() {
    }
    

    @Override
    public void tocar() {
        System.out.println("tocando instrumento");
    }

    @Override
    public void afinar() {
        System.out.println("afinando instrumento");
    }

    @Override
    public String tipoInstrumento() {
    return "instrumento de viento";    
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
}
