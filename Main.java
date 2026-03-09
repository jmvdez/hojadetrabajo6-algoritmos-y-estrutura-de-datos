public class Main {

    public static void main(String[] args) {

        HashMapMuseo mapa = new HashMapMuseo();

        ObraArte obra1 = new ObraArte("La Mona Lisa", "Leonardo da Vinci", 1503);
        ObraArte obra2 = new ObraArte("La Noche Estrellada", "Vincent van Gogh", 1889);
        ObraArte obra3 = new ObraArte("El Grito", "Edvard Munch", 1893);

        mapa.insertar(obra1.getNombreObra(), obra1);
        mapa.insertar(obra2.getNombreObra(), obra2);
        mapa.insertar(obra3.getNombreObra(), obra3);

        System.out.println("Contenido del HashMap:");
        mapa.mostrar();

        System.out.println("\nBuscando obra...");

        ObraArte resultado = mapa.buscar("El Grito");

        if (resultado != null) {
            System.out.println("Encontrado: " + resultado);
        } else {
            System.out.println("No encontrado");
        }
    }
}
