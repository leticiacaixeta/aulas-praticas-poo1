import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome[] = new String[4];
        float preco[] = new float[4];
        int qtd_estoque[] = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("Informe o nome, o preco e a qtd. em estoque do produto %d:\n", i + 1);
            entrada.nextLine();
            nome[i] = entrada.nextLine();
            preco[i] = entrada.nextFloat();
            qtd_estoque[i] = entrada.nextInt();
        }

        System.out.println("Aumentando o preco em 10% do produto 1 e 3");
        preco[0] = altera_preco(preco[0], -90);
        preco[2] = altera_preco(preco[2], 10);

        System.out.println("Reduzindo o preco em 5% do produto 2");
        if (altera_preco(preco[1], -5) == -1) {
            System.out.println("Erro: preco nao alterado. Porcentagem invalida");

        } else {
            preco[1] = altera_preco(preco[1], -5);
            System.out.println("Preco alterado com sucesso");
        }

        System.out.println("Alterando o preco do prod. 3");
        if (altera_preco(preco[3], -110) == -1) {
            System.out.println("Erro: preco nao alterado. Porcentagem invalida");
        }

        System.out.println("Produtos Cadastrados:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("\nProduto:%s\nPreco:%.2f\nEstoque:%d\n", nome[i], preco[i], qtd_estoque[i]);
        }

    }

    public static float altera_preco(float preco, float porcentagem) {
        float temp;

        if (porcentagem > -100) {
            temp = 1 + porcentagem / 100;
            preco = preco * temp;
            return preco;
        } else {
            return -1;
        }
    }
}