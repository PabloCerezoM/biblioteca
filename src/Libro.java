public final class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro (String isbn, String titulo, int anyoPublicacion) {
        super(isbn, isbn, anyoPublicacion);
        this.prestado = false;
    }

    @Override
    public void presta() {
        this.prestado = true;
    }

    @Override
    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;

    }

    
}
