/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.Scanner;
/**
 *
 * @author YEISON
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        
        int opcion;
        int producto;
        int num[]={30,10,10,20,0,0};
        int anadir;
        String nombreProducto[]={"Vacio","Vacio"};
        int valorProducto[]={0,0};
        
        DatosVenta obj7=new DatosVenta();
        
       
        do{
            int cantidadTotal=num[0]+num[1]+num[2]+num[3];
            long totalGanancia=((2000*num[0])+(1000*num[1])+(2000*num[2])+(1500*num[3]));
            Dispensador obj1= new Dispensador(" Margarita", 2000,num[0],1);
            System.out.println(obj1.datosProducto());
            System.out.println("_______________________");
            Dispensador obj2= new Dispensador("Galletas", 1000, num[1],2);
            System.out.println(obj2.datosProducto());
            System.out.println("_______________________");
            Dispensador obj3= new Dispensador("Chitos", 2000, num[2],3);
            System.out.println(obj3.datosProducto());
            System.out.println("_______________________");
            Dispensador obj4= new Dispensador("Chocorramo", 1500, num[3],4);
            System.out.println(obj4.datosProducto());
            System.out.println("_______________________");
            Dispensador obj5= new Dispensador(nombreProducto[0], valorProducto[0],num[4],5);
            System.out.println(obj5.datosProducto());
            System.out.println("_______________________");
            Dispensador obj6= new Dispensador(nombreProducto[1], valorProducto[1],num[5],6);
            System.out.println(obj6.datosProducto());
            System.out.println("_______________________");
            System.out.println("\n\n");
            
            
            
            
            System.out.println("INGRESE UNA OPCION");
            System.out.println("1. COMPRAR");
            System.out.println("2. AÑADIR CANTIDAD");
            System.out.println("3. AÑADIR PRODUCTO");
            System.out.println("4. GANANCIAS");
            System.out.println("5. CANTIDAD DE PRODUCTOS VENDIDOS");
            System.out.println("6. PORCENTAJE DE PRODUCTOS RESTANTES");
            System.out.println("7. PORCENTAJE GANANCIA");
            System.out.println("0. SALIR");
            System.out.println("_____________________________");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Digite el numero del producto");
                    producto = leer.nextInt();
                    if(num[producto-1]==0){
                                System.out.println("\n\n\n\n\n");
                                System.out.println("lo sentimos este producto ya se acabo o no existe aun");
                                break;
                            }
                    System.out.println("GRACIAS POR SU COMPRA");
                    switch(producto){
                        case 1:
                            
                            num[0]=obj1.cantidadProductos;
                            num[0]=num[0]-1;
                            
                            obj7.ganancias(obj1.valorProducto);
                            obj7.cantidadVentas();
                            break;
                        case 2:
                            num[1]=obj2.cantidadProductos;
                            num[1]=num[1]-1;
                            obj7.ganancias(obj2.valorProducto);
                            obj7.cantidadVentas();
                            break;
                        case 3:
                            num[2]=obj3.cantidadProductos;
                            num[2]=num[2]-1;
                            obj7.ganancias(obj3.valorProducto);
                            obj7.cantidadVentas();
                            break;
                        case 4:
                            num[3]=obj4.cantidadProductos;
                            num[3]=num[3]-1;
                            obj7.ganancias(obj4.valorProducto);
                            obj7.cantidadVentas();
                            break;
                        case 5:
                            
                            num[4]=obj5.cantidadProductos;
                            num[4]=num[4]-1;
                            obj7.ganancias(obj5.valorProducto);
                            obj7.cantidadVentas();
                            break;
                            
                        case 6:
                            num[5]=obj6.cantidadProductos;
                            num[5]=num[5]-1;
                            obj7.ganancias(obj6.valorProducto);
                            obj7.cantidadVentas();
                            break; 
                        default:
                               System.out.println("OPCION INVALIDA");
                            
                    }
                    
                    break;
                case 2:  
                    System.out.println("Digite el numero del producto");
                    producto = leer.nextInt();
                    System.out.println("Digite la cantidad de unidades que quiere establecer del producto");
                    anadir = leer.nextInt();
                    switch(producto){
                        case 1:
                            num[0]=anadir;
                            
                            break;
                        case 2:
                            num[1]=anadir;
                            break;
                        case 3:
                            num[2]=anadir;
                            break;
                        case 4:
                           num[3]=anadir;
                            break;
                            
                        case 5:
                            num[4]=anadir;
                            break;
                           
                            
                            
                        case 6:
                            num[5]=anadir;
                            break; 
                        default:
                            System.out.println("opcion no valida");    
                            
                        }
                    break;
                case 3:    
                    System.out.println("Digite el numero del producto que quiere crear 5 o 6 ");
                    producto=leer.nextInt();
                    switch(producto){
                        case 5:
                            System.out.println("Digite el nombre del producto");
                            nombreProducto[0]=leer.nextLine();
                            nombreProducto[0]=leer.nextLine();
                            System.out.println("Digite el valor del producto");
                            valorProducto[0]=leer.nextInt();
                            System.out.println("Digite la cantdad de unidades del producto");
                            num[4]=leer.nextInt();
                            
                             
                             
                             break;
                        case 6:
                            System.out.println("Digite el nombre del producto");
                            nombreProducto[1]=leer.nextLine();
                            nombreProducto[1]=leer.nextLine();
                            System.out.println("Digite el valor del producto");
                            valorProducto[1]=leer.nextInt();
                            System.out.println("Digite la cantdad de unidades del producto");
                            num[5]=leer.nextInt();
                            break;
                        default:
                            System.out.println("Esta casilla ya tiene productos o no existe");
                    }
                    break;
                   
                case 4:
                    System.out.println("las ganancias son: "+obj7.ganancias);
                            
                    break;  
                case 5:
                    System.out.println("Cantidad de objetos Vendidos: "+obj7.cantidadVentas);
                            
                    break;  
                case 6:
                   
                       obj7.porcentajeCantidad(cantidadTotal, cantidadTotal+obj7.cantidadVentas);
                            
                    break;  
                case 7:
                    obj7.porcentajeGanancia(obj7.ganancias, totalGanancia+obj7.ganancias);
                            
                    break;  
                default:
                            System.out.println("opcion no valida");    
                    
            }
          

          for (int i=0;i<4;i++){
              System.out.println("\n");
          }
        }while(opcion!=0);    
     
    

        }
}