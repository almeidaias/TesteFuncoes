import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTesteFuncoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] intervalo = new int[2];
        intervalo[0] = getNumber(sc);
        intervalo[1] = getNumber(sc);
        intervalo = ordenaNumero(intervalo);
        checaPrimo(intervalo);
    }

    public static int checaPrimo(int[] intervalo){
        while (intervalo[0] <= intervalo[1]) {
            int controle = 2;
            if(intervalo[0]<0){
                for (int i = -2; i >= intervalo[0]; i--) {
                    if (intervalo[0] % i != 0) {
                        controle++;
                    }
                }
            } else{
                for (int i = 2; i <= intervalo[0]; i++) {
                    if (intervalo[0] % i != 0) {
                        controle++;
                    }
                }
            } if (controle == intervalo[0] || controle*-1 == intervalo[0]) {
                System.out.println(intervalo[0]);
            }
            intervalo[0]++;
        }
        return 0;
    }
    public static int getNumber(Scanner input) {
        System.out.println("Insira um número:");
        try{
            return input.nextInt();
        }
        catch (InputMismatchException e){
            input.nextLine();
            System.out.println("O valor deve ser um número inteiro, tente novamente.");
            return getNumber(input);
        }
    }
    public static int[] ordenaNumero(int[] intervalo){
        int auxiliar;
        if(intervalo[0]>intervalo[1]){
            auxiliar=intervalo[0];
            intervalo[0]=intervalo[1];
            intervalo[1]=auxiliar;
        }
        return intervalo;
    }
}
