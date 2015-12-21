package lab4;

public class Earring extends Jewelry {
    protected String size;

    public Earring(String typeOfMetal, String gem, String size) {
        super(typeOfMetal, gem);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Серьга: [тип металла: " + typeOfMetal + "]" +
                "[камень: " + gem + "]" +
                "[размер: " + size + "]";
    }

    @Override
    public void putOn(Place place) {
        if (place.equals(Place.EAR)) {
            System.out.println("Серьга надета!!");
        } else {
            System.out.println("Вы пытаетесь надеть серьгу на " + place);
        }
    }
}
