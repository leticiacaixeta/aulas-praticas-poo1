/* Copie o exemplo Estudante disponível na pasta 'samples/polimorfismo'.
Crie uma classe Universidade, que tem como propriedade o nome da Universidade e a data de Fundação.
A universidade possui no máximo 100 alunos, que podem ser de graduação e pós-graduação.
(a) Crie um método que mostra quantos estudantes de graduação, mestrado e doutorado a Universidade possui
(para facilitar, é permitido instanciar os alunos no próprio código).
(b) Mostre as informações do nome de todos os alunos e, no caso de aluno de doutorado, mostrar adicionalmente
o título da tese a linha de pesquisa.
(c) Crie um novo vetor e copie para ele todos os alunos de pós-graduação (somente a cópia da referência do objeto -
não há necessidade de duplicar o objeto na memóra). Percorra o vetor e mostre as informações completas dos alunos. */

import java.time.LocalDate;

public class Universidade {
    private String nome;
    private LocalDate fundacao;
    Estudante[] estudantes;
    int doutorado = 0;
    int mestrado = 0;
    int graduacao = 0;
    public int totalEstudantes = 0;

    public Universidade(String nome, LocalDate fundacao, Estudante[] estudantes){
        this.nome = nome;
        this.fundacao = fundacao;
        this.estudantes = estudantes;
        contaEstudantes();
        totalEstudantes += graduacao + doutorado + mestrado;
    }

    public int getDoutorado() {
        return doutorado;
    }

    public void setDoutorado(int doutorado) {
        this.doutorado = doutorado;
    }

    public int getMestrado() {
        return mestrado;
    }

    public void setMestrado(int mestrado) {
        this.mestrado = mestrado;
    }

    public int getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(int graduacao) {
        this.graduacao = graduacao;
    }

    public void contaEstudantes() {
        for(int i = 0; (estudantes[i] != null); i++){
            if (estudantes[i] instanceof EstudanteDoutorado) {
                setDoutorado(getDoutorado() + 1);

            } else if (estudantes[i] instanceof EstudanteGraduacao) {
                setGraduacao(getGraduacao() + 1);

            } else if (estudantes[i] instanceof EstudanteMestrado) {
                setMestrado(getMestrado() + 1);
            }
        }
    }

    public void mostraQtdEstudantes(){
        System.out.println("A universidade tem " + getDoutorado() + " estudantes de doutorado, " + getMestrado() + " estudantes de mestrado, e " + getGraduacao() + " estudantes de graduação");
    }

    public void mostraAlunos(){
        for(int i = 0; i < totalEstudantes; i++) {
            System.out.println(estudantes[i].toString());
        }
    }

    public void mostraAlunosCompleto(){
        for(int i = 0; i < totalEstudantes; i++) {
            estudantes[i].print();
        }
    }
}