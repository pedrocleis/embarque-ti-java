import java.util.HashMap;
import java.util.Scanner; 

public class Biblioteca {

    Scanner sc = new Scanner(System.in);
    private HashMap<String, Livro> acervo = new HashMap<String, Livro>();

    public void adicionarLivro(){
        System.out.println("O livro e digital ou fisico? (1 - digital 2 - fisico)");
        int midia = sc.nextInt();
        System.out.print("E qual eh o titulo do livro: ");
        String titulo = sc.nextLine();
        System.out.print("E qual é a editora do livro: ");
        String editora = sc.nextLine();
        System.out.print("Informe o ISBN do livro: ");
        String isbn = sc.nextLine();
        System.out.print("E como o nome do autor esta escrito na capa: ");
        String abbr = sc.nextLine();
        // if() tem, show
        // else pergunta mais
        
        System.out.print("Informe a(s) Cate: ");
        String isbn = sc.nextLine();



        

        Livro l;
        acervo.put(l.getIsbn(), l);
    }

    public void removerLivro(String chave){

        acervo.remove(chave);
    }

    public void listarLivros(){
        for(Livro livro : acervo.values()){
            System.out.println(livro);
        }
    }

    // public void listarLivros(){
        
    // }

}
