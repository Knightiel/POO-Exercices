public class Moto extends Veiculo{
    public int cilindradas;

    public Moto(int ano, int chassi, float preco, float SemParar, int cilindradas) {
        super(ano, chassi, preco, SemParar);
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void PagarPedagio(){
        if(this.SemParar>=10){
            this.SemParar -= 10;
            System.out.println("Dinheiro:" + this.SemParar);
       }else{
            System.out.println("Moto sem dinheiro suficiente!");
       }
    }

    //Getters and Setters
    public int getCilindradas(){
        return cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
}