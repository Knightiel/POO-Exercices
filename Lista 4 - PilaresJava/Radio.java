public class Radio{
    String estacao;
    int canal;
    int volume;

    public Radio(String estacao){
        this.estacao = estacao;
        if(estacao == "FM"){
            this.canal = 80;
        }else{
            this.canal = 20;
        }
        this.volume = 0;
    }

    public void DiminuirVolume(){
        if(this.volume>= 10){
            this.volume -= 10;
        }
    }

    public void AumentarVolume(){
        if(this.volume<= 90){
            this.volume += 10;
        }
    }

    //Getters and Setters
    public String getEstacao(){
        return estacao;
    }

    public int getCanal(){
        return canal;
    }

    public int getVolume(){
        return volume;
    }

    public void setEstacao(String estacao){
        this.estacao = estacao;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
    
}