import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int INDICE = 13, SOMA = 0, K = 0, fibo1 = 02, fibo2 = 1, aux = 0, valor = 0, i, n;
		
		boolean numeroinformado = false;
		Scanner sc = new Scanner(System.in);
		/*
		  1) Observe o trecho de código abaixo: */
		  
		  while (K < INDICE)
		 
		 {
		  
		  K = K + 1;
		 
		 SOMA = SOMA + K;
		  
		 } System.out.println(SOMA);
		 
		// A variavel soma vai ter valor 91.

		// 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
		// sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
		// 13, 21, 34...),
		// escreva um programa na linguagem que desejar onde, informado um número, ele
		// calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número
		// informado pertence ou não a sequência.
		
		  System.out.println("Digite um valor: "); valor = sc.nextInt();
		  
		  while (aux<valor) {
			  aux = fibo1; 
			  fibo1 = fibo1 + fibo2; 
			  fibo2 = aux;
		  System.out.println(aux);
		  if(aux == valor) 
			  numeroinformado = true;
		  
		  } 
		  if(numeroinformado == true) { 
			  System.out.println("O numero inserido na entrada está na sequencia de fibonacci"); }
		  else 
		System.out.println("O numero inserido na entrada não está na sequencia de fibonacci");
		  
		 /*
		 * 
		 * 3) Descubra a lógica e complete o próximo elemento: 
		 * a) 1, 3, 5, 7,9 ---> R= 9 
		 * b) 2, 4, 8, 16, 32, 64,128 ----> R = 1 2 8 
		 * c) 0, 1, 4, 9, 16, 25,36,49 -----> R = 49 
		 * d) 4, 16, 36, 64, 100 ------> R = 1 0 0 
		 * e) 1, 1, 2, 3, 5, 8, 13 -----> R = 13 
		 * f) 2,10, 12, 16, 17, 18, 19, 200 ------> 2 0 0
		 * 
		 * 
		 *  4 - Dois veículos (um carro e um caminhão) saem respectivamente de
		  cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a
		  Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em
		  direção a Ribeirão Preto a uma velocidade constante de 80 km/h.Quando eles se
		  cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?
		  
		  R: Para determinar o local em que o carro e o caminhão se cruzam podemos
		  colocar o ponto de referência em Ribeirão Preto entao a equação horario do
		  carro é: x1 = v1 * t E o caminhão sai de um local 100 km distante do ponto de
		  referência e se aproxima dele, sua equação horária é: x2 = 100km - v2t. Como
		  o caminhão tem 2 pedagios é necessário calcular o tempo de viagem dele sem os
		  obstaculos e depois acrescentar com os 2 obstaculos 100/80km = 1,25h; v2 =
		  100/1,42(1,25h+0,17h=1,42h) =70,6 km. Nas equações horárias podemos limpar o
		  tempo e igualar ambas para achar o ponto em que o carro e o caminhão se
		  cruzam: ------> 60,9 km. O carro e o caminhão estão à mesma distância de
		  Ribeirão Preto ao eles se cruzarem eles se encontram a 60,9 km de Ribeirão
		  Preto.
		  
		 * 5) Escreva um programa que inverta os caracteres de um string.
		 */
		String s, sAux;

		System.out.printf("Entrada: ");
		s = sc.nextLine();

		System.out.println();

		sAux = "";
		n = s.length();
		for (i = (n - 1); i >= 0; i--) {
			sAux = sAux + s.charAt(i);

		}
		System.out.printf("Saída..: %s\n", sAux);

	}
}
