package pacote;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, 3,45);
        Emprestimo.calcular(1000,2,30);
        Emprestimo.calcular(1000,12,3);
    }
}
