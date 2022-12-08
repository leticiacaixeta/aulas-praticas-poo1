public class Teste {

    public static void main(String[] args) {

        //Criando objetos (SEM USO DO CONSTRUTOR)
        C1 c1 = new C1();
        c1.setNome("Letícia");
        c1.setIdade(29);
        c1.setEndereco("Av Terezina");
        System.out.println("_____________________");
        C2 c2 = new C2();
        c2.setCpf("11122233399");
        c2.setEstadoCivil("Solteira");
        c2.setDataNascimento("24-04-1993");
        System.out.println("_____________________");
        C3 c3 = new C3();
        c3.setCidade("Uberlandia");
        c3.setPais("Brasil");
        c3.setCnpj("000111222233344");


        System.out.println("_____________________");
        System.out.println(c1.mostrar_atributos());

        System.out.println("_________");
        System.out.println(c2.mostrar_atributos());

        System.out.println("_________");
        System.out.println(c3.mostrar_atributos());


        System.out.println("\n__________________________________\n"
                + "********************************\n");

        //Criando objetos (COM USO DO CONSTRUTOR)
        C1 c11 = new C1("Letícia",22,"Av Terezina");

        System.out.println("_____________________");
        C2 c22 = new C2("11122233399","Solteira","24-04-1993");

        System.out.println("_____________________");
        C3 c33 = new C3("Uberlandia","Brasil","000111222233344");

        System.out.println("_____________________");
        System.out.println(c11.mostrar_atributos());

        System.out.println("_________");
        System.out.println(c22.mostrar_atributos());

        System.out.println("_________");
        System.out.println(c33.mostrar_atributos());

    }
}