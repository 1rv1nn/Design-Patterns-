import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Crear una lista de tareas");
            System.out.println("2. Mostrar todas las listas");
            System.out.println("3. Mostrar la lista de un usuario especifico");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("¿Qué necesitas hacer " + nombre + "? ");
                    String necesidad = scanner.nextLine();
                    System.out.print("¿Qué deberías hacer " + nombre + "? ");
                    String deber = scanner.nextLine();
                    System.out.print("¿Qué quieres hacer "+ nombre + "? ");
                    String querer = scanner.nextLine();

                    ListaToDo listaUsario = new ListaToDo(nombre, necesidad, deber, querer);
                    ListaCliente.agregarLista(listaUsario);
                    System.out.print("\n" + nombre + " tu Lista to do fue creada con éxito\n");
                    break;
                case 2:
                    ListaCliente.mostrarListas();
                    break;
                case 3:
                    System.out.print("\nIngrese el nombre del usuario que deseas ver su lista to do: ");
                    String nombreUsuario = scanner.nextLine();
                    ListaCliente.mostrarListasOtroUsuario(nombreUsuario);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("\nOpción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
    }
}
