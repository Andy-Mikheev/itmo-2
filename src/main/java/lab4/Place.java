package lab4;

public enum Place {
    FINGER("палец"),
    EAR("ухо"),
    NECK("шея");

    private String name;

    Place(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
