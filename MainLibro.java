import java.util.Scanner;

public class MainLibro {
    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        System.out.println("Ingrese nombre del autor");
        String name = p1.next();
        System.out.println("Ingrese el titulo");
        String namebook = p1.next();
        System.out.println("ingrese el numero ISBN");
        int ISNB=p1.nextInt();
        System.out.println("Ingrese el numero de paginas");
        int paginas=p1.nextInt();
        Libro l1=new Libro();
       
        l1.autor=name;
        l1.titulo=namebook;
        l1.ISBN=ISNB;
        l1.numpaginas=paginas;
        l1.mostrarAutor();
        l1.mostrartitulo();
        l1.mostrarISBN();
        l1.mostrarNumPaginas();
    }

}