import java.util.ArrayList;

public class Biblioteca {
    
    private ArrayList<Livro> livros = new ArrayList();
    
    public void incluirLivro(Livro livro){
        if(!(livros.contains(livro))){
            livros.add(livro);
        }
    }
    
    public void excluirLivro(Livro livro){
        if(livros.contains(livro)){
            livros.remove(livro);
        }
    }
}