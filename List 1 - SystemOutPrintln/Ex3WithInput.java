import java.util.Scanner;

public class Ex3WithInput{
    public static void main(String[] args){
        
        try {
            Scanner x = new Scanner(System.in);
            Scanner y = new Scanner(System.in);
            Scanner z = new Scanner(System.in);
            System.out.println("Expressão utilizada: (X e Y) ou Z");
            System.out.println("Responda apenas com true ou false:\n");
            System.out.println("Digite o valor de X: ");
            boolean valorX = x.nextBoolean();
            System.out.println("Digite o valor de Y: ");
            boolean valorY = y.nextBoolean();
            System.out.println("Digite o valor de Z: ");
            boolean valorZ = z.nextBoolean();
            boolean resultado = ((valorX && valorY) || valorZ);
            if(resultado==true){
                System.out.println("O resultado dos valores digitados é TRUE!");
            }else{
                System.out.println("O resultado dos valores digitados é FALSE!");
            }
        } catch (Exception e) {
            System.out.println("Algum valor não corresponde a um true ou false!");
        }
        
    }
}