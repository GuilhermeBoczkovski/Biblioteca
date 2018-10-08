public class Capitulo{
    
    private int numero;
    private String titulo;

    public Capitulo(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int codigo) {
        this.numero = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
            
}