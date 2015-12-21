package lab4;

public abstract class Jewelry {
    protected String typeOfMetal;
    protected String gem; // драгоценный камень; null - если нет камня

    public Jewelry(String typeOfMetal, String gem) {
        this.typeOfMetal = typeOfMetal;
        this.gem = gem;
    }

    public String getDescription() {
        return "Ювелирное украшение: [тип металла: " + typeOfMetal + "]" +
                "[камень: " + gem + "]";
    }

    public abstract void putOn(Place place);
}
