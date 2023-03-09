import java.util.ArrayList;
class Schilderij {
    public String titel;

    public Schilderij(String titel) {
        this.titel = titel;
    }

    class Veiling {
        private ArrayList<Schilderij> schilderijenaanbod = new
                ArrayList<>();
        private ArrayList<Schilderij> verkochteSchilderijen = new
                ArrayList<>();

        public void verkoopSchilderij(String titel) {
            for (Schilderij schilderij : schilderijenaanbod) {
                verkochteSchilderijen.add(schilderij);
                schilderijenaanbod.remove(schilderij);
                System.out.println("Dit is een test");
            }
        }
    }
}