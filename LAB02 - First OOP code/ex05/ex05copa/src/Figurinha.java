import java.time.LocalDate;

/*
# Ex05
Crie um novo projeto copiando os códigos anteriores da Figurinha e da Seleção.
Modifique o código para incluir contrutores nas classes.
No caso da Figurinha, o contrutor vai receber como parâmetro somente o país.
Os demais atributos poderão ser inicializados com valores padrões do Java ou outro valor que achar pertinente.
Para o construtor da Selecao, ele deverá receber o nome da seleção e o nome do técnico.
O construtor deverá então já criar o vetor dos 11 jogadores e instanciar cada posição, chamando para isso
o construtor da Figurinha que permite criar os objetos com o parâmetro do país (que é o mesmo país que foi passado
ao construtor da seleção.
*/

public class Figurinha {
    private String nomeJogador;
    private String posicao;
    private String pais;
    private LocalDate dataNascimento;
    private float altura;
    private float peso;

    public Figurinha(String pais) {
        this.pais = pais;
    }

    public String toString () {
        return "Nome do Jogador: " + nomeJogador + "\nData de Nascimento: " + dataNascimento + "\nPosição: " + posicao + "\nPaís: " + pais + "\nAltura: " + altura + "\nPeso: " + peso + "\n";
    }
}
