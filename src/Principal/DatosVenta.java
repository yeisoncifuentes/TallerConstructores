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
public class DatosVenta {
    public int cantidadVentas;
    public long ganancias;
    public double porcentajeGanancias ;
    public double porcentajeCandidad ;
    
    /**
     * a la variable se le acumula el valor de los productos vendidos
     * @return ganancias
     */
    protected long ganancias(long valorProducto){
        this.ganancias=this.ganancias+valorProducto;
        return this.ganancias;
    }
    
    /**
     * a la variable se le acumula el valor de los productos vendidos
     * @return ganancias
     */
    protected int cantidadVentas(){
        this.cantidadVentas=this.cantidadVentas+1;
        return this.cantidadVentas;
    }
    /**
     * halla el porcentaje de la cantidad restante
     *
     */
    protected void porcentajeCantidad(int y, int x){
        porcentajeCandidad=(y*100)/x;
        System.out.println("Porcentaje de Productos Restantes: "+ porcentajeCandidad+"%");
    }
    
    /**
     * halla el porcentaje de la ganancias conseguida
     *
     */
    protected void porcentajeGanancia(long y, long x){
        porcentajeGanancias=(y*100)/x;
        System.out.println("Porcentaje de Ganancia: "+ porcentajeGanancias+"%");
    }

    
}
