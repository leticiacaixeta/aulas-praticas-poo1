/* Copie o exemplo Estudante disponível na pasta 'samples/polimorfismo'.
Crie uma classe Universidade, que tem como propriedade o nome da Universidade e a data de Fundação.
A universidade possui no máximo 100 alunos, que podem ser de graduação e pós-graduação.
(a) Crie um método que mostra quantos estudantes de graduação, mestrado e doutorado a Universidade possui
(para facilitar, é permitido instanciar os alunos no próprio código).
(b) Mostre as informações do nome de todos os alunos e, no caso de aluno de doutorado, mostrar adicionalmente
o título da tese a linha de pesquisa.
(c) Crie um novo vetor e copie para ele todos os alunos de pós-graduação (somente a cópia da referência do objeto -
não há necessidade de duplicar o objeto na memóra). Percorra o vetor e mostre as informações completas dos alunos. */

public class EstudanteMestrado extends EstudantePosGrad {
    private String tipo; // tipo pode ser acadêmico ou profisional
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String formacao,
                             String linhadDePesquisa, String tipo, String tituloDissertacao) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteMestrado{" +
                "tipo='" + tipo + '\'' +
                ", tituloDissertacao='" + tituloDissertacao + '\'' +
                '}');
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTituloDissertacao() {
        return tituloDissertacao;
    }

    public void setTituloDissertacao(String tituloDissertacao) {
        this.tituloDissertacao = tituloDissertacao;
    }

    public String toString() {
        return "EstudanteMestrado {nome: " + getNome() + " tipo: " + tipo + " tituloDissertacao: " + tituloDissertacao + '}';
    }
}
