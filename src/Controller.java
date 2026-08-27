
import java.util.Scanner;

public class Controller{
    Scanner entrada = new Scanner(System.in);
    Operacoes operacoes = new Operacoes();

    String opcao;

//Metodo menu1 controla todo o fluxo e logica do programa.

    void menu1(){
    do{
        System.out.println("""
            Selecione a operacâo:
            1 - Somar
            2 - Subtrair
            3 - Multiplicar
            4 - Dividir
            5 - Historico
            6 - Sair
        """);

        opcao = entrada.nextLine();

        //switch controla as decisoes do codigo de acordo com a entrada do usuario

        switch (opcao) {
            case "1":
                operacoes.somar();
            break;
            case "2":
                operacoes.subtrair();
            break;
            case "3":
                operacoes.multiplicar();
            break;
            case "4":
                operacoes.divisao();
            break;
            case "5":
                operacoes.historico.mostrarHistorico();
                break;
            case "6":
                return;

                default:
                throw new AssertionError();
        }
    }while (!opcao.equals("6"));
    }
}
