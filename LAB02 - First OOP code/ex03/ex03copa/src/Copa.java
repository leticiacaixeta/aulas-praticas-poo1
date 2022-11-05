import java.time.LocalDate;

/*
# Ex03
Crie no programa principal um vetor de figurinhas e instancie os jogadores de sua preferência. Mostre as
informações de todos os jogadores. Utilize laços para manipulação do vetor.
*/

public class Copa {
    public static void main(String[] args){
        Figurinha[] figurinha = new Figurinha[3];
        figurinha[0] = new Figurinha("Pele",LocalDate.parse("1940-10-23"),1.73f,80,"Atacante","Brasil");
        figurinha[1] = new Figurinha("Romário",LocalDate.parse("1966-01-29"),1.68f,70,"Atacante","Brasil");
        figurinha[2] = new Figurinha("Neymar",LocalDate.parse("1992-02-05"),1.75f,68,"Atacante","Brasil");

        for(int i = 0; i < figurinha.length; i++){
            System.out.println(figurinha[i]);
        }
    }

}