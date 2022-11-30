import java.time.LocalDate;

/*
# O conceito de herança (inheritance) em POO é muito utilizado para reaproveitamento de código.
Modifique a classe Figurinha, transformando os atributos private para protected.
Modifique a classe FigurinhaExtra, eliminando todos os atributos e métodos reduntantes de Figurinha.
Obtenha os valores desses atributos por herança utilizando a palavra chave extends, isto é:
"public class FigurinhaExtra extends Figurinha {".
Note que a herança irá trazer os atributos e os métodos para a classe FigurinhaExtra.
Note que o método MostrarFigurinha() deve continuar em FigurinhaExtra, pois ele é diferente do método FigurinhaExtra()
da classe Figurinha.
O construtor deve ser modificado, de forma a inicializar somente os atributos de FigurinhaExtra.
Os atributos que são originais de classe Figurinha (chamada de superclasse ou classe mãe/pai) deverão ser inicializados
por meio da chamada do construtor original de Figurinha. Isso é feito usando a palavra reservada super.
Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas.
*/

public class Figurinha {
    protected String nomeJogador;
    protected String posicao;
    protected String pais;
    protected LocalDate dataNascimento;
    protected float altura;
    protected float peso;

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