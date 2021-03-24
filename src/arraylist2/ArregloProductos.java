
package arraylist2;

import java.util.List;
import java.util.ListIterator;


public class ArregloProductos {
   private static List<Producto> productos;
    
    public static Producto[] obtenerProductos(){
        Producto[] productos = {
          new Producto("H&M", "Gris", "Pay", "32L"),
          new Producto("H&M", "Verde", "Pay", "32L"),
          new Producto("Zara", "Gris", "Coco", "32L"),
          new Producto("Lacoste", "Verde", "Crown", "32L"),
          new Producto("Farm", "Azul", "Holos", "32L"),
          new Producto("Ho!", "Gris", "Pay", "32L"),
          new Producto("H&M", "Gris", "Pay", "32L"),
          new Producto("H&M", "Gris", "Pay", "32L"),
          new Producto("Lacoste", "Gris", "Pay", "32L"),
          new Producto("adidas", "Gris", "Pay", "32L"),
          new Producto("adidas", "verde", "Pay", "32L"),
          new Producto("adidas", "rojo", "Pay", "32L"),
          new Producto("nike", "azul", "Pay", "32L"),
          new Producto("nike", "amarillo", "Pay", "32L"),
        };
        
        return productos;
    }

    
    //ELIMINAR LOS PRODUCTOS ATRAVES DE ITERADOR
    public static void eliminarMarcas(List<Producto> listaProductos, List<String> marcas){
    for(ListIterator<Producto> iterador = listaProductos.listIterator(); iterador.hasNext();){
        if (marcas.contains(iterador.next().getMarca())) {
            iterador.remove();
        }
    }
    }
    
    //ELIMINAR LOS PRODUCTOS ATRAVES DE LAMBAS 
    public static void StreamEliminarMarcas(List<Producto> listaProductos, List<String> marcas){
    listaProductos.removeIf((producto) -> marcas.contains(producto.getMarca()));
    
     
    
    }
 
    
            
    
}
