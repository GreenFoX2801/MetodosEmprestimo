package pacote;

public class Emprestimo {
    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static void calcular(double valor, float parcelas, float taxa){
                double valorFinal;
                double valorParcela;
                valorParcela = valor/parcelas;
                valorFinal = parcelas*(valorParcela+(valorParcela*(taxa/100)));
                System.out.println("Valor final do empréstimo para"+parcelas+" parcelas: R$: "+valorFinal);
    }
}
