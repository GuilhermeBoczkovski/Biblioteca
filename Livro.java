import java.util.ArrayList;

public class Livro{
    
    private int codigo;
    private String titulo;
    private int ano;
    private Editora editora;
    private ArrayList<Autor> autores = new ArrayList();
    private int numeroCapitulo;
    private String tituloCapitulo;
    private ArrayList<Capitulo> capitulos = new ArrayList();

    public Livro(int codigo, String titulo, int ano, Editora editora, Autor autor, int numeroCapitulo, String tituloCapitulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        autores.add(autor);
        this.numeroCapitulo = numeroCapitulo;
        this.tituloCapitulo = tituloCapitulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }	 	  	  		      	     	      			       	 	

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Editora getEditora() {
        return this.editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    
    public void incluirAutor(Autor autor){
        if(autor != null){
            boolean existe = false;
            for(Autor autorExistente : autores) {
                if(autorExistente.getNome().equals(autor.getNome()) && autorExistente.getCodigo() == autor.getCodigo()){
                    existe = true;
                }
            }
            if(!existe){
                autores.add(autor);
            }	 	  	  		      	     	      			       	 	
        }
    }
    
    public void excluirAutor(Autor autor){
        if(autores.contains(autor)){
            autores.remove(autor);
        }
    }
    
    public void incluirCapitulo(int numero, String tituloCapitulo){
        boolean existe = false;
        for (Capitulo capituloExistente : capitulos) {
            if(capituloExistente.getTitulo().equals(tituloCapitulo)){
                existe = true;
            }
        }
        if(!existe){
            Capitulo capitulo = new Capitulo(numero, tituloCapitulo);
            capitulos.add(capitulo);
        }
    }
    
    public void excluirCapitulo(String tituloCapitulo){
        for (Capitulo capituloExistente : capitulos) {
            if(capituloExistente.getTitulo().equals(tituloCapitulo)){
                capitulos.remove(capituloExistente);
            }
        }
    }
    
    public Capitulo findCapituloByTitulo(String capTitulo){
        for (Capitulo capituloExistente : capitulos) {
            if(capituloExistente.getTitulo().equals(tituloCapitulo)){
                return capituloExistente;
            }
        }	 	  	  		      	     	      			       	 	
        return null;
    }
}