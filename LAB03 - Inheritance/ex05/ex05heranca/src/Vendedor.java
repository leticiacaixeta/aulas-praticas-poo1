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

public class Vendedor extends Funcionario {
    private double comissao;
    private int vendas;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public Vendedor() {
    }

    public Vendedor(String nome, String dataNascimento, double salario) {
        super(nome, dataNascimento, salario);
    }

    public Vendedor(String nome, String dataNascimento, double salario, double comissao, int vendas) {
        super(nome, dataNascimento, salario);
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double salarioPadrao(double salario) {
        return (salario + (this.vendas*comissao));
    }
}