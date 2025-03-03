/**
 * listaToDo. Prototipo Concreto.
 * @author Irvin Javier Cruz Gonzalez
 * @version 1.0 03/03/2025  
 * @since IS
 */

 /*
  * Este es un especifica lista,  que implementa la interfaz ToDo,
  * y define los métodos necesarios para crear una lista de tareas.
  */

public class ListaToDo implements ToDo {
    private String nombreUsuario;
    private String necesidad;
    private String deber;
    private String querer;

public ListaToDo(String nombreUsuario, String necesidad, String deber, String querer){
    this.nombreUsuario = nombreUsuario;
    this.necesidad = necesidad;
    this.deber = deber;
    this.querer = querer;
}

public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
}

public void setNecesidad(String necesidad) {
    this.necesidad = necesidad;
}

public void setDeber(String deber) {
    this.deber = deber;
}

public void setQuerer(String querer) {
    this.querer = querer;
}

public String getNombreUsuario() {
    return nombreUsuario;
}

@Override
public ToDo clone() {
    return new ListaToDo(nombreUsuario, necesidad, deber, querer);
}

public void mostrarTareas() {
    System.out.println("\nUsuario: " + nombreUsuario);
    System.out.println("  - Yo necesito: " + necesidad);
    System.out.println("  - Yo debería: " + deber);
    System.out.println("  - Yo quiero: " + querer);
    System.out.println("-------------------------------");
}




}