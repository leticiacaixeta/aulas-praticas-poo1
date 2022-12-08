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

public class C1{
    public String nome;
    private int idade;
    protected String endereco;

    public C1(){
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public C1(String nome, int idade, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        System.out.println("Classe C1: chamada do construtor com parametros");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String mostrar_atributos() {
        return "C1:\n" +
            "Nome: " + this.nome + "\nIdade: " + this.idade + "\nEndereço: " + this.endereco;
    }
}