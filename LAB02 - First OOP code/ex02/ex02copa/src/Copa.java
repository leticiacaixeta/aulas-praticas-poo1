import java.time.LocalDate;

/*
# Ex02
Crie um novo projeto, semelhante ao exercício anterior. Torne todas os atributos do exercício 1 privados.
Crie métodos para alterar os valores dos atributos e para mostrar os valores dos atributos na tela.
Instancie os mesmos três jogadores.
*/

public class Copa {
    public static void main(String[] args) {
        Figurinha jog1,jog2,jog3;

        jog1 = new Figurinha();
        jog1.setNomeJogador("Pele");
        jog1.setDataNascimento(LocalDate.parse("1940-10-23"));
        jog1.setAltura(1.73f);
        jog1.setPeso(80);
        jog1.setPosicao("Atacante");
        jog1.setPais("Brasil");

        jog2 = new Figurinha();
        jog2.setNomeJogador("Romario");
        jog2.setDataNascimento(LocalDate.parse("1966-01-29"));
        jog2.setAltura(1.68f);
        jog2.setPeso(70);
        jog2.setPosicao("Atacante");
        jog2.setPais("Brasil");

        jog3 = new Figurinha();
        jog3.setNomeJogador("Neymar");
        jog3.setDataNascimento(LocalDate.parse("1992-02-05"));
        jog3.setAltura(1.75f);
        jog3.setPeso(68);
        jog3.setPosicao("Atacante");
        jog3.setPais("Brasil");

        System.out.printf("Nome:%s\nData de Nascimento:%s\nAltura:%.2f\nPeso:%.2f\nPais:%s\nPosicao:%s\n", jog1.getNomeJogador(), jog1.getDataNascimento(), jog1.getAltura(), jog1.getPeso(), jog1.getPais(), jog1.getPosicao());
        System.out.printf("\nNome:%s\nData de Nascimento:%s\nAltura:%.2f\nPeso:%.2f\nPais:%s\nPosicao:%s\n", jog2.getNomeJogador(), jog2.getDataNascimento(), jog2.getAltura(), jog2.getPeso(), jog2.getPais(), jog2.getPosicao());
        System.out.printf("\nNome:%s\nData de Nascimento:%s\nAltura:%.2f\nPeso:%.2f\nPais:%s\nPosicao:%s\n", jog3.getNomeJogador(), jog3.getDataNascimento(), jog3.getAltura(), jog3.getPeso(), jog3.getPais(), jog3.getPosicao());
    }
}
