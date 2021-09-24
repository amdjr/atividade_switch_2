import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("[1] = à vista \n[2] = à prazo(30 dias)\n[3] = à prazo(parcelado)");
        byte opcao = teclado.nextByte();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do produto:");
                float valorAvista = teclado.nextFloat();
                Calculos.descontoAvista(valorAvista);
                break;
            case 2:
                System.out.println("Digite o valor do produto:");
                float valor30dias = teclado.nextFloat();
                Calculos.descontoAprazo(valor30dias);
                break;
            case 3:
                System.out.println("Digite o valor do produto:");
                float valorParcelado = teclado.nextFloat();
                Calculos.descontoParcelado(valorParcelado);
                break;
            default:
                System.out.println("Opção inválida.");

        }
        teclado.close();

    }

}
