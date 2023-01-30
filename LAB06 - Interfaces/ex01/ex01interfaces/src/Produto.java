public class Produto implements Classificavel{
    private String nomeDoProduto;
    private int codigo;

    public Produto(String nomeDoProduto, int codigo){
        this.nomeDoProduto = nomeDoProduto;
        this.codigo = codigo;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean eMenorQue(Classificavel o){
        Produto compara = (Produto) o;
        if(this.codigo < compara.codigo){
            return true;
        } else {
            return false;
        }
    }
}
