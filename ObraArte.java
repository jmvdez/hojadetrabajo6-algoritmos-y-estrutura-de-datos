public class ObraArte {

    String nombreObra;
    String autor;
    int anioCreacion;

    public ObraArte(String nombreObra, String autor, int anioCreacion) {
        this.nombreObra = nombreObra;
        this.autor = autor;
        this.anioCreacion = anioCreacion;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public String toString() {
        return "Obra: " + nombreObra + 
               " | Autor: " + autor + 
               " | Año: " + anioCreacion;
    }
}
