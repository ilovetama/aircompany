package planes;

import java.util.Objects;

public class PassengerPlane extends Plane{

    private final int passengersCapacity;

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public final int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public final String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                '}');
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;
        if (!super.equals(o)) return false;
        PassengerPlane plane = (PassengerPlane) o;
        return passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}
