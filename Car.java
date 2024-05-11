/**
 * Lab 10 Car class
 * @author Trace Taylor
 *
 */
public class Car extends Vehicle {
    private int passengers;
    private int doors;

    // Parameterized constructor
    public Car(String make, String model, String plate, int doors, int passengers){
    	super(make, model, plate);
        this.doors = doors;
        this.passengers = passengers;
    }
    
    public int getDoors() {
        return this.doors;
    }

    public int getPassengers() {
        return this.passengers;
    }

    @Override
    public String toString(){
        String retStr = String.format("%d-door %s %s with license %s.", this.getDoors(), this.getMake(), this.getModel(), this.getPlate());
        return retStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car other = (Car) obj;
            return (this.getDoors() == other.getDoors() && this.getPassengers() == other.getPassengers() && super.equals(other));
        }
        return false;
    }

    public Car copy() {
        Car carCopy = new Car(this.getMake(), this.getModel(), this.getPlate(), this.getDoors(), this.getPassengers());
        return carCopy;
    }
}