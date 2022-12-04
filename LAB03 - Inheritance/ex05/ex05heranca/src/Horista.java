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

public class Horista extends Funcionario {
    private double horas;

    public Horista() {
    }

    public Horista(String nome, String dataNascimento, double salario, double horas) {
        super(nome, dataNascimento, salario);
        this.horas = horas;
    }

    public double salarioPadrao(double salario) {
        return (salario * this.horas);
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
}