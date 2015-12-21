package lab4;

public class Chain extends Jewelry {
    protected int length;

    public Chain(String typeOfMetal, String gem, int length) {
        super(typeOfMetal, gem);
        this.length = length;
    }

    @Override
    public String getDescription() {
        return "Цепочка: [тип металла: " + typeOfMetal + "]" +
                "[камень: " + gem + "]" +
                "[длина: " + length + "]";
    }

    @Override
    public void putOn(Place place) {
        if (place.equals(Place.NECK)) {
            System.out.println("Цепочка надета!!");
        } else {
            System.out.println("Вы пытаетесь надеть цепочку на " + place);
        }
    }
}
