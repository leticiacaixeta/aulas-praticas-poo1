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
    public int publico;
    protected int protegido;
    private int privado;

    public C1(){
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public C1(int publico, int protegido, int privado){
        this.publico = publico;
        this.protegido = protegido;
        this.privado = privado;
        System.out.println("Classe C1: chamada do construtor com parametros");
    }

    public int getPublico() {
        return publico;
    }

    public void setPublico(int publico) {
        this.publico = publico;
    }

    public int getProtegido() {
        return protegido;
    }

    public void setProtegido(int protegido) {
        this.protegido = protegido;
    }

    public int getPrivado() {
        return privado;
    }

    public void setPrivado(int privado) {
        this.privado = privado;
    }

    public void mostrar_atributos() {
        System.out.println("Público: " + publico + "\nProtegido: " + protegido + "\nPrivado: " + privado + "\n");
    }


    public mostrar_atributos_super(int publico, int protegido, int privado) {
        super(publico, protegido, getPrivado());
        System.out.println("Classe C1: chamada do construtor com parametros");
    }

    public void mostrar_atributos_super() {
        super.mostrar_atributos_super();
        System.out.println("Público: " + publico + "\nProtegido: " + protegido + "\nPrivado: " + privado + "\n");
    }
}