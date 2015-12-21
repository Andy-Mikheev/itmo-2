package lab4;

public class Main {
    public static void main(String[] args) {
        Jewelry ring = new Ring("Золото", null, 15);
        Jewelry earring = new Earring("Серебро", "Аметист", "маленькая");
        Jewelry chain = new Chain("белое золото", null, 30);

        System.out.println(ring.getDescription());
        System.out.println(earring.getDescription());
        System.out.println(chain.getDescription());

        Ring weddingRing = new WeddingRing("Золото", null, 15, true);
        Ring signet = new Signet("Золото", null, 15, "квадрат");
        Earring lanes = new Lanes("Серебро", "Аметист", "маленькая", "ромбовитая");
        Earring stud = new Stud("Серебро", "Аметист", "маленькая", "винтовая");

        System.out.println(weddingRing.getDescription());
        System.out.println(signet.getDescription());
        System.out.println(lanes.getDescription());
        System.out.println(stud.getDescription());
        System.out.println();

        weddingRing.putOn(Place.EAR);
        weddingRing.putOn(Place.FINGER);

        signet.putOn(Place.NECK);
        signet.putOn(Place.FINGER);

        lanes.putOn(Place.FINGER);
        lanes.putOn(Place.EAR);

        stud.putOn(Place.NECK);
        stud.putOn(Place.EAR);

        chain.putOn(Place.EAR);
        chain.putOn(Place.NECK);
    }
}
