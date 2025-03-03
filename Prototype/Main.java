public class Main {
    public static void main(String[] args) {
        // Se crea un prototipo de lista to do
        ToDo toDoPrototipo = new ListaToDo("Irvin", "Comer", "Estudiar", "Dormir");

        // Se crea un cliente que utiliza el prototipo
        ListaCliente cliente = new ListaCliente(toDoPrototipo);

        // Usa el prototipo para crear una nueva lista
        ToDo lista1 = cliente.createListaToDo();

        // Se imprime la lista
        ((ListaToDo) lista1).mostrarTareas();
       
}
}