public class Servico implements Classificavel{
    private String nomeDoServico;
    private double preco;

    public Servico(String nomeDoServico, double preco){
        this.nomeDoServico = nomeDoServico;
        this.preco = preco;
    }

    public String getNomeDoServico(){
        return nomeDoServico;
    }

    public void setNomeDoServico(String nomeDoServico){
        this.nomeDoServico = nomeDoServico;
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean eMenorQue(Classificavel o){
        Servico compara = (Servico) o;
        if(this.preco < compara.preco){
            return true;
        } else {
            return false;
        }
    }
}