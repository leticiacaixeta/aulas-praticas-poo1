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
        for(int i = 0; i<5; i++) {
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
        for(i = 0; i<5; i++) {
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
            System.out.printf("A nota do aluno %d é %d\n", i + 1, normaliza*vet[i]);
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
        for(int i = 0; i < 5; i++) {
            soma += vet[i];
        }
        int media = soma / 5;

        double diferenca[] = new double[5];
        for (int i = 0; i < 5; i++)
            diferenca[i] = vet[i]-media;

        double quadrado[] = new double[5];
        for (int i = 0; i < 5; i++)
            quadrado[i] = Math.pow(diferenca[i], 2);

        double somaquadrado = 0;
        for (int i = 0; i < 5; i++)
            somaquadrado = somaquadrado + quadrado[i];

        double desvio = Math.pow(somaquadrado/4, 0.5);

        System.out.println("A média é " + media);
        System.out.println("e o desvio padrão é " + desvio);

    }

    public static void ex09() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[100];
        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");

        int i = 0;
        if (vet[i] <= 100) {
            System.out.printf("Entre com o número de alunos:\n");
            vet[i] = sc.nextInt();
        }
        if (vet[i] > 100) {
            System.out.printf("Erro! O número máximo de alunos permitido é 100.\n");

        }

        for (i = 0; i <= vet[i]; i++) {
            System.out.printf("Digite a nota do aluno %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }
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

        for (i = 0; i < 3; i++) {
            System.out.printf("Digite o valor %d de B:\n", i + 1);
            vetb[i] = sc.nextInt();
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3 ; j++) {
                vetc[i] = veta[i] - vetb[i];
            }
        }

        System.out.println("O vetor C, definido como C = A-B é ");
        for (i = 0; i < 3; i++)
            System.out.printf(vetc[i]  + ", ");
    }

    public static void ex11() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        System.out.println("<< Pares e Ímpares >>");

        int i = 0;
        for(i = 0; i < 5; i++) {
            System.out.printf("Digite o valor %d:\n", i + 1);
            v[i] = sc.nextInt();
        }

        int j = 0;

        for (i = 0 ; i < v.length; i++){
            if (v[i] % 2 == 1) {
                v1[j] = v[i];  //recebe os ímpares
                System.out.printf("%d ", v1[i]);
            } else {
                v2[j] = v[i]; //recebe os pares
                System.out.printf("%d ", v2[i]);
            }
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
        //ex09(); incompleto
        //ex10();
        //ex11(); incompleto
    }