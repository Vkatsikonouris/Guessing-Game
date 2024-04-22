import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int count=0;
        int the_number=random.nextInt(0,70);
        Random_number game=new Random_number();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give me your name ");
        String name=scanner.nextLine();
        System.out.println("Hello "+name+ " Lets start.Give me your prediction number between 0-70:" );
        while(true){
            count++;
            int number=Integer.parseInt(scanner.nextLine());
            int result =game.random(number,the_number,count);
            if(result==0)break;
            else{
                if(result<0)
                    System.out.println("Your gues was to High, try again but with a smaller number : ");
                else if(result>20)
                    System.out.println("Your guess is too low ,try again but with a bigger number  : ");
                else if(result<5 )
                    System.out.println("You almost found it ,try again :");
                else if(result<10)
                    System.out.println("You are very very close ,try again :");
                else if(result<20)
                    System.out.println("You are very close ,try again  :");

            }
        }
    }
}