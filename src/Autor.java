public class Autor {
    private String nomeCompleto, pseudonimo, abreviacao;

    public Autor(String nome, String pseud, String abbr){
        nomeCompleto = nome;
        pseudonimo = pseud;
        abreviacao = abbr; 
    }
    public Autor(String nome, String abbr){
        nomeCompleto = nome;
        abreviacao = abbr;
        pseudonimo = "";
    }
    public Autor(String pseud){
        pseudonimo = pseud;
        abreviacao = "";
        nomeCompleto = "";
    }

    public String get(){
        return pseudonimo.isEmpty() ? abreviacao.isEmpty() ? nomeCompleto : abreviacao : pseudonimo;
    }

    public String getNome(){
        return nomeCompleto;
    }

    public String getAbreviacao(){
        return abreviacao;
    }

    public String getPseudonimo(){
        return pseudonimo;
    }
}
