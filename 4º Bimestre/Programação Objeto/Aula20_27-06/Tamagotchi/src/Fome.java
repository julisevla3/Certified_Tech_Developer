public class Fome implements Estado{
    private Tamagotchi tamagotchi;

    public Fome(Tamagotchi tamagotchi){
        this.tamagotchi = tamagotchi;
    }

        @Override
        public void comer(){
        tamagotchi.setEstado(new Feliz());
            System.out.println("Fome  -  come  - Feliz");
        }


    @Override
    public void beber(){
        tamagotchi.setEstado(new Feliz());
        System.out.println("Fome  -  bebe  - Feliz");
    }

    @Override
    public void carinho(){
        System.out.println("Fome  -  Nao muda");
    }


}
