package lab4;

public class Ring extends Jewelry {

    protected int size;

    public Ring(String typeOfMetal, String gem, int size) {
        super(typeOfMetal, gem);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Кольцо: [тип металла: " + typeOfMetal + "]" +
                "[камень: " + gem + "]" +
                "[размер: " + size + "]";
    }

    @Override
    public void putOn(Place place) {
        if (place.equals(Place.FINGER)) {
            System.out.println("Кольцо надето!!");
        } else {
            System.out.println("Вы пытаетесь надеть кольцо на " + place);
        }
    }
}
