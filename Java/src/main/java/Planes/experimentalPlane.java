package planes;

import models.ClassificationLevel;

public class ExperimentalPlane extends Plane{

    private final ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.classificationLevel = classificationLevel;
    }

    public final ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    @Override
    public final boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public final String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
