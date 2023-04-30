package listasenlazadas;

import java.util.*;
import java.util.LinkedList;

import listasenlazadas.Personas;


public class ListasEnlazadas {

   
    public static void main(String[] args) {
        
// inicializo la Linkedlist
//NOTA:  la linked list no tiene posiciones fijas, por tanto puedo agregar datos al principi, al medio o al final de la lista
   
   LinkedList<Personas> lista = new LinkedList<Personas>();


     
    //lleno la linkedlist
    lista.add(new Personas ("emma",1,23));
     lista.add(new Personas ("ana",2,29));
      lista.add(new Personas ("carlos",3,21));
       lista.add(new Personas ("fabiola",4,10));
  
       //en la linkl puedo agregar un elemento al inicio de la lista
       lista.add(0, new Personas ("prueba",5,10)); //coloque un cero antes de new para decir que va a ir de primero
       
       //recorrer elemento por elemento con for each,solo este porq la linkl esta pensada para ir registro por registro
       //y no por un indice
       for (Personas Per :lista){
           System.out.println("prueba 2 :" +Per.getNombre());
       }
       
       //eliminar datos en linkedlist, tal nombre pero q no se en que posicion esta
       //ejemplo eliminar el nombre emma
       
//       String borrar = "fabiola"; //paso el elemento que quiero eliminar, no el indice
//        for (Personas p2 : lista){
//            if(p2.getNombre().equals(borrar)){
//                lista.remove(p2);
//                break; //se puede ultilizar para salir de este bucle, para reacomodar la lista
//            }
            

//otra forma de eliminar los datos
            String borrar = "fabiola";
Iterator<Personas> iter = lista.iterator();
while (iter.hasNext()) {
    Personas p = iter.next();
    if (p.getNombre().equals(borrar)) {
        iter.remove();
    break;
    }
}          
             //recorro con los datos actulizados
     System.out.println("....................datos eliminados................");
       for (Personas Per :lista){
           System.out.println("datos :" +Per.getNombre() + " edad: " +Per.getEdad());
    }
       //tamaño de la lista
        System.out.println("tamaño: " +lista.size());
        //obtener el primer objeto
        System.out.println("primero: " +lista.getFirst().getNombre().toString());
  //obtener el ultimo objeto
        System.out.println("último: " + lista.peekLast().getNombre().toString()); //puede ser getLast
 
        
         // borrar la lista
        System.out.println("borrando datos");
        lista.clear();
        
        //comprobar si la lista esta vacia o no,  devuelve true or false
        System.out.println("esta vacia la lista?");
        System.out.println("lista: " + lista.isEmpty());
        
        }
        
    }
    

