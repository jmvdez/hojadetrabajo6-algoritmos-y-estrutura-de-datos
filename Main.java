import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMapMuseo mapa = new HashMapMuseo();

        int opcion = 0;

        System.out.println("SISTEMA DE GESTION MUSEO");

        do {
            System.out.println("\nSeleccione una opcion:");
            System.out.println("1. Agregar obra");
            System.out.println("2. Buscar obra");
            System.out.println("3. Mostrar todas las obras");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");

            if (!sc.hasNextInt()) {
                System.out.println("Entrada invalida. Intente nuevamente.");
                sc.nextLine();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.println("\n- Agregar nueva obra -");

                    System.out.print("Nombre de la obra: ");
                    String nombre = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Año de creacion: ");
                    int anio;

                    if (!sc.hasNextInt()) {
                        System.out.println("Año invalido. Operacion cancelada.");
                        sc.nextLine();
                        break;
                    }

                    anio = sc.nextInt();
                    sc.nextLine();

                    ObraArte nueva = new ObraArte(nombre, autor, anio);
                    mapa.insertar(nombre, nueva);

                    System.out.println("Obra agregada correctamente.");
                    break;

                case 2:
                    System.out.println("\n- Buscar obra -");

                    System.out.print("Ingrese el nombre de la obra: ");
                    String claveBuscar = sc.nextLine();

                    ObraArte resultado = mapa.buscar(claveBuscar);

                    if (resultado != null) {
                        System.out.println("Obra encontrada:");
                        System.out.println(resultado);
                    } else {
                        System.out.println("La obra no se encuentra en el sistema.");
                    }
                    break;

                case 3:
                    System.out.println("\n- Obras registradas -");
                    mapa.mostrar();
                    break;

                case 4:
                    System.out.println("\nChau.");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
