public class Main {

    public static void main(String[] args){
        Produto[] produto = new Produto[3];
        Servico[] servico = new Servico[3];
        Cliente[] cliente = new Cliente[3];

        produto[0] = new Produto("Arroz", 3);
        produto[1] = new Produto("Biscoito", 9);
        produto[2] = new Produto("Farinha", 2);

        servico[0] = new Servico("Entrega a Domicilio",10.0);
        servico[1] = new Servico("Atendimento personalizado", 35.0);
        servico[2] = new Servico("Plano fidelidade", 50.0);

        cliente[0] = new Cliente("Maurício", "Uberaba");
        cliente[1] = new Cliente("Carla", "Patrocínio");
        cliente[2] = new Cliente("Ana", "Araguari");

        System.out.println("Antes da ordenação:");
        System.out.println("Produto: " + produto[0].getNomeDoProduto() + " - Código: " + produto[0].getCodigo());
        System.out.println("Produto: " + produto[1].getNomeDoProduto() + " - Código: " + produto[1].getCodigo());
        System.out.println("Produto: " + produto[2].getNomeDoProduto() + " - Código: " + produto[2].getCodigo());

        System.out.println("Serviço: " + servico[0].getNomeDoServico() + " - Preço: " + servico[0].getPreco());
        System.out.println("Serviço: " + servico[1].getNomeDoServico() + " - Preço: " + servico[1].getPreco());
        System.out.println("Serviço: " + servico[2].getNomeDoServico() + " - Preço: " + servico[2].getPreco());

        System.out.println("Cliente: " + cliente[0].getNomeDoCliente() + " - Cidade: " + cliente[0].getCidade());
        System.out.println("Cliente: " + cliente[1].getNomeDoCliente() + " - Cidade: " + cliente[1].getCidade());
        System.out.println("Cliente: " + cliente[2].getNomeDoCliente() + " - Cidade: " + cliente[2].getCidade());

        Classificador.ordena(produto);
        Classificador.ordena(servico);
        Classificador.ordena(cliente);

        System.out.println("\nApós a ordenação:");
        System.out.println("Produto: " + produto[0].getNomeDoProduto() + " - Código: " + produto[0].getCodigo());
        System.out.println("Produto: " + produto[1].getNomeDoProduto() + " - Código: " + produto[1].getCodigo());
        System.out.println("Produto: " + produto[2].getNomeDoProduto() + " - Código: " + produto[2].getCodigo());

        System.out.println("Serviço: " + servico[0].getNomeDoServico() + " - Preço: " + servico[0].getPreco());
        System.out.println("Serviço: " + servico[1].getNomeDoServico() + " - Preço: " + servico[1].getPreco());
        System.out.println("Serviço: " + servico[2].getNomeDoServico() + " - Preço: " + servico[2].getPreco());

        System.out.println("Cliente: " + cliente[0].getNomeDoCliente() + " - Cidade: " + cliente[0].getCidade());
        System.out.println("Cliente: " + cliente[1].getNomeDoCliente() + " - Cidade: " + cliente[1].getCidade());
        System.out.println("Cliente: " + cliente[2].getNomeDoCliente() + " - Cidade: " + cliente[2].getCidade());
    }
}
