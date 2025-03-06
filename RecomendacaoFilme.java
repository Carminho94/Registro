// Início
//     Declarar variável idade como inteiro
 
//     Escrever "Por favor, informe sua idade:"
//     Ler idade
 
//     Se idade >= 0 e idade <= 12 então
//         Escrever "Recomendação: Filmes infantis."
//     Senão se idade >= 13 e idade <= 17 então
//         Escrever "Recomendação: Filmes para adolescentes."
//     Senão se idade >= 18 então
//         Escrever "Recomendação: Filmes para adultos."
//     Senão
//         Escrever "Idade inválida."
// Fim

import java.util.Scanner;
 
public class RecomendacaoFilme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, informe sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade >= 0 && idade <= 12) {
            System.out.println("Recomendação: Filmes infantis.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Recomendação: Filmes para adolescentes.");
        } else if (idade >= 18) {
            System.out.println("Recomendação: Filmes para adultos.");
        } else {
            System.out.println("Idade inválida.");
        }
        
        scanner.close();
    }
}
 