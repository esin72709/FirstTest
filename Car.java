public class Car {
    private String color;
    private String model;
    private int power;
    private int curSpeed;

    public Car() {
        curSpeed = 0;
    }

    public Car(String color, String model, int power) {
        this.color = color;
        this.model = model;
        this.power = power;
    }

    public void go() {
        if (power < 200) {
            curSpeed += 10;
        } else if (power >= 200) {
            curSpeed += 20;
        }
        System.out.printf("Accelerate %s, Current Speed %d\n", model, curSpeed);
    }

    public void stop() {
        curSpeed = 0;
    }
}
