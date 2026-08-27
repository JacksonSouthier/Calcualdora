import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Historico{

    Scanner entrada = new Scanner(System.in);

/*
essa classe esta responsavel em criar/abrir(se ja existe) um arquivo local para armazenar os resultados
das opecoes e ler esses arquivos.
 */
    Operacoes operacoes;

    public Historico(Operacoes operacoes){
        this.operacoes = operacoes;
    }
/*
este metodo e usado no fim de todas as operacoes para salvar o resultado na memoria.
*/
    void salvarHistorico(){
        
try {
    double resultado1 = operacoes.getResultado();
    FileWriter historico = new FileWriter("historico.txt", true);
    historico.write(String.valueOf(resultado1));
    historico.write("\n");

    historico.close();
} catch (Exception e) {
    System.out.println("Erro ao salvar Hitorico");
}
}
/*
este metodo usado para abrir, ler e converter em string as informacoes
que estiverem salvas na memoria
*/
void mostrarHistorico(){
    try {
                    for (int i = 1; i < 15; i++){
                System.out.println(" ");
            }
        FileReader historico  =new FileReader("historico.txt");
        BufferedReader leitor = new BufferedReader(historico);

        String linha;

        while ((linha = leitor.readLine()) != null){
            System.out.println(linha);
    }
        leitor.close();

        System.out.println("""
            1 - Voltar
            2- Apagar Historico
        """);
        String a = entrada.next();
        if (a.equals("2")){
            limparHistorico();
        }

    } catch (Exception e) {
        System.out.println("Erro ao ler Historico");
    }
}
/*
metodo reponsavel para limpar o historico, ele sobreescreve o arquivo anterior
com nenhum dado. deixando o arquivo null.
*/
void limparHistorico(){
    try {
        FileWriter historico = new FileWriter("historico.txt");
        historico.close();

        System.out.println("Historico limpo");

    } catch (Exception e) {
        System.out.println("Erro ao limpar Historico");
    }
}
}
