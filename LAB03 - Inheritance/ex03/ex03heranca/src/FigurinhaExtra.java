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

public class FigurinhaExtra extends Figurinha {
    private String categoria;
    private String cor;

    public FigurinhaExtra(Figurinha fig, String categoria, String cor) {
        super(fig.getNomeJogador(), fig.getPosicao(), fig.getPais(), fig.getDataNascimento(), fig.getAltura(), fig.getPeso());
        this.categoria = categoria;
        this.cor = cor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void MostrarFigurinha() {
        super.MostrarFigurinha();
        System.out.println("Categoria: " + categoria + "\nCor: " + cor);
    }
}