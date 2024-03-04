class Car {
    //nitelikler :variables ile tanımlanır.
    String model;
    String type;
    int speed;
    int speedLimit;

    Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
        this.type = "Sedan";
        this.speedLimit = 180;
    }
    // davranışlar : metotlar ile tanımlanır.
    void increaseSpeed(int increment) {
        if (this.speed + increment < this.speedLimit) {
            speed += increment;
        } else {
            this.speed = 180;
        }
    }

    void decreaseSpeed(int decrease) {
        if (this.speed - decrease > 0) {
            this.speed -= decrease;
        }
    }


    void printInfo() {
        System.out.println("Model: " + this.model);
        System.out.println("Type: " + this.type);
        System.out.println("Speed: " + this.speed);
        System.out.println("speedLimit: " + this.speedLimit);

    }

}
