package ba.unsa.etf.rpr;

public enum Singleton {
    INSTANCE;

    int vrijednost;

    public int getvrijednost() {
        return vrijednost;
    }

    public void setvrijednost(int vrijednost) {
        this.vrijednost = vrijednost;
    }
}
