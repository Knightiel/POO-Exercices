public abstract class Veiculo{
    
    public int ano;
    public int chassi;
    public float preco;
    public float quilometragem;
    public float SemParar;

    public Veiculo(int ano, int chassi, float preco, float SemParar){
        this.ano = ano;
        this.chassi = chassi;
        this.preco = preco;
        this.SemParar = SemParar;
    }
    
    public abstract void PagarPedagio();

    //Getters and Setters
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public int getChassi(){
        return chassi;
    }
    public void setChassi(int chassi){
        this.chassi = chassi;
    }

    public float getPreco(){
        return preco;
    }
    public void setPreco(int preco){
        this.preco = preco;
    }

    public float getQuilometragem(){
        return quilometragem;
    }
    public void setQuilometragem(float quilometragem){
        this.quilometragem = quilometragem;
    }

    public float getSemParar(){
        return SemParar;
    }
    public void setSemParar(float SemParar){
        this.SemParar = SemParar;
    }
    
}