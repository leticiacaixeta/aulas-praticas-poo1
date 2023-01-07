public class Trabalho extends Contato {
    private String tipo;

    public Trabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public void imprimirContato() {
        System.out.println(super.imprimirBasico());
        System.out.println("Tipo: " + tipo);
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

