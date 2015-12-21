package lab4;

// Гвоздики
public class Stud extends Earring {
    protected String typeOfClaps;

    public Stud(String typeOfMetal, String gem, String size, String typeOfClaps) {
        super(typeOfMetal, gem, size);
        this.typeOfClaps = typeOfClaps;
    }

    @Override
    public String getDescription() {
        return "Гвоздики: [тип металла: " + typeOfMetal + "]" +
                "[камень: " + gem + "]" +
                "[размер: " + size + "]" +
                "[тип застежки: " + typeOfClaps + "]" ;
    }
}
