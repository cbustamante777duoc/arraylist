
package arraylist2;

import static arraylist2.ArregloProductos.StreamEliminarMarcas;
import static arraylist2.ArregloProductos.obtenerProductos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayList2 {

    
    public static void main(String[] args) {
       ArregloProductos arregloProductos = new ArregloProductos();
       //productos a eliminar
       String [] marcas = {"Lacoste","H&M","Ho!"};
       String [] marcas2 = {"adidas","nike"};
       
       
       //lista de productos  que se optiene del arreglo
       //se convertido el arreglo en un arraylist con el fin de modificar la cantidad de productos
        List<Producto> listaProductos = new ArrayList<>(Arrays.asList(arregloProductos.obtenerProductos()));
        
        //impresion de la lista de  productos
        
        listaProductos.forEach(System.out::println);
        
        System.out.println("///////////////////");
        System.out.println("LISTA DE PRODUCTOS ELIMINADOS");
        ArregloProductos.eliminarMarcas(listaProductos, Arrays.asList(marcas));
        
        listaProductos.forEach(System.out::println);
        
        System.out.println("///////////////////");
        System.out.println("LISTA DE PRODUCTOS ELIMINADOS NIKE ADIDAS");
        // usando la programacion funcional
        StreamEliminarMarcas(listaProductos,Arrays.asList(marcas2));
        
        listaProductos.forEach(System.out::println);
    }
    
}
