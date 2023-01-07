import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class FaceFriends {
    static Contato[] contatos = new Contato[30];
    static int proximaPosicaoLivre = 0;

    private static void menu(Scanner sc){
        while (true){
            showOptions();
            System.out.print("Escolha uma opção: ");
            int scanner = sc.nextInt();
            switch (scanner){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    inserirContato(sc);
                    break;
                case 2:
                    imprimirTodosOsContatos();
                    break;
                case 3:
                    imprimirSomenteOsFamiliares();
                    break;
                case 4:
                    imprimirSomenteOsAmigos();
                    break;
                case 5:
                    imprimirOsMelhoresAmigos();
                    break;
                case 6:
                    imprimirOsIrmaos();
                case 7:
                    imprimirOsColegasDeTrabalho();
                    break;
                case 8:
                    imprimirContatoEspecifico(sc);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void imprimirContatoEspecifico(Scanner sc) {
        System.out.print("Informe o índice do contato para imprimir: ");
        int i = sc.nextInt();
            if(contatos[i] instanceof Amigos){
                System.out.println("<< Contato de Amigo >>");
                contatos[i].imprimirContato();
            } else if(contatos[i] instanceof Familia){
                System.out.println("<< Contato da Família >>");
                contatos[i].imprimirContato();
            } else if(contatos[i] instanceof Trabalho){
                System.out.println("<< Contato do Trabalho >>");
                contatos[i].imprimirContato();
            }
    }

    private static void imprimirOsColegasDeTrabalho() {
        for(Contato colegas: contatos){
            if(colegas instanceof Trabalho){
                colegas.imprimirContato();
            }
        }
    }

    private static void imprimirOsIrmaos() {
        for(Contato irmaos: contatos){
            if(irmaos instanceof Familia){
                if(((Familia) irmaos).getParentesco().equalsIgnoreCase("irmão")
                        || ((Familia) irmaos).getParentesco().equalsIgnoreCase("irmao")){
                    irmaos.imprimirContato();
                }
            }
        }
    }

    private static void imprimirOsMelhoresAmigos() {
        for(Contato melhoresAmigos: contatos){
            if (melhoresAmigos != null && melhoresAmigos instanceof Amigos && ((Amigos)melhoresAmigos).getGrau() == 1){
                melhoresAmigos.imprimirContato();
            }
        }
    }

    private static void imprimirSomenteOsAmigos() {
        for(Contato amigos: contatos){
            if(amigos instanceof Amigos){
                amigos.imprimirContato();
            }
        }
    }

    private static void imprimirSomenteOsFamiliares() {
        for(Contato familiares: contatos){
            if(familiares instanceof Familia){
                familiares.imprimirContato();
            }
        }
    }

    private static void imprimirTodosOsContatos() {
        for(int i = 0; i < proximaPosicaoLivre; i++){
            if(contatos[i] instanceof Amigos)
                ((Amigos)contatos[i]).imprimirContato();
            else if(contatos[i] instanceof Familia)
                ((Familia)contatos[i]).imprimirContato();
            else if(contatos[i] instanceof Trabalho)
                ((Trabalho)contatos[i]).imprimirContato();
            System.out.println("________________________________");
        }
    }

    private static void inserirContato(Scanner sc) {
        System.out.println("Que tipo de contato deseja inserir?");
        System.out.println(" 1 - Amigos");
        System.out.println(" 2 - Familia");
        System.out.println(" 3 - Trabalho");
        System.out.print("Escolha uma opção: ");
        int opt = sc.nextInt();
        switch (opt){
            case 1:
                cadastrarAmigo(sc);
                break;
            case 2:
                cadastrarFamilia(sc);
                break;
            case 3:
                cadastrarContatoDeTrabalho(sc);
                break;
            default:
                System.out.println("Opção inválida. Voltando para o menu...");
                break;
        }
    }

    private static Contato cadastrarDadosBasicosDoContato(char tipo, Scanner sc){
        System.out.print("Informe o nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe o apelido: ");
        String apelido = sc.nextLine();
        System.out.print("Informe o email: ");
        String email = sc.nextLine();
        System.out.print("Informe a data de aniversário(dd/mm/aaaa): ");
        String dataAniversario = sc.nextLine();


        Contato contactToReturn = null;

        switch (tipo){
            case 'A':
                contactToReturn = new Amigos(nome, apelido, email, dataAniversario, 0);
                break;
            case 'F':
                contactToReturn = new Familia(nome, apelido, email, dataAniversario, "");
                break;
            case 'T':
                contactToReturn = new Trabalho(nome, apelido, email, dataAniversario, "");
                break;
        }
        return contactToReturn;
    }

    private static void cadastrarAmigo(Scanner sc) {
        Contato tmp = cadastrarDadosBasicosDoContato('A', sc);
        System.out.println("Grau da amizade: ");
        System.out.println(" 1 - Melhor amigo");
        System.out.println(" 2 - Amigo");
        System.out.println(" 3 - Conhecido");
        System.out.print("Informe o grau da amizade: ");
        int grau = sc.nextInt();
        if(grau > 3 || grau < 1) {
            System.out.println("Grau inválido! Não foi possível cadastrar o amigo!");
            return;
        }
        else{
            ((Amigos)tmp).setGrau(grau);
            contatos[proximaPosicaoLivre] = tmp;
            proximaPosicaoLivre++;
            System.out.println("Contato cadastrado com sucesso!");
        }
    }

    private static void cadastrarFamilia(Scanner sc){
        Contato aux = cadastrarDadosBasicosDoContato('F', sc);
        System.out.print("Informe o grau de parentesco: ");
        String parentesco = sc.nextLine();
        ((Familia)aux).setParentesco(parentesco);

        contatos[proximaPosicaoLivre] = aux;
        proximaPosicaoLivre++;
        System.out.println("Contato cadastrado com sucesso!");
    }

    private static void cadastrarContatoDeTrabalho(Scanner sc){
        Contato tmp = cadastrarDadosBasicosDoContato('T', sc);
        System.out.print("Informe o tipo do contato de trabalho: ");
        String tipo = sc.nextLine();
        ((Trabalho)tmp).setTipo(tipo);

        contatos[proximaPosicaoLivre] = tmp;
        proximaPosicaoLivre++;
        System.out.println("Contato cadastrado com sucesso!");
    }

    private static void showOptions() {
        System.out.println("_______________________________________________________");
        System.out.println("|                  FaceFriends                        |");
        System.out.println("|_____________________________________________________|");
        System.out.println("| 1 - Inserir um contato                              |");
        System.out.println("| 2 - Imprimir todos os contatos                      |");
        System.out.println("| 3 - Imprimir somente os familiares                  |");
        System.out.println("| 4 - Imprimir somente os amigos                      |");
        System.out.println("| 5 - Imprimir os melhores amigos                     |");
        System.out.println("| 6 - Imprimir os irmãos                              |");
        System.out.println("| 7 - Imprimir os colegas de trabalho                 |");
        System.out.println("| 8 - Imprimir um contato específico                  |");
        System.out.println("| 0 - Sair                                            |");
        System.out.println("|_____________________________________________________|");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu(sc);
        sc.close();
    }
}
