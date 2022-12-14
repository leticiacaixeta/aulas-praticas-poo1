/* Copie o exemplo Estudante disponível na pasta 'samples/polimorfismo'.
Crie uma classe Universidade, que tem como propriedade o nome da Universidade e a data de Fundação.
A universidade possui no máximo 100 alunos, que podem ser de graduação e pós-graduação.
(a) Crie um método que mostra quantos estudantes de graduação, mestrado e doutorado a Universidade possui
(para facilitar, é permitido instanciar os alunos no próprio código).
(b) Mostre as informações do nome de todos os alunos e, no caso de aluno de doutorado, mostrar adicionalmente
o título da tese a linha de pesquisa.
(c) Crie um novo vetor e copie para ele todos os alunos de pós-graduação (somente a cópia da referência do objeto -
não há necessidade de duplicar o objeto na memóra). Percorra o vetor e mostre as informações completas dos alunos. */

public class EstudantePosGrad extends Estudante {
    private String formacao; // curso  de graduação que o estudante formou
    private String linhadDePesquisa;

    public EstudantePosGrad(String nome, String endereco, String formacao, String linhadDePesquisa) {
        super(nome, endereco);
        this.formacao = formacao;
        this.linhadDePesquisa = linhadDePesquisa;
    }

    public void print() {
        super.print();
        System.out.println("EstudantePosGrad{" +
                "formacao: '" + formacao + '\'' +
                " linhadDePesquisa: '" + linhadDePesquisa + '\'' +
                '}');
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getLinhadDePesquisa() {
        return linhadDePesquisa;
    }

    public void setLinhadDePesquisa(String linhadDePesquisa) {
        this.linhadDePesquisa = linhadDePesquisa;
    }
}
