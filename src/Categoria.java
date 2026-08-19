public class Categoria {
    private int id;
    private String nome;

    // Construtor padrão
    public Categoria() {
    }

    // Construtor com parâmetros
    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos
    public void salvar() {
        System.out.println("Método salvar() de Categoria executado com sucesso.");
    }

    public void alterar() {
        System.out.println("Método alterar() de Categoria executado com sucesso.");
    }

    public void excluir() {
        System.out.println("Método excluir() de Categoria executado com sucesso.");
    }

    public void pesquisar() {
        System.out.println("Método pesquisar() de Categoria executado com sucesso.");
    }
}