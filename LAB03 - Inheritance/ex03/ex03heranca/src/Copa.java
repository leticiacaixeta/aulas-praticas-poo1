import java.time.LocalDate;

/*
# Modifique a classe Figurinha, transformando os atributos protected para private.
Entenda o erro que ocorre em MostrarFigurinha() da classe FigurinhaExtra com essa modificação.
Modifique o método MostrarFigurinha() para ser possível visualizar os atributos privados de Figurinha.
Para isso use super.MostrarFigurinha().
Crie um novo construtor, que terá como parâmetro uma Figurinha (normal) e os dois atributo adicionais de FigurinhaExtra.
Esse construtor permitirá criar um novo objeto de FigurinhaExtra a partir de um objeto já existente de Figurinha
(ou seja, uma figurinha extra de um jogador que já foi criado).
Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas.
*/

public class Copa {
    public static void main (String[]args) {

        Figurinha figurinhaNormal = new Figurinha("Sean Johnson", "Goleiro", "Estados Unidos", LocalDate.parse("1989-05-31"), 1.91f, 98f);

        figurinhaNormal.MostrarFigurinha();

        FigurinhaExtra figurinhaExtra = new FigurinhaExtra(figurinhaNormal,"Legends", "Bronze");

        figurinhaExtra.MostrarFigurinha();

    }
}