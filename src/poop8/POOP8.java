/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

import ClasesAbstractas.PoligonoAbstracto;
import ClasesAbstractas.TrianguloA;
import Interfaces.Flauta;
import Interfaces.InstrumentoMusical;
import calendario.Meses;



public class POOP8 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("########### Clases se compprtan como sus ###########");    
        
      /*  Poligono poligono = new Poligono();
        Triangulo triangulo = new Triangulo();
        Cuadrilatero cuadrilatero = new Cuadrilatero ();
        
        
        Object objeto = poligono;
        System.out.println(objeto);
        
        poligono = triangulo;
        System.out.println(poligono);
        
        poligono = cuadrilatero;
        System.out.println(cuadrilatero);
        
        objeto= triangulo;
        System.out.println(objeto);   */
        
        // cuadriltero = poligono; esto no se puede ya que no puedes almacenar padres en los hijos
        // triangulo = cuadrilatero; no se puede alamcenar una clase en otra del mismo nivel
        // PoligonoAbstracto pol = new PoligonoAbstracto(); No se puede debido a que es un abstract
        
        PoligonoAbstracto pol;
        pol = new TrianguloA();
        System.out.println(pol);
        /**
declaramos un poligono abstracto de tipo triangulo abstracto y lo mandamos a llamar
 */
        System.out.println("########## Interfaces ##########");
        InstrumentoMusical instrumento;
        instrumento = new Flauta ();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
            /**
declaramos un instrumento y lo hacemos tocar, luego lo imprimimos
 */
        System.out.println("######## Interfaces como almacenes ########");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-33));
        System.out.println("###########################################");
        System.out.println("El mes"+ Meses.DOS+"corresponde a"+Meses.NOMBRE_MESES[Meses.DOS]);
    }
     
}
