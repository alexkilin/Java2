package lesson1.marathon;

import lesson1.marathon.competitors.Cat;
import lesson1.marathon.competitors.Competitor;
import lesson1.marathon.competitors.Dog;
import lesson1.marathon.competitors.Human;
import lesson1.marathon.obstacles.Cross;
import lesson1.marathon.obstacles.Obstacle;
import lesson1.marathon.obstacles.Wall;
import lesson1.marathon.obstacles.Water;



public class Team {
    public static String name;

    public static void main(String[] args) {
        Competitor[] DreamTeam = {new Human("Bob"),
                new Cat("Vaska"), new Dog("Tuzik"), new Human("Mike")};


        for (Competitor c:DreamTeam) {
            System.out.println(c.name+" run: "+c.run+" jump: " +DreamTeam[i].jump+ " swim: " +DreamTeam[i].swim);
        };
        }



       /* for (int i = 0; i<3; i++) {
            System.out.println(DreamTeam[i].name+" run: "+DreamTeam[i].run+" jump: " +DreamTeam[i].jump+ " swim: " +DreamTeam[i].swim);
        }
        for (int i = 0; i<3; i++) {
            if (DreamTeam[i].isOnDistance) {
                System.out.println(DreamTeam[i].name);
            }
        }
        ListofTeam ();
        ListofBestMembers();*/

    }

    /*public static void ListofTeam (){

        for (int i = 0; i<3; i++) {
           System.out.println(DreamTeam[i].name+" run: "+DreamTeam[i].run+" jump: " +DreamTeam[i].jump+ " swim: " +DreamTeam[i].swim);
        }

    }
    public static void ListofBestMembers (){
        for (int i = 0; i<3; i++) {
            if (DreamTeam[i].isOnDistance) {
                System.out.println(DreamTeam[i].name);
            }
        }

    }*/


        }
