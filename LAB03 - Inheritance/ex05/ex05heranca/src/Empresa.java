/*
# Uma empresa tem quatro tipos de funcionários: chefes, vendedores, operários e horistas.
Cada um desses funcionários ganha seus salários conforme regras distintas, apresentadas a seguir:
- Chefe: salário fixo e predefinido;
- Vendedor: valor fixo + comissão X vendas;
- Operario: valor por produção X quantidade produzida;
- Horista: valor por hora X total de horas trabalhadas.
Crie as classes correspondentes, adicionando atributos e métodos que achar necessários.
A classe Funcionario deve incluir os campos privados nome, dataNascimento e salario.
Além disso, crie uma classe Empresa, que conterá o método main().
A empresa tem vários funcionários, logo crie um vetor (array) para cada tipo de funcionário*.
*/

public class Empresa {
    public static void main(String[] args) {

        Horista[] horista = new Horista[1];
        horista[0] = new Horista("Horista","09/12/1990",100.0,8.0);

        Operario[] operario = new Operario[1];
        operario[0] = new Operario("Operário", "17/08/2000",50.0,20);

        Vendedor[] vendedor = new Vendedor[1];
        vendedor[0] = new Vendedor("Vendedor","09/12/1996",700,50,20);

        Chefe[] chefe = new Chefe[1];
        chefe[0] = new Chefe("Chefe", "28/05/1990",1500.0);

        double salarioHorista = horista[0].salarioPadrao(horista[0].getSalario());
        System.out.println("Salario do horista: " + salarioHorista);

        double salarioOperario = operario[0].salarioPadrao(operario[0].getSalario());
        System.out.println("Salario do operário: " + salarioOperario);

        double salarioVendedor = vendedor[0].salarioPadrao(vendedor[0].getSalario());
        System.out.println("Salario do vendedor: " + salarioVendedor);

        double salarioChefe = chefe[0].salarioPadrao(chefe[0].getSalario());
        System.out.println("Salario do chefe: " + salarioChefe);
    }
}