public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void isMatchRun() {
        if (isWeightOk()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                System.out.println(f2.name + " remaining health:" + f2.health);
                System.out.println(f1.name + " remaining health:" + f1.health);

            }
        }
    }

    boolean isWeightOk() {
        return (f1.weight >= this.minWeight && f1.weight <= this.maxWeight) &&
                (f2.weight >= this.minWeight && f2.weight <= this.maxWeight);
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Winner: " + f2.name);
            return true;
        }
        if (f2.health == 0) {
            System.out.println("Winner: " + f1.name);
            return true;
        }
        return false;
    }


}

// 2 tane boksör var. sırayla birbirlerine vuruş yapacaklar. f1 f2'ye vurduğunda canı azalacak. aynı şekilde f2 de f1 e vurduğunda canı azalacak. ilk 0 olan maçı kaybedecek.