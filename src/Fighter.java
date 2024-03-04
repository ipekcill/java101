public class Fighter {
    String name;
    int weight;
    int damage;
    int health;
    double Dodge;

    Fighter(String name, int weight, int damage, int health, double dodge) {
        this.name = name;
        this.weight = weight;
        this.damage = damage;
        this.health = health;
        this.Dodge = dodge;
        if (this.Dodge > 0 && this.Dodge < 100) {
            this.Dodge = dodge;
        } else {
            this.Dodge = 0;
        }
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        if (Dodge <= randomNumber) {
            return true;
        } else {
            return false;
        }
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " ==>> " + foe.name + " " + this.damage + " hasarlık vurdu");
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;

    }

    void print() {
        System.out.println(this.name + ": " + this.health);
    }
}
