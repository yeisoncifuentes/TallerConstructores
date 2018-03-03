/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author YEISON
 */
public class Dispensador {
    public String produto;
    public long valorProducto;
    public int cantidadProductos;
    public int casillaProducto;
    
    
    /**
     * constructor para definir las variables
     */
    
    Dispensador(String producto,int valorProducto,int cantidadProducto,int casillaProducto){
       this.produto=producto;
       this.valorProducto=valorProducto;
       this.cantidadProductos=cantidadProducto;
       this.casillaProducto=casillaProducto;
    }
    /**
     * muestra los valores del constructor
     */
    protected String datosProducto(){
        String datos=this.casillaProducto+".";
        datos+="\nProducto: "+this.produto;
        datos+="\nPrecio: "+this.valorProducto;
        datos+="\nCandidad disponible: "+this.cantidadProductos;
        
        return datos;
    }
    
}
