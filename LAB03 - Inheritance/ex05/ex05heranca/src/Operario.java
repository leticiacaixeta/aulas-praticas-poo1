/*
# Uma empresa tem quatro tipos de funcionários: chefes, vendedores, operários e horistas.
Cada um desses funcionários ganha seus salários conforme regras distintas, apresentadas a seguir:
- Chefe: salário fixo e predefinido;
- Vendedor: valor fixo + comissão X vendas;
- Operario: valor por produção X quantidade produzida;
- Horista: valor por hora X total de horas trabalhadas.
Crie as classes correspondentes, adicionando atributos e métodos que achar necessários.
A classe Funcionario deve incluir os campos privados nome, dataNascimento e salario.
Além disso, crie uma classe Empresa, que conterá o método main().
A empresa tem vários funcionários, logo crie um vetor (array) para cada tipo de funcionário*.
*/

public class Operario extends Funcionario {
    private int quantidadeProduzida;

    public Operario() {
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }
    public Operario(String nome, String dataNascimento, double salario) {
        super(nome, dataNascimento, salario);

    }
    public Operario(String nome, String dataNascimento, double salario, int quantidadeProduzida) {
        super(nome, dataNascimento, salario);
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public double salarioPadrao(double salario) {
        return (salario*this.quantidadeProduzida);
    }
}