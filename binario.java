import java.util.Scanner;
public class binario{
    public static void main(String[] args){
     
        Scanner input= new Scanner(System.in);
        System.out.print("Digite um número: "); 

        int d,x = 0; int[] b = new int[10];
        d = input.nextInt();
        input.close();
        while ( d > 1) 
{ 
    b[x] = d % 2; 
   
    d = d/2;
 
    x++;
} 
 
 
for (int cont=b.length-1; cont>=0; cont--){
    System.out.print(b[cont]);
}
    }
}