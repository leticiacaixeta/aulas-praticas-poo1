public class UsaBanco {
    public static void main(String[] args) {

        ContaCorrente contas[] = new ContaCorrente[1];

        contas[0] = new ContaEspecial(5000, 105, 976543, 0);

        contas[0].debitaValor(200, 976543);
        System.out.println(contas[0]);

        for(ContaCorrente cc : contas){
            if(cc instanceof ContaEspecial)
                System.out.println("Conta " + cc.getNumConta() + " é conta especial");
        }
    }
}