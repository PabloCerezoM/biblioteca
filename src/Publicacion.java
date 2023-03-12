public class Publicacion {
    
    private String isbn;
    private String titulo;
    private int anyoPublicacion;

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    public Publicacion(String isbn, String titulo, int anyoPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anyoPublicacion = anyoPublicacion;
    }

}
