import java.util.Scanner;
 
public class Main {
   
    public static void main(String[] args) {
        int sum=0, pro=1;
        // 1-й этап - ввод числа
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        
        // 2-й этап - вычисление количества символов
        int n = (int)Math.log10(num)+1;
       
        //3-й этап - сумма чисел и Производство
        while (num!=0){
            sum += (num%10);
            pro *= (num%10);
            num /= 10;
        }
        
        // Палидром
        for (int i=0; i<(n/2); ++i){
            if (num.charAt(i) != num.charAt(n - i - 1)) {
                System.out.println("Число не является палидромом");
            }
        }
        System.out.println("Число является палидромом");
        System.out.println("Сумма: " + sum);
        System.out.println("Производство: " + pro);
        
        in.close();
    }
}
