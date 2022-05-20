public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int chance;

    Fighter(String name, int damage, int health, int weight, int dodge, int chance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge > 0 && dodge < 100)
            this.dodge = dodge;
        else
            this.dodge = 0;
        this.chance = chance;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + "=>" + foe.name + " " + this.damage + " kadar hasar vurdu");
        if (foe.isDodge()) {
            System.out.println(foe.name + " Gelen saldırıyı Dodgelandı");
            return foe.health;
        }
        System.out.println("----------");
        if (foe.health - this.damage < 0)
            return 0;
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber < this.dodge;
    }

    boolean isChance() {
        double changeRatio = Math.random() * 100;
        return changeRatio > this.chance;
    }
}
