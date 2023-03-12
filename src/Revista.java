public class Revista extends Publicacion {

    private String idRevista;
    private static int contador;

    public String getIdRevista() {
        return idRevista;
    }

    public Revista(String isbn, String titulo, int anyoPublicacion) {
        super(isbn, titulo, anyoPublicacion);
        contador++;
        String formato = "%06d";
        this.idRevista = String.format(formato, contador);

    }
    
}
