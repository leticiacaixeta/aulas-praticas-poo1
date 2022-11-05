import java.time.LocalDate;
/*
# Ex01
As figurinhas da copa são compostas pelas seguintes informações sobre os jogadores: Nome do Jogador,
Data de Nascimento, Altura, Peso, Posição, País.
Crie uma classe Figurinha, que conterá todas as informações das figurinhas
Em um outro programa (outro código Java), instancie 3 objetos, com informações de seus jogadores de preferência.
Faça atribuição de valores no próprio código e mostre as informações na tela.
*/
public class Copa {
    public static void main(String[] args) {
        Figurinha jog1,jog2,jog3;

        jog1 = new Figurinha();
        jog1.nomeJogador = "Pele";
        jog1.dataNascimento = LocalDate.parse("1940-10-23");
        jog1.altura = 1.73f;
        jog1.peso = 80;
        jog1.posicao = "Atacante";
        jog1.pais = "Brasil";

        jog2 = new Figurinha();
        jog2.nomeJogador = "Romário";
        jog2.dataNascimento = LocalDate.parse("1966-01-29");
        jog2.altura = 1.68f;
        jog2.peso = 70;
        jog2.posicao = "Atacante";
        jog2.pais = "Brasil";

        jog3 = new Figurinha();
        jog3.nomeJogador = "Neymar";
        jog3.dataNascimento = LocalDate.parse("1992-02-05");
        jog3.altura = 1.75f;
        jog3.peso = 68;
        jog3.posicao = "Atacante";
        jog3.pais = "Brasil";

        System.out.printf("Nome:%s\nData de Nascimento:%s\nAltura:%.2f\nPeso:%.2f\nPais:%s\nPosicao:%s\n", jog1.nomeJogador, jog1.dataNascimento, jog1.altura, jog1.peso, jog1.pais, jog1.posicao);
        System.out.printf("\nNome:%s\nData de Nascimento:%s\nAltura:%.2f\nPeso:%.2f\nPais:%s\nPosicao:%s\n", jog2.nomeJogador, jog2.dataNascimento, jog2.altura, jog2.peso, jog2.pais, jog2.posicao);
        System.out.printf("\nNome:%s\nData de Nascimento:%s\nAltura:%.2f\nPeso:%.2f\nPais:%s\nPosicao:%s\n", jog3.nomeJogador, jog3.dataNascimento, jog3.altura, jog3.peso, jog3.pais, jog3.posicao);
    }
}