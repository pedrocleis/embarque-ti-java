import java.util.ArrayList;

public non-sealed class LivroFisico extends Livro implements Emprestavel {
    
    private int copiasDisponiveis;
    
    
    public LivroFisico(String title, String publisher, String ISBN, String category, ArrayList<String> author, int copias){
        super(title, publisher, ISBN, category, author);
        copiasDisponiveis = copias;
    }

    public void emprestar(){
        copiasDisponiveis--;
    }

    public void devolver(){
        copiasDisponiveis++;
    }
}