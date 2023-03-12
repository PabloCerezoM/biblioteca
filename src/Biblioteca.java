public class Biblioteca {
    public static void main(String[] args) throws Exception {

        Libro libro1 = new Libro("ES899889988", "El Quijote", 1616);
        Revista revista1 = new Revista("ES84364793", "Cience", 2023);

        System.out.println("Estado incial del atributo prestado del libro:");
        System.out.println(libro1.estaPrestado());
        libro1.presta();
        System.out.println("Estado del libro después de llamar al método 'presta()':");
        System.out.println(libro1.estaPrestado());

        System.out.println("Resultado de llamar al método 'getIdRevista()' después de instanciar un objeto revista: ");
        System.out.println(revista1.getIdRevista());




    }
}
