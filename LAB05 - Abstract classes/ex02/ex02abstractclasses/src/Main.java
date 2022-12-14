public class Main {

    public static void main(String[] args) {

        ContaCorrente contas[] = new ContaCorrente[2];

        contas[0] = new ContaComum(1000, 600, 575452);
        contas[1] = new ContaEspecial(5000, 105, 976543, 0);

        for(int i = 0; i < contas.length; i++){
            if(contas[i] instanceof ContaEspecial && ((ContaEspecial) contas[i]).getLimite() == 0){
                contas[i] = ((ContaEspecial) contas[i]).toContaComum();
            }
        }

        for(ContaCorrente contaCorrente : contas){
            if(contaCorrente instanceof ContaComum)
                System.out.println("Conta " + contaCorrente.getNumConta() + " é conta comum.");

            else if(contaCorrente instanceof ContaEspecial)
                System.out.println("Conta " + contaCorrente.getNumConta() + " é conta especial.");
        }
    }
}
