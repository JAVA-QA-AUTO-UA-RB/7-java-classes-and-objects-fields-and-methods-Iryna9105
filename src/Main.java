public class Main {

    public static void main(String[] args) {

        SuperHero flesh = new SuperHero("Flesh", 30, 10);
        SuperHero ironMan = new SuperHero("Iron Man", 25, 8);


        int round = 1;
        System.out.println("Round " + round + " !!!");

        while (flesh.isAlive() && ironMan.isAlive()) {
            flesh.attack(ironMan);
            if (!flesh.isAlive()) {
                ironMan.win();
                flesh.showStats();
                ironMan.showStats();
                break;
            }


            ironMan.attack(flesh);
            if (!ironMan.isAlive()) {
                flesh.win();
                flesh.showStats();
                ironMan.showStats();
                break;
            }

            System.out.println();
            System.out.println("The hero statistics: ");
            flesh.showStats();
            System.out.println();
            ironMan.showStats();
            System.out.println();
            round++;
            System.out.println("Round " + round + "!!!");


        }
    }

}


        // Це був перший варіант. Тільки у мене так і не вийшло зробити рандомні удари. Буду ще експериментувати.

//        System.out.println("Round 1");
//        System.out.println();
//
//        flesh.attack(ironMan);
//        ironMan.attack(flesh);
//        flesh.attack(ironMan);
//        ironMan.attack(flesh);
//
//        flesh.rest(2);
//        ironMan.rest(2);
//        System.out.println();
//
//        flesh.showStats();
//        ironMan.showStats();
//
//        System.out.println();
//        if (ironMan.isAlive() || flesh.isAlive()) {
//            System.out.println("Round 2");
//        }
//        System.out.println();
//
//        flesh.attack(ironMan);
//        ironMan.attack(flesh);
//        flesh.attack(ironMan);
//        ironMan.attack(flesh);
//
//        flesh.rest(3);
//        ironMan.rest(3);
//        System.out.println();
//
//        flesh.showStats();
//        ironMan.showStats();
//        System.out.println();
//
//        if (ironMan.isAlive() || flesh.isAlive()) {
//            System.out.println("Round 3");
//        }
//        System.out.println();
//
//        flesh.attack(ironMan);
//        ironMan.attack(flesh);
//        flesh.attack(ironMan);
//        ironMan.attack(flesh);
//        System.out.println();
//
//        if (!ironMan.isAlive()) {
//            flesh.win();
//        } else {
//            ironMan.win();
//        }
//
//        System.out.println();
//        flesh.showStats();
//        ironMan.showStats();
//    }
//}









