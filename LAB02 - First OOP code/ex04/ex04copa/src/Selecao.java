/*
# Ex04
Crie uma nova classe chamada Selecao, que é composta pelo nome da Selecao, por 11 jogadores titulares,
o nome do técnico, e outras informações que julgar pertinente. Instancie 2 seleções.
*/

public class Selecao {
    private String nomeSelecao;
    Figurinha[] jogador = new Figurinha[12];
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
