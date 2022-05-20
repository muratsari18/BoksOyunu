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

    void run() {
        if (isCheck()) {
            if (f1.isChance() && !f2.isChance()){
                System.out.println("====İlk Vuran Alex====");
                while (this.f1.health > 0 && this.f2.health > 0) {

                    System.out.println("======= NEW ROUND ========");
                    f2.health = f1.hit(f2);

                    if (isWin())
                        break;
                    f1.health = f2.hit(f1);
                    if (isWin())
                        break;

                    System.out.println(this.f1.name + " Sağlık :" + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık :" + this.f2.health);
                }
            }
            else{
                System.out.println("====İlk Vuran Anya====");

                while (this.f1.health > 0 && this.f2.health > 0) {

                    System.out.println("======= NEW ROUND ========");
                    f1.health = f2.hit(f1);

                    if (isWin())
                        break;
                    f2.health = f1.hit(f2);
                    if (isWin())
                        break;

                    System.out.println(this.f1.name + " Sağlık :" + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık :" + this.f2.health);
                }

            }

            }
        else
            System.out.println("sikletler birbirine uymuyor");

    }

    public boolean isCheck() {
        // return de her ikisi doğru ise çalışacak

        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println(f2.name + ": Kazanan");
            return true;
        }
        if (f2.health == 0) {
            System.out.println(f1.name + ": Kazanan");
            return true;
        }
        return false;
    }


}
