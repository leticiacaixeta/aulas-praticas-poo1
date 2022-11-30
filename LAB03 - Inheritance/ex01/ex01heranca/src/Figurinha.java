import java.time.LocalDate;

/*
# Relembre o exercício da prática anterior. Nele indicamos que as figurinhas da copa são compostas pelas seguintes
informações sobre os jogadores: Nome do Jogador, Data de Nascimento, Altura, Peso, Posição, País.
Todos criaram a classe Figurinha, que continha todas as informações das figurinhas. Modifique o exercício para que
inclua um construtor que inicialize todos os atributos.
Crie também na classe um métodos MostrarFigurinha(), que imprime na tela todos os dados da Figurinha.
Agora crie a classe para as figurinhas extras. Essas são bem mais raras e não fazem parte da coleção regular,
sendo caracterizadas como uma coleção à parte.
Além de todos os atributos das figurinhas regulares, as raras são divididas em duas categorias, "Legends" e "Rookies",
e possuem quatro variações de cor: bordô, bronze, prata e ouro".
Crie uma classe chamada FigurinhaExtra, que contenha todos atributos da classe Figurinha e acrescente os dois novos atributos.
Utilize boas práticas de POO (atributos privados, métodos get/set), crie um construtor que inicializa todos os
parâmetros e crie também o método MostrarFigurinha().
Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas
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

    public void MostrarFigurinha() {
        System.out.println("Nome do Jogador: " + nomeJogador + "\nData de Nascimento: " + dataNascimento + "\nPosição: " + posicao + "\nPaís: " + pais + "\nAltura: " + altura + "\nPeso: " + peso + "\n");
    }
}
