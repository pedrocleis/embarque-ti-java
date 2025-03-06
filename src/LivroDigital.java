import java.util.ArrayList;

public non-sealed class LivroDigital extends Livro {
    protected String formato;
    protected float tamanho;
    public LivroDigital(String title, String publisher, String ISBN, String category, ArrayList<String> author, String format, float size){
        super(title, publisher, ISBN, category, author);
        formato = format;
        tamanho = size;
    }

    public String getFormato(){
        return formato;
    }

    public float getTamanho(){
        return tamanho;
    }
}
