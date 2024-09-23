import java.util.Scanner;

public class Beecrowd1036 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        double A, B, C, R1, R2;
        String sequencia;
        String[] partes;
        
        //ler a sequência
        sequencia = leitor.nextLine();
        partes = sequencia.split(" ");
        
        //atribuir valores às variáveis
        A = Double.parseDouble(partes[0]);
        B = Double.parseDouble(partes[1]);
        C = Double.parseDouble(partes[2]);
        
        //verificar as condições e mostrar resultado no console
        if (Math.pow(B,2) - 4*A*C < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            R1 = (-B + Math.sqrt(Math.pow(B,2) -4*A*C)) / (2*A);
            R2 = (-B - Math.sqrt(Math.pow(B,2) -4*A*C)) / (2*A);
            System.out.printf("R1 = %.5f%nR2 = %.5f%n", R1, R2);
        }
    }
}
