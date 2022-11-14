package ba.unsa.etf.rpr;
interface LikInterface{
    String DajOblik();
}
abstract class Lik{
    private String oblik;
    private int brojStranica;

    public abstract String DajOblik() ;
}
public class GeometrijskiLikFactory implements LikInterface {
   private String oblik;
   private int brojStranica;
    @Override
    public String DajOblik() {
        return oblik;
    }
    public Lik dajLik(int brojStranica){
    if(brojStranica == 3) {
        return new Triangle();
    }
        if(brojStranica == 4) {
        return new Square();
    }
        if(brojStranica == 5) {
        return new Pentagon();
    }

        return null;
}

private class Triangle extends Lik{
    private String oblik;
    private int brojStranica;
    @Override
    public String DajOblik() {
        return oblik;
    }
}
    private class Square extends Lik {
        private String oblik;
        private int brojStranica;
        @Override
        public String DajOblik() {
            return oblik;
        }
    }
    private class Pentagon extends Lik{
        private String oblik;
        private int brojStranica;
        @Override
        public String DajOblik() {
            return oblik;
        }
    }
}

