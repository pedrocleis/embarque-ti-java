import java.util.ArrayList;


public abstract sealed class Livro implements Catalogavel permits LivroDigital, LivroFisico {

    protected String titulo, editora, isbn;
    protected Autor autor;
    protected Categoria categoria;

    protected Livro(String title, String publisher, String ISBN, String category, ArrayList<String> author){
        titulo = title;
        editora = publisher;
        isbn = ISBN;
        categoria.categoria = category;
        switch (author.size()) {
            case 1:
                autor = new Autor(author.get(0));
                break;
            case 2:
                autor = new Autor(author.get(0), author.get(1));
                break;
            case 3:
                autor = new Autor(author.get(0), author.get(1), author.get(2));
                break;
            default:
                System.out.printf("O livro %s tentou ser criado com %d argumentos\n", title, author.size());
                break;
        }
    }

    public String getTitulo(){
        return titulo;
    }

    public String getEditora(){
        return editora;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getAutor(){
        return autor.get();
    }

    public String toString(){
        return titulo + " " + autor;
    }
}