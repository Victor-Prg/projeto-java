import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciando Marca e Categoria[cite: 1]
        Marca toyota = new Marca(1, "Toyota");
        Categoria sedan = new Categoria(1, "Sedan");

        // 2. Instanciando Veiculo e associando os dados[cite: 1]
        Veiculo veiculo = new Veiculo();
        veiculo.setId(1);
        veiculo.setNome("Corolla");
        veiculo.setCor("Preto");
        veiculo.setAno_modelo("2025/2026");
        veiculo.setN_chassi("9BRBL42EXNZ123456");
        veiculo.setPlaca("BRA2E19");
        veiculo.setData_compra(new Date());
        veiculo.setMarca(toyota);
        veiculo.setCategoria(sedan);

        // Exibindo dados[cite: 1]
        System.out.println("=== DADOS DO VEÍCULO CADASTRADO ===");
        System.out.println("Veículo: " + veiculo.getNome() + " | Cor: " + veiculo.getCor());
        System.out.println("Marca: " + veiculo.getMarca().getNome());
        System.out.println("Categoria: " + veiculo.getCategoria().getNome());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("-----------------------------------\n");

        // Executando métodos de Marca[cite: 1]
        System.out.println("[TESTE - MARCA]");
        toyota.salvar();
        toyota.alterar();
        toyota.pesquisar();
        toyota.excluir();

        System.out.println();

        // Executando métodos de Categoria[cite: 1]
        System.out.println("[TESTE - CATEGORIA]");
        sedan.salvar();
        sedan.alterar();
        sedan.pesquisar();
        sedan.excluir();

        System.out.println();

        // Executando métodos de Veiculo[cite: 1]
        System.out.println("[TESTE - VEICULO]");
        veiculo.salvar();
        veiculo.alterar();
        veiculo.pesquisar();
        veiculo.excluir();
    }
}