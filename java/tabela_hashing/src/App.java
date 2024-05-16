import java.util.LinkedList;

public class App {
    static LinkedList tabela[] = new LinkedList[26];
    public static int hash(String valor){
        valor = valor.toLowerCase();
        int codigoAscii = valor.charAt(0);
        int resto = (codigoAscii+7)%26;
        return resto ;
    }

    public static void adiciona(String valor){
        int categoria = hash(valor);
        if (tabela[categoria] == null){
            tabela[categoria] = new LinkedList();
        }
        tabela[categoria].add(valor);
        
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        adiciona("astrogildo");
        adiciona("Silvio Santos");
        adiciona("anibal");
        adiciona("creonilso");
        // imprimir todos
        for( LinkedList lista: tabela){
            System.out.println(lista);
        }
        
    }
}