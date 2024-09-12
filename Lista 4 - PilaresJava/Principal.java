public class Principal{
    public static void main(String[] args){
        Carro       veiculo1 = new Carro(2024, 12345, 90000, 100, true);
        Moto        veiculo2 = new Moto(2020, 23456, 20000, 200, 300);
        Caminhao    veiculo3 = new Caminhao(1984, 6789, 9999999, 500, 200);
        Carro       veiculo4 = new Carro(1984, 11111, 30000, 0, false);
        
        veiculo1.PagarPedagio();
        veiculo2.PagarPedagio();
        veiculo3.PagarPedagio();
        veiculo4.PagarPedagio();
        
        System.out.println(veiculo1.frequencia.getCanal());
        System.out.println(veiculo1.amplitude.getCanal());
        
        veiculo4.frequencia.DiminuirVolume();
        System.out.println(veiculo4.frequencia.getVolume());
        
        veiculo4.frequencia.AumentarVolume();
        veiculo4.frequencia.AumentarVolume();
        veiculo4.frequencia.AumentarVolume();
        System.out.println(veiculo1.frequencia.getVolume());
        System.out.println(veiculo4.frequencia.getVolume());
        
        System.out.println(veiculo3.getCapacidadeTotal());
        System.out.println(veiculo3.getCapacidadeAtual());
        veiculo3.setCapacidadeAtual(150);
        System.out.println(veiculo3.getCapacidadeAtual());
        veiculo3.setCapacidadeAtual(250);
        System.out.println(veiculo3.getCapacidadeAtual());

    }
}