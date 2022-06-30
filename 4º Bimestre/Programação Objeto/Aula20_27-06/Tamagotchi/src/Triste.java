public class Triste implements Estado{

    private Tamagotchi tamagotchi;


    public  Triste(Tamagotchi tamagotchi){
        this.tamagotchi = tamagotchi;
    }
    @Override
    public void comer() {
        System.out.println("bip bip - vomitar");

    }

    @Override
    public void beber() {
        System.out.println("Triste - Nao muda");

    }

    @Override
    public void carinho() {
        tamagotchi.setEstado(new Feliz());
        System.out.println("Triste - Feliz");

    }








}
