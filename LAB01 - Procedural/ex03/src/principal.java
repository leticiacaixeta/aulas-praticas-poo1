import java.util.Scanner;

public class Main {

    public static void ex01() {
        Scanner sc = new Scanner(System.in);
        int val1, val2, val3, val4, val5, val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor>>");

        for (int i = 0; i < 6; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor em ordem inversa>>");

        for (int i = 0; i < 6; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("A ordem inversa dos números é:");
        for (int i = 5; i >= 0; i--) {
            System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex04() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor de números pares>>");

        int i = 0;
        while (i < 6) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();

            if (vet[i] % 2 == 1) {
                System.out.printf("Valor inválido");
                continue;
            }
            i++;
        }

        System.out.println("Os números pares digitados são:");
        for (i = 0; i < 6; i++) {
            System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< 5 valores >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os números digitados são:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", vet[i]);
        }

        int maior = vet[0];
        int menor = vet[0];
        for (int i = 0; i < 5; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }

        System.out.printf("O maior valor é: %d\n", maior);
        System.out.printf("O menor valor é: %d\n", menor);

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += vet[i];
        }
        float media = (float) soma / 5;

        System.out.println("A média é: " + media);
    }

    public static void ex06() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< 5 valores >>");

        int i = 0;

        for (i = 0; i < 5; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os números digitados são:");
        for (i = 0; i < 5; i++) {
            System.out.printf("%d ", vet[i]);
        }

        int maior = vet[0];
        int indicemaior = 0;
        int menor = vet[0];
        int indicemenor = 0;
        for (i = 0; i < 5; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                indicemaior = i;
            }
            if (vet[i] < menor) {
                menor = vet[i];
                indicemenor = i;
            }
        }

        System.out.printf("\nO menor valor é: %d, localizado na posição %d do vetor\n", menor, indicemenor);
        System.out.printf("O maior valor é: %d, localizado na posição %d do vetor\n", maior, indicemaior);

        int soma = 0;
        for (i = 0; i < 5; i++) {
            soma += vet[i];
        }
        float media = (float) soma / 5;

        System.out.println("A média é: " + media);
    }

    public static void ex07() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Normalizando as notas >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com a nota do aluno %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Notas normalizadas:");

