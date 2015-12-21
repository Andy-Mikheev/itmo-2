package lab4;

// Дорожки
public class Lanes extends Earring {
    protected String form;

    public Lanes(String typeOfMetal, String gem, String size, String form) {
        super(typeOfMetal, gem, size);
        this.form = form;
    }

    @Override
    public String getDescription() {
        return "Дорожка: [тип металла: " + typeOfMetal + "]" +
                "[камень: " + gem + "]" +
                "[размер: " + size + "]" +
                "[форма: " + form + "]";
    }
}
