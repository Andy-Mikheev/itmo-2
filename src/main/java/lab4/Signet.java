package lab4;

public class Signet extends Ring {
    protected String form;

    public Signet(String typeOfMetal, String gem, int size, String form) {
        super(typeOfMetal, gem, size);
        this.form = form;
    }

    @Override
    public String getDescription() {
        return "Перстень: [тип металла: " + typeOfMetal + "]" +
                "[камень: " + gem + "]" +
                "[размер: " + size + "]" +
                "[форма: " + form + "]";
    }
}
