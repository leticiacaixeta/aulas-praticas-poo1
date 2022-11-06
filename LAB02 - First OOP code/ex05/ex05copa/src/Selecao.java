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

public class Selecao {
    private String nomeSelecao;
    Figurinha[] jogador = new Figurinha[11];
    private String nomeTecnico;

    public Selecao() {
    }

    public Selecao(String nome, Figurinha[] jogador, String tecnico) {
        this.nomeSelecao = nome;
        this.jogador = jogador;
        this.nomeTecnico = tecnico;
    }

    public String getNome() {

        return nomeSelecao;
    }

    public void setNome(String nome) {
        this.nomeSelecao = nome;
    }

    public Figurinha[] getJogador() {
        return jogador;
    }

    public void setJogador(Figurinha[] jogador) {
        this.jogador = jogador;
    }

    public String getTecnico() {
        return nomeTecnico;
    }

    public void setTecnico(String tecnico) {
        this.nomeTecnico = tecnico;
    }

    public String toString () {
        return "\nSeleção: " + nomeSelecao + "\nNome do técnico: " + nomeTecnico + "\n";
    }
}