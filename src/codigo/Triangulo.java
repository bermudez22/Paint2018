/*
 * esta clase dibuja triangulos
 */
package codigo;

import java.awt.Color;


/**
 *
 * @author Juan Antonio Bermudez Chacon Álvarez    
 */
public class Triangulo extends Forma{
   
     public Triangulo (int _posX, int _posY, Color _color, boolean _relleno){
         //inicializo el constructor del triangulo
         super(_posX, _posY, 3, _color, _relleno);
         
    }
     

}
