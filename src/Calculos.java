public class Calculos {

    private static final String MSG_PRECO = "Preco com desconto: %.2f";

    public static float descontoAvista(float valorProduto) {
        float desconto = valorProduto * (float) ((double) 10 / 100);
        float valorTotal = valorProduto - desconto;
        System.out.printf(MSG_PRECO, valorTotal);
        return valorTotal;
    }

    public static float descontoAprazo(float valorProduto) {
        float desconto = valorProduto * (float) ((double) 5 / 100);
        float valorTotal = valorProduto + desconto;
        System.out.printf(MSG_PRECO, valorTotal);
        return valorTotal;
    }

    public static float descontoParcelado(float valorProduto) {
        float desconto = valorProduto * (float) (1.5 / 100);
        float valorTotal = valorProduto + desconto;
        System.out.printf(MSG_PRECO, valorTotal);
        return valorTotal;
    }

}