/*
# Teste de chamada de herança
Faça um programa que contenha três classes: C1; C2; C3

- A classe C1 é base da Classe C2, que por sua vez é base da Classe C3.
- Para cada classe, inclua um atributo público, protegido e privado (pode ser de qualquer tipo).
- Para cada classe, construa um construtor padrão sem parâmetros e um construtor com parâmetros.
- Nos construtores de cada classe, inclua um comando que imprime uma mensagem indicando a passagem pelo contrutor.
Por exemplo, para C1:
  "Classe C1: chamada do construtor padrao, sem parametros"
  "Classe C3: chamada do construtor com parametros"
- Na classe C3 inclua um construtor que use o "super" para chamar o construtor da classe C2 com parâmetro.
- Em todas as classes, inclua um método que chama mostrar_atributos, que mostra os valores de *todos* os atributos
de um objeto (não utilizar super).
- Lembre que as classes herdam os atributos, inclusive os privados - e esses também devem ser mostrados
- Em todas as classes, inclua um método que chama mostrar_atributos_super, que mostra os valores de *todos* os
atributos de um objeto e que utilize super.
*/

public class C2 extends C1{
    public String cpf;
    private String estadoCivil;
    protected String dataNascimento;

    public C2(){
        super();
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public C2(String cpf, String estadoCivil, String dataNascimento){
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
        System.out.println("Classe C2: chamada do construtor com parametros");
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String mostrar_atributos() {
        return "C2:\n" +
                "CPF: " + this.cpf + "\nEstado Civil :" + getEstadoCivil() + "\nData de Nascimento: " + this.dataNascimento;
    }

    public String mostrar_atributos_super() {
        return super.mostrar_atributos();
    }
}