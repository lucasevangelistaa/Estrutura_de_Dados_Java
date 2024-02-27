public class CadastroLivro {
    public static void main(String[] args)  {
        Livro livro = new Livro();

        livro.nome = "Java como Programar";
        livro.descricao = "Primeiros passos...";
        livro.valor = 59.90;
        livro.isbn = "987-65-4321-3";

        System.out.println("Nome: " + livro.nome);
        System.out.println("Descrição: " + livro.descricao);
        System.out.println("Valor: " + livro.valor);
        System.out.println("ISBN: " + livro.isbn);
    }
}