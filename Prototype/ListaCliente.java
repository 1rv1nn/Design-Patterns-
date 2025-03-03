import java.util.ArrayList;
import java.util.List;


/**
 * ListaCliente. Clase que utiliza el prototipo para crear nuevas listas de tareas.
 */

public class ListaCliente{

    private ToDo toDoPrototipo;

    public ListaCliente(ToDo toDoPrototipo){
        this.toDoPrototipo = toDoPrototipo;
    }

    public ToDo createListaToDo(){
        return toDoPrototipo.clone();
    }

    private static final List<ListaToDo> listas = new ArrayList<>();


    public static void agregarLista(ListaToDo lista){
        listas.add(lista);
    }

    public static void mostrarListas(){
        if(listas.isEmpty()){
            System.out.println("\nNo hay listas registradas aún.");
            return;
        }

        System.out.println("\nListas de tareas registradas:");
        for (ListaToDo lista : listas) {
            lista.mostrarTareas();
        }
    }

    //Método para mostrar las listas de otro usuarios

    public static void mostrarListasOtroUsuario(String usuario){
       boolean encontrado = false;
         for (ListaToDo lista : listas) {
              if(lista.getNombreUsuario().equalsIgnoreCase(usuario)){
                lista.mostrarTareas();
                encontrado = true;
              }
         }
         if(!encontrado){
             System.out.println("\nNo hay listas de otros usuarios disponibles.");
         }
    }

}