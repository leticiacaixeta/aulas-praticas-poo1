import java.time.LocalDate;

/*
# Ex02
Crie um novo projeto, semelhante ao exercício anterior. Torne todas os atributos do exercício 1 privados.
Crie métodos para alterar os valores dos atributos e para mostrar os valores dos atributos na tela.
Instancie os mesmos três jogadores.
*/
public class Figurinha{
    private String nome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public Figurinha() {
    }

    public String getNomeJogador() {
        return nome;
    }
    public void setNomeJogador(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate nascimento) {
        this.dataNascimento = nascimento;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
}