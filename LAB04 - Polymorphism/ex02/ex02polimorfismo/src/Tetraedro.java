public class Tetraedro extends FormaTridimensional {
    private double lado;
    private double altura;
    private double base;

    public Tetraedro(){
    }

    public Tetraedro(double lado, double altura, double base){
        this.lado = lado;
        this.altura = altura;
        this.base = base;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double obterArea(){
        return ((this.lado*this.lado) * Math.sqrt(3));
    }

    public double obterVolume(){
        return (((1.0/3.0)*this.base)*this.altura);
    }

    public String descricao() {
        return "Tetraedro";
    }
}