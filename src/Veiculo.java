import java.util.Date;

public class Veiculo {
    private int id;
    private String nome;
    private String cor;
    private String ano_modelo;
    private String n_chassi;
    private String placa;
    private Date data_compra;
    
    // Relacionamentos
    private Marca marca;
    private Categoria categoria;

    // Construtor padrão
    public Veiculo() {
    }

    // Construtor com parâmetros
    public Veiculo(int id, String nome, String cor, String ano_modelo, String n_chassi, String placa, Date data_compra, Marca marca, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.cor = cor;
        this.ano_modelo = ano_modelo;
        this.n_chassi = n_chassi;
        this.placa = placa;
        this.data_compra = data_compra;
        this.marca = marca;
        this.categoria = categoria;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(String ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public String getN_chassi() {
        return n_chassi;
    }

    public void setN_chassi(String n_chassi) {
        this.n_chassi = n_chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Métodos
    public void salvar() {
        System.out.println("Método salvar() de Veiculo executado com sucesso.");
    }

    public void alterar() {
        System.out.println("Método alterar() de Veiculo executado com sucesso.");
    }

    public void excluir() {
        System.out.println("Método excluir() de Veiculo executado com sucesso.");
    }

    public void pesquisar() {
        System.out.println("Método pesquisar() de Veiculo executado com sucesso.");
    }
}