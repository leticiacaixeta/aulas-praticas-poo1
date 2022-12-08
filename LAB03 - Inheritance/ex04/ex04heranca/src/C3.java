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
- Lembre que as classes herdam os atributos, inclusive os privados - e esses também devem ser mostrados.
- Em todas as classes, inclua um método que chama mostrar_atributos_super, que mostra os valores de *todos* os
atributos de um objeto e que utilize super.
*/

public class C3 extends C2 {
    public String cidade;
    private String pais;
    protected String cnpj;

    public C3() {
        super();
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    public C3(String cidade, String pais, String cnpj) {
        this.cidade = cidade;
        this.pais = pais;
        this.cnpj = cnpj;
        System.out.println("Classe C3: chamada do construtor com parametros");
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String mostrar_atributos() {
        return "C3:\n" +
            "Cidade: "+ this.cidade + "\nPaís: " + getPais() + "\nCNPJ: " + this.cnpj;
    }

    public String mostrar_atributos_super() {
        return super.mostrar_atributos();
    }
}