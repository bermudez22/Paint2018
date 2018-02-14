/*
 * esta clase dibuja pentagonos (o eso creo)
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Diego Álvarez    
 */
public class Pentagono extends Polygon{
    public Color color= null;
    public boolean relleno = false;
    //coordenadas del centro del pentagono
    public int x = 0;
    public int y =0;
    
     public Pentagono (int _posX, int _posY, int _altura, Color _color, boolean _relleno){
         //inicializo el constructor del pentagono
         super(new int[5],new int[5],5);
         //guardo el centro del pentagono
         this.x =_posX;
         this.y=_posY;
      
        color = _color;
        relleno = _relleno;
    }
     
     public void dibujate(Graphics2D g2, int _posY){
        //redibujas el pentagono (TODO)
        calculaVertices(y - _posY);
        g2.setColor(color);
        if(relleno){
            g2.fill(this);
    }
        else{
            g2.draw(this);
        }
    }
     
     //Recalcula la posicion de los vertices en un poligono regular
     private void calculaVertices (int _radio){
     for(int i=0; i<npoints;i++){
             this.xpoints[i] = (int) (x + _radio*Math.cos(2*Math.PI*i/npoints));
             this.ypoints[i] = (int) (y + _radio*Math.sin(2*Math.PI*i/npoints));
         }
     
     }
}
