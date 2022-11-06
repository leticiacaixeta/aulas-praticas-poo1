import java.time.LocalDate;

/*
# Ex04
Crie uma nova classe chamada Selecao, que é composta pelo nome da Selecao, por 11 jogadores titulares,
o nome do técnico, e outras informações que julgar pertinente. Instancie 2 seleções.
*/

public class Figurinha {
    private String nomeJogador;
    private String posicao;
    private String pais;
    private LocalDate dataNascimento;
    private float altura;
    private float peso;

    public Figurinha(String nome, String posicao, String pais, LocalDate data, float altura, float peso) {
        this.nomeJogador = nome;
        this.posicao = posicao;
        this.pais = pais;
        this.dataNascimento = data;
        this.altura = altura;
        this.peso = peso;
    }

    public String toString () {
        return "Nome do Jogador: " + nomeJogador + "\nData de Nascimento: " + dataNascimento + "\nPosição: " + posicao + "\nPaís: " + pais + "\nAltura: " + altura + "\nPeso: " + peso + "\n";
    }
}
