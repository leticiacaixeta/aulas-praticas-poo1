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

public class FigurinhaExtra extends Figurinha {
    private String categoria;
    private String cor;

    public FigurinhaExtra(String nome, String posicao, String pais, LocalDate data, float altura, float peso, String categoria, String cor) {
        super(nome, posicao, pais, data, altura, peso);
        this.categoria = categoria;
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void MostrarFigurinha() {
        System.out.println("Nome do Jogador: " + nomeJogador + "\nData de Nascimento: " + dataNascimento + "\nPosição: " + posicao + "\nPaís: " + pais + "\nAltura: " + altura + "\nPeso: " + peso + "\nCategoria: " + categoria + "\nCor: " + cor);
    }
}