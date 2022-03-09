import java.util.Scanner;

class MaiorMenor{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int idade= ler.nextInt();
        if(idade > 17 & idade <120){
            System.out.println("Maior de idade");
        }
        else{
            if(idade < 18 & idade >= 0){
                  System.out.println("Menor de idade");
            }
            else{
                System.out.println("Tem nao lek");
            }
        }
    }   
}