public class SuperHero {

    String name;
    int attackPower;
    int defensePower;
    int health;


    public SuperHero(String name, int attackPower, int defensePower) {
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.health = 100;
    }

    public void attack(SuperHero opponent) {
        int damage = this.attackPower - opponent.defensePower;
        System.out.println( name + " attacks " + opponent.name + " and causes " + damage + " damage!");
        opponent.takeDamage(damage);

    }

    public void takeDamage(int damage) {
        System.out.println( name + " has remaining health: " + this.health + ".");
        this.health -= damage;
    }

    public void rest(int minutes) {
        System.out.println("SuperHero " + name + " rests for " + minutes + " minutes!");
        health += 3 * minutes;

    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void win() {
        System.out.println("Superhero " + this.name + " wins!");
    }

    public void showStats() {
        System.out.println("SuperHero`s name: " + name);
        System.out.println("SuperHero`s attackPower " + attackPower);
        System.out.println("SuperHero`s defensePower" + defensePower);
        System.out.println("SuperHero`s health " +health);
    }



        // Тут мають бути властивості і поведінка Супергероя

    }

