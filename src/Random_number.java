import java.util.Random;

public class Random_number {

    public int random(int number,int the_number,int count){
        if(the_number==number){
            System.out.println("You win , GUESSED THE NUMBER CORRECTLY");
            if(count==1) System.out.println("Score : 10  / 10 ⭐ ");
            else if(count==2) System.out.println("Score : 9.5  / 10 ⭐ ");
            else if(count<3) System.out.println("Score : 9  / 10 ⭐ ");
            else if(count<5) System.out.println("Score : 8.5  / 10 ⭐ ");
            else if(count<7) System.out.println("Score : 7  / 10 ⭐ ");
            else if(count>20)System.out.println("Score : 2 / 10 ⭐");
            else if(count<15)System.out.println("Score : 5  / 10 ⭐ ");
            return 0;
        }
        else return the_number-number;
    }
}
