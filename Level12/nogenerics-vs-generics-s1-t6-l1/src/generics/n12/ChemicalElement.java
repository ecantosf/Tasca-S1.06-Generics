package generics.n12;

public class ChemicalElement {
    private String name;
    private String symbol;
    private int atomicNumber;
    private double meltingPoint;  // en Kelvin

    public ChemicalElement(String name, String symbol, int atomicNumber, double meltingPoint) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.meltingPoint = meltingPoint;
    }

    @Override
    public String toString() {
        return String.format("%-10s (%2s) | Z=%2d | mp=%6.1fK",
                name, symbol, atomicNumber, meltingPoint);
    }
}