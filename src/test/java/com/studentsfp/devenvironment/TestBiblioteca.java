/* package biblioteca;

import org.junit.jupiter.api.Test;

@Test
public class TestBiblioteca {
    public static void main(String[] args) {
        Libro ruta_prohibida = new Libro("123456", "La Ruta Prohibida", 2007);
        Libro los_otros = new Libro("112233", "Los Otros", 2016);
        Libro rosa_del_mundo = new Libro("456789", "La rosa del mundo", 1995);
        Revista revista1 = new Revista("444555", "Año Cero", 2019, 344);
        Revista revista2 = new Revista("002244", "National Geographic", 2003, 255);
        System.out.println(ruta_prohibida);
        System.out.println(los_otros);
        System.out.println(rosa_del_mundo);
        System.out.println(revista1);
        System.out.println(revista2);
        los_otros.presta();
        if (los_otros.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        los_otros.presta();
        los_otros.devuelve();
        if (los_otros.estaPrestado()) {System.out.println("El libro está prestado");
        }
        rosa_del_mundo.presta();
        System.out.println(los_otros);
        System.out.println(rosa_del_mundo);
    }
}

 */