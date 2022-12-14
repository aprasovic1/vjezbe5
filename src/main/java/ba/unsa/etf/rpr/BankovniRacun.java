package ba.unsa.etf.rpr;

public class BankovniRacun {
    private String ime ;
    private String brojRacuna;
    private String email;
    private boolean zeliSMSObavijesti;

    private BankovniRacun(String ime, String brojRacuna) {
        this.ime = ime;
        this.brojRacuna=brojRacuna;
    }
    private BankovniRacun( String email) {
        this.email=email;
    }
    private BankovniRacun( boolean zeliSMSObavijesti) {
        this.zeliSMSObavijesti=zeliSMSObavijesti;
    }

    public BankovniRacun(BankovniRacunBuilder bd1) {
        this.ime= bd1.ime;
        this.brojRacuna=bd1.brojRacuna;
        this.email=bd1.email;
        this.zeliSMSObavijesti=bd1.zeliSMSObavijesti;
    }


    public String getIme() {
        return ime;
    }
    public String getBrojRacuna() {
        return brojRacuna;
    }
    public String getEmail() {
        return email;
    }
    public boolean isZeliSMSObavijesti() {
        return zeliSMSObavijesti;
    }

    public static class BankovniRacunBuilder {
        private String ime ;
        private String brojRacuna;
        private String email;
        private boolean zeliSMSObavijesti;

        public BankovniRacunBuilder(String ime, String brojRacuna) {
            this.ime = ime;
            this.brojRacuna=brojRacuna;
        }

        public BankovniRacunBuilder email(String email){
            this.email=email;
            return this;
        }
        public BankovniRacunBuilder zeliSMS(boolean zeliSMSObavijesti){
            this.zeliSMSObavijesti=zeliSMSObavijesti;
            return this;
        }
        public BankovniRacun build() {
            return new BankovniRacun(this);
        }

    }

}