        int normaliza = 2;
        for (int i = 0; i < 5; i++) {
            System.out.printf("A nota do aluno %d é %d\n", i + 1, normaliza * vet[i]);
        }
    }

    public static void ex08() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Média e desvio-padrão >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o valor %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += vet[i];
        }
        int media = soma / 5;

        double diferenca[] = new double[5];
        for (int i = 0; i < 5; i++)
            diferenca[i] = vet[i] - media;

        double quadrado[] = new double[5];
        for (int i = 0; i < 5; i++)
            quadrado[i] = Math.pow(diferenca[i], 2);

        double somaquadrado = 0;
        for (int i = 0; i < 5; i++)
            somaquadrado = somaquadrado + quadrado[i];

        double desvio = Math.pow(somaquadrado / 4, 0.5);

        System.out.println("A média é " + media);
        System.out.println("e o desvio padrão é " + desvio);

    }

    public static void ex09() {
        Scanner sc = new Scanner(System.in);
        int[] alunos = new int[101];
        int numeroalunos;
        int i = 0;
        float soma = 0;
        float mediafinal = 0;
        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");

        System.out.print("Entre com o número de alunos: ");
        numeroalunos = sc.nextInt();

        if (numeroalunos > 100) {
            System.out.println("Erro! O número máximo de alunos permitido é 100.");
            System.exit(0);
        }

        for (i = 0; i < numeroalunos; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            alunos[i] = sc.nextInt();
            soma = soma + alunos[i];
        }

        System.out.println("\nRelatório de Notas");

        for (i = 0; i < numeroalunos; i++) {
            System.out.printf("\nA nota do aluno %d é %d", i + 1, alunos[i]);
        }

        mediafinal = soma / numeroalunos;

        System.out.printf("\nA média da turma é: %.1f", mediafinal);

    }

    public static void ex10() {
        Scanner sc = new Scanner(System.in);
        int[] veta = new int[3];
        int[] vetb = new int[3];
        int[] vetc = new int[3];
        System.out.println("<< Subtração de vetores >>");

        int i = 0;
        int j = 0;
        for (i = 0; i < 3; i++) {
            System.out.printf("Digite o valor %d de A:\n", i + 1);
            veta[i] = sc.nextInt();
        }

        System.out.print("\n");

        for (i = 0; i < 3; i++) {
            System.out.printf("Digite o valor %d de B:\n", i + 1);
            vetb[i] = sc.nextInt();
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                vetc[i] = veta[i] - vetb[i];
            }
        }

        System.out.println("\nO vetor C, definido como C = A-B é ");
        for (i = 0; i < 3; i++)
            System.out.printf(vetc[i] + ", ");
    }

    public static void ex11() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int impares = 0;
        int pares = 0;
        System.out.println("<< Pares e Ímpares >>");

        int i, j = 0;
        for (i = 0; i < 5; i++) {
            System.out.printf("Digite o valor %d:\n", i + 1);
            v[i] = sc.nextInt();
        }

        for (j = 0; j < 5; j++) {
            if (v[j] % 2 == 1) {
                v1[impares] = v[j];  //recebe os ímpares
                impares = impares + 1;
            } else {
                v2[pares] = v[j]; //recebe os pares
                pares = pares + 1;
            }
        }

        System.out.print("\nÍmpares:");

        if (impares > 1) {
            System.out.printf(" %d", v1[0]);

            for (i = 1; i < impares; i++) {
                System.out.printf(", %d", v1[i]);
            }
        }
        else if (impares == 1) {
            System.out.printf(" %d", v1[0]);
        }

        System.out.print("\nPares:");

        if (pares > 1) {
            System.out.printf(" %d", v2[0]);

            for (i = 1; i < pares; i++) {
                System.out.printf(", %d", v2[i]);
            }
        }
        else if (pares == 1) {
            System.out.printf(" %d", v2[0]);
        }
    }

    public static void ex12() {
        Scanner sc = new Scanner (System.in);
        double verde, azul, amarela, vermelha;
        double probverde, probazul, probamarela, probvermelha;
        double total;

        System.out.println("<< Probabilidades >>");
        System.out.println("\nDigite a quantidade de bolinhas");

        System.out.print("Verde: ");
        verde = sc.nextDouble();

        System.out.print("Azul: ");
        azul = sc.nextDouble();

        System.out.print("Amarela: ");
        amarela = sc.nextDouble();

        System.out.print("Vermelha: ");
        vermelha = sc.nextDouble();

        total = verde + azul + amarela + vermelha;

        probverde = (verde * 100) / total;
        probazul = (azul * 100) / total;
        probamarela = (amarela * 100) / total;
        probvermelha = (vermelha * 100) / total;

        System.out.println("\nProbabilidades");

        if(probverde > probazul && probverde > probamarela && probverde > probvermelha){
            System.out.printf("Verde: %.1f%% << Maior probabilidade", probverde);
            System.out.printf("\nAzul: %.1f%%", probazul);
            System.out.printf("\nAmarela: %.1f%%", probamarela);
            System.out.printf("\nVermelha: %.1f%%", probvermelha);
        }

        if(probazul > probverde && probazul>probamarela && probazul>probvermelha){
            System.out.printf("Verde: %.1f%%", probverde);
            System.out.printf("\nAzul: %.1f%% << Maior probabilidade", probazul);
            System.out.printf("\nAmarela: %.1f%%", probamarela);
            System.out.printf("\nVermelha: %.1f%%", probvermelha);
        }

        if(probamarela > probverde && probamarela > probazul && probamarela > probvermelha){
            System.out.printf("Verde: %.1f%%", probverde);
            System.out.printf("\nAzul: %.1f%%", probazul);
            System.out.printf("\nAmarela: %.1f%% << Maior probabilidade", probamarela);
            System.out.printf("\nVermelha: %.1f%%", probvermelha);
        }

        if(probvermelha > probazul && probvermelha > probamarela && probvermelha > probverde){
            System.out.printf("Verde: %.1f%%", probverde);
            System.out.printf("\nAzul: %.1f%%", probazul);
            System.out.printf("\nAmarela: %.1f%%", probamarela);
            System.out.printf("\nVermelha: %.1f%% << Maior probabilidade", probvermelha);
        }
    }

    public static void ex13() {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[5];
        int i = 0;
        System.out.println("<<Zerando negativos>>");

        for(i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vetor[i] = sc.nextInt();
        }

        for(i = 0; i < 5; i++){
            if (vetor[i] < 0){
                vetor[i] = 0;
            }
        }

        System.out.print("\nZerando os negativos, obtém-se:");
        for(i = 0; i < 5; i++){
            System.out.printf(" %d", vetor[i]);
        }
    }

    public static void ex14() {
        Scanner sc = new Scanner(System.in);
        int matricula[] = new int[100];
        int numeroalunos;
        float cra[]= new float[100];
        char classesocial[] = new char[10001];
        int i = 0;

        System.out.println("<< Universidade X >>");
        System.out.print("Quantos alunos serão cadastrados: ");
        numeroalunos = sc.nextInt();

        if (numeroalunos > 10000) {
            System.out.println("Erro! O número máximo de alunos permitido é 10000.");
            System.exit(0);
        }

        for(i = 0; i < numeroalunos; i++) {
            System.out.print("\nEntre com o número do aluno: ");
            matricula[i] = sc.nextInt();

            System.out.printf("Entre com a classe social do aluno %d: ", matricula[i]);
            classesocial[i] = sc.next().charAt(0);

            System.out.printf("Entre com o CRA do aluno %d: ", matricula[i]);
            cra[i] = sc.nextFloat();
        }

        System.out.print("\n==== Alunos Cadastrados ====");

        for(i = 0; i < numeroalunos; i++) {
            System.out.printf("\nNúmero: %d Classe Social: %c CRA: %.2f", matricula[i], classesocial[i], cra[i]);
        }
    }

    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        ex14();
    }
}


