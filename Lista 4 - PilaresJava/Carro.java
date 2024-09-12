public class Carro extends Veiculo{
    Radio frequencia = new Radio("FM");
    Radio amplitude = new Radio("AM");
    boolean automatico;

    public Carro (int ano, int chassi, float preco, float SemParar, boolean automatico){
        super(ano, chassi, preco, SemParar);
        this.automatico = automatico;
    }
    
    @Override
    public void PagarPedagio(){
       if(this.SemParar>=20){
            this.SemParar -= 20;
            System.out.println("Dinheiro:" + this.SemParar);
       }else{
            System.out.println("Carro sem dinheiro suficiente!");
       }
    }

    //Getters and Setters
    public boolean getAutomatico(){
        return automatico;
    }

    public void setAutomatico(boolean automatico){
        this.automatico = automatico;
    }
}
