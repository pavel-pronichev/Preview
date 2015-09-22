/**
 * Created by SkyReX on 27.08.2015.
 */
public class Horse
{
    public String name;
    public double speed;
    public double distance;


    public Horse(String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
   }

   public void move(){

       distance += speed*Math.random();

   }

    public void print(){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<(int)distance; i++){
            sb.append(".");
        }
        System.out.println(sb.toString() + name);

    }

    public String getName()
    {
        return name;
    }

    public double getSpeed()
    {
        return speed;
    }

    public double getDistance()
    {
        return distance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }
}


