public class Main {
    public static void main(String[] args) {
        Livro obj1= new Livro("Calculo I");
        //System.out.println(obj1);
        Livro obj2 = new Livro("Estrutura de Dados");
        //System.out.println(obj2);
        Livro obj3 = new Livro("Banco de Dados");
        //System.out.println(obj3);

        // instanciar biblioteca
        Biblioteca bib = new Biblioteca();
        bib.inserir(obj1);
        bib.inserir(obj2);
        bib.inserir(obj2);

        bib.listarTodos();

        System.out.println("Buscando livro");
        bib.BuscaLivros(2
        );
        //bib.Remocao(1);
        bib.listarTodos();
        
    }
    
}
