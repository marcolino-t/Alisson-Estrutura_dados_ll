public class MainDB {
    public static void main(String[] args) {
        Livro liv = new Livro("O pálido ponto azul");
        liv.setAutor("Carl Sagan");
        liv.setAno("1994");

        LivroDAO objDAO = new LivroDAO();
        objDAO.inserir(liv);
    
}


}
