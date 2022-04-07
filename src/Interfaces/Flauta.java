/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
clase flauta hereda instrumendoviento y retorna flauta
 */
public class Flauta extends InstrumentoViento {

    public Flauta() {
    }
   
    
   @Override
   public String tipoInstrumento(){
   return "Flauta";
   }

    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
   
   
    
}
