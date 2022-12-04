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

public class Funcionario {
    private String nome;
    private String dataNascimento;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String dataNascimento, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioPadrao(double salario) {
        return this.salario = salario;
    }

    public String toString() {
        return "Nome: " + nome + "\nData de Nascimento: " + dataNascimento;
    }
}