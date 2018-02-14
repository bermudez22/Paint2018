/*
 * esta clase dibuja pentagonos (o eso creo)
 */
package codigo;

import java.awt.Color;


/**
 *
 * @author Diego Álvarez    
 */
public class Pentagono extends Forma{
       public Pentagono (int _posX, int _posY, Color _color, boolean _relleno){
         //inicializo el constructor del triangulo
         super(_posX, _posY, 5, _color, _relleno);
         
    }
  
}
