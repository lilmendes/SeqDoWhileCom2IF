package pacote;

public class Revis�o {

	public static void main(String[] args) {

		//Comando para adicionar duas condi��es a estrutura IF. if(condi��o1 && condi��o2){}
		/// Problema: elaborar dinamicamente uma sequencia decrescente de valores inteiros
		// positivos, �mpares, divis�veis por 3, 
		//iniciada pelo n�mero 99, contendo 15 elementos. 
		//Utilize a estrutura do/while para solucionar esse problema.
		int  num = 99, qtd = 1; 
		
		
		System.out.print("A sequ�ncia �: ");
		do {
			if(num % 3 == 0 && num % 2 != 0) {
			System.out.print(num + (", "));
		
		qtd++;
		}num--;
		} while(qtd<=15);
		} 
	}
 
