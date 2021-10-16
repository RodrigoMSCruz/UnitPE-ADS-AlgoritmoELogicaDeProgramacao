/******************************************************************************
Considere o array abaixo e elabore um programa para mostrar o seguinte:
[0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
8   17  25  50  14  19  28  77  85  45
    
Observações:
• Esses valores são sugestivos para que possa ser gerado um gabarito de teste. O programa deve funcionar para qualquer combinação de valores.
• Não utilizar outro array auxiliar.
a) Os valores armazenados nas posições pares. (8, 25, 14, 28, 85)
b) Os valores pares. (8, 50, 14, 28)
c) Os valores armazenados das posições 9 a 0. (45, 85, 77, 28, 19, 14, 50, 25, 17, 8)
d) Os valores armazenados das posições 4 a 8. (14, 19, 28, 77, 85)
e) Até que os elementos estejam em ordem crescente. (8, 17, 25, 50)
f) Apenas os elementos que estão na ordem crescente. (8, 17, 25, 50, 77, 85)
g) A partir da última posição, apenas os elementos que estão na ordem decrescente. (45, 28, 19, 14, 8)
h) Os elementos das posições 0 a 9, intercalados com elementos das posições 9 a 0.
(8, 45, 17, 85, 25, 77, 50, 28, 14, 19, 19, 14, 28, 50, 77, 25, 85, 17, 45, 8)
i) Considerar o array dividido em duas partes e mostrar os elementos das duas partes
intercalados (0 a 4 intercalado com 5 a 9).
(8, 19, 17, 28, 25, 77, 50, 85, 14, 45)
j) Desafio: os valores em ordem crescente, sem ordenar o array.
(8, 14, 17, 19, 25, 28, 45, 50, 77, 85)

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int[] numero = {8, 17, 25, 50, 14, 19, 28, 77, 85, 45};
		int compara, x, y;
		
		compara = x = y = 0;
		
		System.out.println("A:");
		for(int i = 0; i <= 9; i = i + 2){
		    System.out.print(numero[i] + " ");
		}//end-for
		
		System.out.println("\n");
		System.out.println("B:");
		for(int i = 0; i <= 9; i++){
		    if(numero[i] %2 == 0){
		        System.out.print(numero[i] + " ");
		    }//end-if
		}//end-for
		
		System.out.println("\n");
		System.out.println("C:");
		for(int i = 9; i >= 0 ; i--){
		    System.out.print(numero[i] + " ");
		}//end-for
		
		System.out.println("\n");
		System.out.println("D:");
		for(int i = 4; i <= 8 ; i++){
		    System.out.print(numero[i] + " ");
		}//end-for
		
		System.out.println("\n");
		System.out.println("E:");
		System.out.println("NÃO CONSEGUI!");
		
		System.out.println("\n");
		System.out.println("F:");
		compara = numero[0];
		for(int i = 0; i <= 9 ; i++){
		    if(numero[i] >= compara){
		        System.out.print(numero[i] + " ");
		        compara = numero[i];
		    }//end-if
		}//end-for
		
		System.out.println("\n");
		System.out.println("G:");
		compara = numero[9];
		for(int i = 9; i >= 0 ; i--){
		    if(numero[i] <= compara){
		            System.out.print(numero[i] + " ");
		            compara = numero[i];
		    }//end-if
		}//end-for
		
		System.out.println("\n");
		System.out.println("H:");
		x = 0;
		y = 9;
		while((x <= 9) && (y >= 0)){
	        System.out.print(numero[x] + " " + numero[y] + " ");
		    x++;
		    y--;
		}//end-while
		
		System.out.println("\n");
		System.out.println("I:");
		x = 0;
		y = 5;
		while((x <= 4) && (y <= 9)){
	        System.out.print(numero[x] + " " + numero[y] + " ");
		    x++;
		    y++;
		}//end-while
		
		System.out.println("\n");
		System.out.println("J:");
	    System.out.println("NÃO CONSEGUI!");
		
		}//end-void-main
}//end-class-Main
