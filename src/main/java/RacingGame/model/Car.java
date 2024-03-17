package RacingGame.model;

public class Car {
    private static final int DEFAULT_MOVE_DISTANCE = 1;
    private static final String DEFAULT_CAR_NAME = "default";
    private static final int INITAIL_CAR_POSITION = 0;
    private final String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Car() {
        this(DEFAULT_CAR_NAME, INITAIL_CAR_POSITION);
    }

    public Car(int position) {
        this(DEFAULT_CAR_NAME, position);
    }

    public Car(String name) {
        this(name, INITAIL_CAR_POSITION);
    }

    public int getPosition() {
        return position;
    }

    public void move(MovableStrategy strategy) {
        if (isMoveCar(strategy)) {
            move();
        }
    }

    private void move() {
        position += DEFAULT_MOVE_DISTANCE;
    }

    private static boolean isMoveCar(MovableStrategy strategy) {
        return strategy.movable();
    }

    public String name() {
        return this.name;
    }
}