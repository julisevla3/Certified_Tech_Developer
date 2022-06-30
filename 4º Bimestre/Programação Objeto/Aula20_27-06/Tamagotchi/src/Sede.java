public class Sede  implements Estado {
    private Tamagotchi tamagotchi;

    public Sede(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    @Override
    public void comer(){
        System.out.println("Sede  -  Nao muda");
    }


    @Override
    public void beber(){
        tamagotchi.setEstado(new Feliz());
        System.out.println("Sede - Feliz");
    }

    @Override
    public void carinho(){
        System.out.println("Sede  -  Nao muda");
    }



}
