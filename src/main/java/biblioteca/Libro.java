/*
package biblioteca;

public class Libro extends Publicacion implements Prestable{
    private boolean prestado=false;

    public Libro(String isbn, String titulo,int anoPublicacion ){
        super(isbn,titulo,anoPublicacion);
    }
    @Override
    public void presta(){
        if(this.prestado){
            System.out.println("El libro no esta prestado");
        }else{
            System.out.println("El libro esta prestado");
        }
    }
    @Override
    public void devuelve(){
        this.prestado=false;
    }
    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
    }
}
*/