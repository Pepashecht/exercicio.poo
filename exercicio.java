// Classe Produto - base para outros tipos
class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$%.2f\n", preco);
    }
}

// Subclasse que representa um livro
class Livro extends Produto {
    private String autor;
    private int paginas;
    private boolean capaDura;

    public Livro(String nome, double preco, String autor, int paginas, boolean capaDura) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
        this.capaDura = capaDura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // chama método da classe pai
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("Capa dura: " + (capaDura ? "Sim" : "Não"));
    }
}

// Subclasse que representa uma camisa
class Camisa extends Produto {
    private String cor;
    private String tamanho;
    private String tecido;

    public Camisa(String nome, double preco, String cor, String tamanho, String tecido) {
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
        this.tecido = tecido;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // reaproveita exibição do Produto
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Tecido: " + tecido);
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando um livro
        Livro livro1 = new Livro("1984", 42.50, "George Orwell", 328, false);

        // Criando uma camisa
        Camisa camisa1 = new Camisa("Camisa Social", 79.90, "Branca", "G", "Algodão");

        // Exibindo as informações
        System.out.println("=== Dados do Livro ===");
        livro1.exibirInfo();

        System.out.println("\n=== Dados da Camisa ===");
        camisa1.exibirInfo();
    }
}
