import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        List<Game> lista = new ArrayList<>();

            Game gra1 = gameBuilder.Create();
            Game gra2 = gameBuilder.Create();
            Game gra3 = gameBuilder.Create();
            lista.add(gra1);
            lista.add(gra2);
            lista.add(gra3);



        for(Game el:lista) {
            System.out.println(el.getTitle());
            System.out.println(el.getType());
            if(el instanceof Strategy) {
                ((Strategy) el).build();
                System.out.println(((Strategy) el).buildCounter);
                ((Strategy) el).destroyBuilding();
                System.out.println(((Strategy) el).buildCounter);
                ((Strategy) el).build();
                System.out.println(((Strategy) el).buildCounter);
            }
                if(el instanceof Simulator)((Simulator)el).Drive();
                if(el instanceof Shooter){
                    ((Shooter)el).setAmmo();
                    ((Shooter)el).Shot();
                    ((Shooter)el).Shot();
                    ((Shooter)el).Shot();
                    ((Shooter)el).Shot();
                    ((Shooter)el).ActualAmmo();
                }
                System.out.println("--------------------");
            }

//            System.out.println(el.getType());
//            System.out.println(el.getTitle());
//            ((Strategy) el).build();
//            System.out.println(el.buildCounter);
        }



    }

