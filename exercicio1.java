import java.util.Scanner;

public class exercicio1{
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        
        int valor1=0;
        int valor2=0;
        int soma=0;

        System.out.printf("Digite o primeiro valor: ");
        valor1=entrada.nextInt();

        System.out.printf("Digite o segundo valor: ");
        valor2=entrada.nextInt();
        
        soma=valor1+valor2;

        System.out.printf("A soma é %d\n",soma );
    }
}