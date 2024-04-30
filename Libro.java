public class Libro {

    String autor;
    String titulo;
    int ISBN;
    int numpaginas;

    public void mostrarAutor() {
        System.out.println("Nombre del autor:" + this.autor);
    }

public void mostrartitulo(){
    System.out.println("El titulo es :" +this.titulo );
}

public void mostrarISBN(){
    System.out.println("El numero ISBN es:" +this.ISBN);
}

    public void mostrarNumPaginas() {
        System.out.println("Elnumero de paginas es:" + this.numpaginas);
    }

}