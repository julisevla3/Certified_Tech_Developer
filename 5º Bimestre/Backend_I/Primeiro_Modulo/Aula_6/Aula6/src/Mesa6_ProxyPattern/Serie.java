package Mesa6_ProxyPattern;

public class Serie implements ISerie{

    public Serie() {

    }
    @Override
    public String getSerie(String nome) {
      return "www."+nome+".com";

    }
}
