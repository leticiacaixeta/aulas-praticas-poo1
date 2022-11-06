import java.time.LocalDate;

/*
# Ex04
Crie uma nova classe chamada Selecao, que é composta pelo nome da Selecao, por 11 jogadores titulares,
o nome do técnico, e outras informações que julgar pertinente. Instancie 2 seleções.
*/

public class Copa {
    public static void main (String[]args) {

        Figurinha[] estadosunidos = new Figurinha[12];
        Selecao SelecaoEstadunidense  = new Selecao("Estados Unidos", estadosunidos,"Gregg Berhalter");

        estadosunidos[0] = new Figurinha("Sean Johnson", "Goleiro", "Estados Unidos", LocalDate.parse("1989-05-31"), 1.91f, 98f);
        estadosunidos[1] = new Figurinha("Ethan Horvath", "Goleiro", "Estados Unidos", LocalDate.parse("1995-06-09"), 1.93f, 84f);
        estadosunidos[2] = new Figurinha("Sergiño Dest", "Zagueiro", "Estados Unidos", LocalDate.parse("2000-11-03"), 1.70f, 62f);
        estadosunidos[3] = new Figurinha("Chris Richards", "Zagueiro", "Estados Unidos",  LocalDate.parse("2000-03-28"), 1.88f, 87f);
        estadosunidos[4] = new Figurinha("DeAndre Yedlin", "Zagueiro", "Estados Unidos",  LocalDate.parse("1993-07-09"), 1.73f, 73f);
        estadosunidos[5] = new Figurinha("Kellyn Acosta", "Meio-campo", "Estados Unidos",  LocalDate.parse("1995-07-24"), 1.78f, 68f);
        estadosunidos[6] = new Figurinha("Tyler Adams", "Meio-campo", "Estados Unidos",  LocalDate.parse("1999-02-14"), 1.75f, 72f);
        estadosunidos[7] = new Figurinha("Weston McKennie", "Meio-campo", "Estados Unidos",  LocalDate.parse("1998-08-28"), 1.85f, 84f);
        estadosunidos[8] = new Figurinha("Jordan Morris", "Atacante", "Estados Unidos",  LocalDate.parse("1994-10-26"), 1.83f, 84f);
        estadosunidos[9] = new Figurinha("Ricardo Daniel Pepi", "Atacante", "Estados Unidos",  LocalDate.parse("2003-01-09"), 1.85f, 74f);
        estadosunidos[10] = new Figurinha("Christian Pulisic", "Meio-campo", "Estados Unidos",  LocalDate.parse("1998-09-18"), 1.77f, 73f);
        estadosunidos[11] = new Figurinha("Josh Sargent", "Atacante", "Estados Unidos",  LocalDate.parse("2000-02-20"), 1.81f, 79f);

        Figurinha[] franca = new Figurinha[12];
        Selecao SelecaoFrancesa  = new Selecao("França", franca,"Didier Deschamps");

        franca[0] = new Figurinha("Alphonse Areola", "Goleiro", "França",  LocalDate.parse("1993-02-27"), 1.95f, 94f);
        franca[1] = new Figurinha("Hugo Lloris", "Goleiro", "França",  LocalDate.parse("1986-12-26"), 1.88f, 78f);
        franca[2] = new Figurinha("Theo Hernández", "Zagueiro", "França",  LocalDate.parse("1997-10-06"), 1.84f, 81f);
        franca[3] = new Figurinha("Jules Koundé", "Zagueiro", "França",  LocalDate.parse("1998-11-12"), 1.78f, 70f);
        franca[4] = new Figurinha("Ferland Mendy", "Zagueiro", "França",  LocalDate.parse("1995-06-08"), 1.80f, 73f);
        franca[5] = new Figurinha("Benjamin Pavard", "Zagueiro", "França",  LocalDate.parse("1996-03-28"), 1.86f, 81f);
        franca[6] = new Figurinha("Mattéo Guendouzi", "Meio-campo", "França",  LocalDate.parse("1999-04-14"), 1.85f, 68f);
        franca[7] = new Figurinha("Adrien Rabiot", "Meio-campo", "França",  LocalDate.parse("1995-04-03"), 1.88f, 71f);
        franca[8] = new Figurinha("Aurélien Tchouaméni", "Meio-campo", "França",  LocalDate.parse("2000-01-27"), 1.88f, 81f);
        franca[9] = new Figurinha("Ousmane Dembélé", "Atacante", "França",  LocalDate.parse("1997-05-15"), 1.78f, 67f);
        franca[10] = new Figurinha("Antoine Griezmann", "Atacante", "França",  LocalDate.parse("1991-03-21"), 1.75f, 73f);
        franca[11] = new Figurinha("Kylian Mbappé", "Atacante", "França",  LocalDate.parse("1998-12-20"), 1.78f, 73f);

        System.out.println(SelecaoEstadunidense);

        for(int i = 0; i < 12 ; i++) {
            System.out.println(estadosunidos[i]);
        }

        System.out.println(SelecaoFrancesa);

        for(int i = 0; i < 12 ; i++) {
            System.out.println(franca[i]);
        }
    }
}