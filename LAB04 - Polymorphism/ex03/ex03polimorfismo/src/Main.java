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

public class Main {

    public static void main(String[] args) {

        Estudante[] estudantes = new Estudante[10];
        Estudante[] estudantesPosGraduacao = new Estudante[10];
        estudantes[0] = new EstudanteDoutorado("Luiza", "Rua Espirito Santo", "Farmácia", "Vacinação", "Importância da vacinação infantil");
        estudantes[1] = new EstudanteMestrado("Maria", "Rua Salvador", "Nutrição", "Alimentação", "Acadêmico", "Prevenção da compulsão alimentar");
        estudantes[2] = new EstudanteGraduacao("Carlos", "Rua Niterói", "Data Science");
        estudantes[3] = new EstudanteDoutorado("Amanda", "Rua Jataí", "Ciências da Computação", "Processamento de Imagens", "Inteligência Artificial");
        estudantes[4] = new EstudanteMestrado("Gabriel", "Rua Natal", "Medicina", "Vacinas de RNA", "Acadêmico", "Anticorpos");
        estudantes[5] = new EstudanteDoutorado("Marcos", "Rua Belém", "Veterinária", "Animais de Grande Porte", "Bovinocultura de Leite");

        Universidade universidade1 = new Universidade("UFU", LocalDate.now(), estudantes);

        copiaAlunos(estudantes, estudantesPosGraduacao);

        Universidade universidade2 = new Universidade("UFU", LocalDate.now(), estudantesPosGraduacao);

        System.out.println("Universidade 1");
        System.out.println("");
        universidade1.mostraAlunos();
        System.out.println("");
        System.out.println("Universidade 2");
        universidade2.mostraAlunosCompleto();
    }

    public static void copiaAlunos(Estudante[] vetOrigem, Estudante[] vetDestino){
        int i = 0;
        for (Estudante e: vetOrigem) {
            if(!(e instanceof EstudanteGraduacao)){
                vetDestino[i] = e;
                i++;
            }
        }
    }
}