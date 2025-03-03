
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

    
}