import java.time.LocalDate;

/*
# Modifique a classe Figurinha, transformando os atributos protected para private.
Entenda o erro que ocorre em MostrarFigurinha() da classe FigurinhaExtra com essa modificação.
Modifique o método MostrarFigurinha() para ser possível visualizar os atributos privados de Figurinha.
Para isso use super.MostrarFigurinha().
Crie um novo construtor, que terá como parâmetro uma Figurinha (normal) e os dois atributo adicionais de FigurinhaExtra.
Esse construtor permitirá criar um novo objeto de FigurinhaExtra a partir de um objeto já existente de Figurinha
(ou seja, uma figurinha extra de um jogador que já foi criado).
Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas.
*/

public class Figurinha {
    private String nomeJogador;
    private String posicao;
    private String pais;
    private LocalDate dataNascimento;
    private float altura;
    private float peso;

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Figurinha(String nome, String posicao, String pais, LocalDate data, float altura, float peso) {
        this.nomeJogador = nome;
        this.posicao = posicao;
        this.pais = pais;
        this.dataNascimento = data;
        this.altura = altura;
        this.peso = peso;
    }

    public void MostrarFigurinha() {
        System.out.println("Nome do Jogador: " + nomeJogador + "\nData de Nascimento: " + dataNascimento + "\nPosição: " + posicao + "\nPaís: " + pais + "\nAltura: " + altura + "\nPeso: " + peso + "\n");
    }
}