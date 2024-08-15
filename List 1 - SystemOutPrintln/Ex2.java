public class Ex2 {
    public static void main(String[] args) {
        String tabuada = "";
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                int conta = i * j;
                tabuada += (i + " x " + j + " = " + conta + " || ");
            }
            System.out.println(tabuada + "\n");
            tabuada = "";
        }
    }
}
