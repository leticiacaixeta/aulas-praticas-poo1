/* Uma empresa tem quatro tipos de funcionários: chefes, vendedores, operários e horistas.
Cada um desses funcionários ganha seus salários conforme regras distintas, apresentadas a seguir:
-Chefe: salário fixo e predefinido;
-Vendedor: valor fixo + comissão X vendas;
-Operario: valor por produção X quantidade produzida;
-Horista: valor por hora X total de horas trabalhadas.
Crie as classes correspondentes, adicionando atributos e métodos que achar necessários.
A classe Funcionario deve incluir os campos privados nome, dataNascimento e salario.
Além disso, crie uma classe Empresa, que conterá o método main().
A empresa tem vários funcionários, logo crie um vetor (array) de funcionários.
Adicione a ele ao menos um tipo de cada funcionário definido anteriormente.
Criar também uma classe {FolhaPagamento}, que lê dados referentes ao conjunto de empregados de uma empresa
e mostra a folha de pagamento da empresa.
Criar o vetor utilizando variáveis do tipo Funcionário, mas instancie os objetos com elementos das subclasses
de Funcionario (polimorfismo) *
*/

public class Empresa {
    public static void main(String[] args) {

        Funcionario[] funcionario = new Funcionario[4];

        for(int i = 0; i < 4; i++) {
            funcionario[0] = new Horista("Horista","09/12/1990",100.0,8.0);
            funcionario[1] = new Operario("Operário", "17/08/2000",50.0,20);
            funcionario[2] = new Vendedor("Vendedor","09/12/1996",700,50,20);
            funcionario[3] = new Chefe("Chefe", "28/05/1990",1500.0);
        }

        FolhaPagamento folha = new FolhaPagamento(funcionario);

        System.out.println("Valor Total da Folha de Pagamento: R$" + folha.calculoFolhaPagamento());

        System.out.printf("\nFolha de Pagamento Detalhada: \n\n");
        folha.folhaDetalhada();
    }
}