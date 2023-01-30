public class Cliente implements Classificavel{
    private String nomeDoCliente;
    private String cidade;

    public Cliente(String nomeDoCliente, String cidade) {
        this.nomeDoCliente = nomeDoCliente;
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public boolean eMenorQue(Classificavel o){
        Cliente compara = (Cliente) o;
        if(this.nomeDoCliente.compareTo(compara.nomeDoCliente) < 0){
            return true;
        } else {
            return false;
        }
    }
}