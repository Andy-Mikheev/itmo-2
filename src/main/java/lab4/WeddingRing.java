package lab4;

public class WeddingRing extends Ring {
    protected boolean hasPair;

    public WeddingRing(String typeOfMetal, String gem, int size, boolean hasPair) {
        super(typeOfMetal, gem, size);
        this.hasPair = hasPair;
    }

    @Override
    public String getDescription() {
        return "Обручальное кольцо: [тип металла: " + typeOfMetal + "]" +
                "[камень: " + gem + "]" +
                "[размер: " + size + "]" +
                "[наличие пары: " + hasPair + "]";
    }
}
