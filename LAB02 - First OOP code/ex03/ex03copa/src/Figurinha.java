import java.time.LocalDate;

/*
# Ex03
Crie no programa principal um vetor de figurinhas e instancie os jogadores de sua preferência. Mostre as
informações de todos os jogadores. Utilize laços para manipulação do vetor.
*/

public class Figurinha{
    private String nome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;


    public Figurinha(String nome, LocalDate nascimento, double altura, double peso, String posicao, String pais) {
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public String toString() {
        return "Figurinha [Nome: " + nome + ", Data de Nascimento: " + dataNascimento + ", Altura: " + altura + ", Peso: " + peso
                + ", Posicao: " + posicao + ", Pais: " + pais + "]";
    }
}