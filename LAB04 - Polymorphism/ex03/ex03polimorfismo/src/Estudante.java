/* Copie o exemplo Estudante disponível na pasta 'samples/polimorfismo'.
Crie uma classe Universidade, que tem como propriedade o nome da Universidade e a data de Fundação.
A universidade possui no máximo 100 alunos, que podem ser de graduação e pós-graduação.
(a) Crie um método que mostra quantos estudantes de graduação, mestrado e doutorado a Universidade possui
(para facilitar, é permitido instanciar os alunos no próprio código).
(b) Mostre as informações do nome de todos os alunos e, no caso de aluno de doutorado, mostrar adicionalmente
o título da tese a linha de pesquisa.
(c) Crie um novo vetor e copie para ele todos os alunos de pós-graduação (somente a cópia da referência do objeto -
não há necessidade de duplicar o objeto na memóra). Percorra o vetor e mostre as informações completas dos alunos. */

public class Estudante {
    private String nome;
    private String endereco;

    public Estudante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void print() {
        System.out.println("Estudante{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}');
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
