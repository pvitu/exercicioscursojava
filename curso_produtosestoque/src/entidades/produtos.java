package entidades;

public class produtos {
    public String name;
    public double preco;
    public int quantidade;

    public double valortotalNoEstoque(){
        return preco * quantidade;
    }

    public void addProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade){
        this.quantidade -= quantidade;
    }
}
