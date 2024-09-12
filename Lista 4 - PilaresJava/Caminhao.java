public class Caminhao extends Veiculo{
    
    public int CapacidadeTotal;
    public int CapacidadeAtual;
    
    public Caminhao(int ano, int chassi, float preco, float SemParar, int CapacidadeTotal) {
        super(ano, chassi, preco, SemParar);
        this.CapacidadeTotal = CapacidadeTotal;
    }

    @Override
    public void PagarPedagio(){
        if(this.SemParar>=40){
            this.SemParar -= 40;
            System.out.println("Dinheiro:" + this.SemParar);
       }else{
            System.out.println("Caminhão sem dinheiro suficiente!");
       }
    }   

    //Getters and Setters
    public int getCapacidadeTotal(){
        return CapacidadeTotal;
    }

    public int getCapacidadeAtual(){
        return CapacidadeAtual;
    }

    public void setCapacidadeTotal(int CapacidadeTotal){
        this.CapacidadeTotal = CapacidadeTotal;
    }

    public void setCapacidadeAtual(int CapacidadeAtual){
        //Iria criar uma classe só com validação mas fiquei com preguiça hehe :P
        if(CapacidadeAtual > this.CapacidadeTotal){
            System.out.println("Carga excedida!");
        }else{
            this.CapacidadeAtual= CapacidadeAtual;
        }
    }
    
}