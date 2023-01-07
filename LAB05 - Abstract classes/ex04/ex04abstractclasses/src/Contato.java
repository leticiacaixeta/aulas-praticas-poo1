public abstract class Contato {
    protected String nome;
    protected String apelido;
    protected String email;
    protected String aniversario;

    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String imprimirBasico(){
        return ("Nome: " + nome + "\nApelido: " + apelido + "\nEmail: " + email + "Aniversário: " + aniversario);
    }

    public abstract void imprimirContato();
}