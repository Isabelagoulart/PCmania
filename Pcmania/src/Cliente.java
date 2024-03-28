public class Cliente {
    //atributos
    public String nome;
    public long cpf;
    public float total = 0F;

    //construtor
    Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //métodos
    public float calculaTotalCompra(){
        return total;
    }
}
