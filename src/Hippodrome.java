import java.util.ArrayList;

/**
 * Created by SkyReX on 27.08.2015.
 */
public class Hippodrome
{
    public static Hippodrome game;
    public ArrayList<Horse> horses = new ArrayList<Horse>();

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public static void main(String args[]){

        game = new Hippodrome();

        Horse horse1 = new Horse("Шустрик",3,0);
        Horse horse2 = new Horse("Стремительный",3,0);
        Horse horse3 = new Horse("Мгновенный",3,0);


           game.getHorses().add(horse1);
           game.getHorses().add(horse2);
           game.getHorses().add(horse3);

        game.run();

        game.printWinner();



    }

    public void move(){

        for (Horse horse : horses)
        {
            horse.move();
        }



    }

    public void print(){

        for(Horse horse : horses){
            horse.print();
        }

        System.out.println();
        System.out.println();



    }

    public void run(){
        for (int i = 0;i<100; i++){
            move();
            print();
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public Horse getWinner(){

        Horse winner = getHorses().get(0);


        for (Horse horse : horses)
        {
            if(winner.getDistance()<=horse.getDistance())
                winner = horse;
        }

        return winner;


    }

    public void printWinner(){

        System.out.println("Winner is " +getWinner().getName()+"!" );

    }
}
