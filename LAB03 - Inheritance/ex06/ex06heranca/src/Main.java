/*
# Crie uma classe chamada {Ingresso}, que possui um valor e um método {escreveValor()}. Em seguida:
Crie uma classe {VIP}, que herda {Ingresso} e possui um valor adicional.
Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
Crie uma classe {Normal}, que herda {Ingresso} e possui um método que imprime: "Ingresso Normal".
Crie uma classe {CamaroteInferior} (que possui a localização do ingresso e métodos para acessar e imprimir
esta localização) e uma classe {CamaroteSuperior}, que é mais cara (possui valor adicional).
Esta última possui um método para retornar o valor do ingresso. Ambas as classes herdam a classe {VIP}.
*/

public class Main {
    public static void main(String[] args) {

        Normal ingressoNormal = new Normal();
        VIP ingressoVip = new VIP();

        CamaroteInferior camInf = new CamaroteInferior();
        CamaroteSuperior camSup = new CamaroteSuperior();

        ingressoNormal.setValor(15.0);
        System.out.println("Valor do ingresso normal: " + ingressoNormal.escreveValor()+"\n");

        ingressoVip.setValor(20.0);
        ingressoVip.setValorAdicional(5.50);
        System.out.println("Valor do ingresso VIP: " + ingressoVip.valorVip()+"\n");

        camInf.setLocalizacao("Pista");
        camInf.setValor(50);
        System.out.println("Camarote Inferior: " + camInf.getValor() + " - Localização: " + camInf.getLocalizacao()+"\n");

        camSup.setTaxaSuperior(10.0);
        camSup.setValor(60);
        System.out.println("Camarote Superior: " + camSup.getValorCamaroteSuperior() + "\n");
    }
}
