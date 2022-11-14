package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    BankovniRacun b=new BankovniRacun.BankovniRacunBuilder("Ime","123456").email("email1").zeliSMS(false).build();
    Lik lik1=new GeometrijskiLikFactory().dajLik(4);
    Singleton s=Singleton.INSTANCE;
    }
}
