package Exercise2;

public enum PizzaMass {
    SLIM(0.8),
    THICK(1.0),
    INTEGRAL(1.5);

    private Double thicknessMultiplierFactor;

    PizzaMass(Double thicknessMultiplierFactor) {
        this.thicknessMultiplierFactor = thicknessMultiplierFactor;
    }

    public Double getThicknessMultiplierFactor() {
        return thicknessMultiplierFactor;
    }
}
