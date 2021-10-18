/******************************************************************************
Em um vetor estão armazenados o faturamento mensal de um ano de uma determinada
empresa, conforme arquivo em anexo.

double[] fatura = {150350.50, 170980.30, 140341.90, 158480.50,
                   167120.10, 181380.60, 173875.20, 153987.50,
                   175680.80, 180360.10, 162450.80, 157650.40};

Elabore um programa para mostrar:

O faturamento de cada trimestre.
O trimestre com maior faturamento.
Considerar que não houve trimestre com igual faturamento.
O faturamento médio:
           - dos primeiros meses dos trimestres (jan, abr, jul e out)0-3-6-9
           - dos segundos meses dos trimestres (fev, mai, ago e nov)1-4-7-10 
           - dos terceiros meses dos trimestres (mar, jun, set e dez)2-5-8-11

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		double[] fatura = {150350.50, 170980.30, 140341.90, 158480.50,
                            167120.10, 181380.60, 173875.20, 153987.50,
                            175680.80, 180360.10, 162450.80, 157650.40};
        double[] faturaTri = new double[4];
        double maiorTri, total, media;
        int mes, trimestre, maior;
        
        mes = trimestre = maior = 0;
        maiorTri = total = media = 0.0d;
        
        while(mes < 12){
            faturaTri[trimestre] = fatura[mes] + fatura[mes + 1] + fatura[mes + 2];
            mes = mes + 3;
            trimestre = trimestre + 1;
        }//end-while
        
        System.out.println("---FATURAMENTO DE CADA TRIMESTRE---");
        for(int i =0; i < 4; i++){
		    System.out.print("\nFaturamento do " + (i + 1) + "º trimestre: R$ " + faturaTri[i]);
        }//end-for
        
        System.out.println("\n\n---O TRIMESTRE DE MAIOR FATURAMENTO---");
        for(int i = 0; i <= 3; i++){
            if(faturaTri[i] > maiorTri){
                maiorTri = faturaTri[i];
                maior = i;
            }//end-if
        }//end-for
        System.out.println("O trimestre de maior faturamento foi: " + (maior + 1) +"º trimestre.");
        
        System.out.println("\n\n---OS FATURAMENTOS MÉDIOS:---");
        
        for(int i = 0; i <= 11; i = i + 3){
            total = total + fatura[i];
        }//end-for
        media = total / 4;
        System.out.print("\nO faturamento médio dos meses de Janeiro, Abril, Julho e Outubro é: R$ " + media);
        
        total = media = 0d;
        
        for(int i = 1; i <= 11; i = i + 3){
            total = total + fatura[i];
        }//end-for
        media = total / 4;
        System.out.print("\nO faturamento médio dos meses de Fevereiro, Maio, Agosto e Novembro é: R$ " + media);
        
        total = media = 0d;
        
        for(int i = 2; i <= 11; i = i + 3){
            total = total + fatura[i];
        }//end-for
        media = total / 4;
        System.out.print("\nO faturamento médio dos meses de Março, Junho, Setembro e Dezembro é: R$ " + media);
        
	}//end-void-main
}//end-Main
