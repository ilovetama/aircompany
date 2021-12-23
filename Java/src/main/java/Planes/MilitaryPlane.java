package planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private final MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public final MilitaryType getType() {
        return type;
    }

    @Override
    public final String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                '}');
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return type == that.type;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
