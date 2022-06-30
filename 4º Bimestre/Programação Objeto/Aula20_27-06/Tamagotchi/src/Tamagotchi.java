public class Tamagotchi {
    private Estado estado;

    public Tamagotchi (){
       setEstado(new Fome(this));
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    void come ()
    {
        estado.comer();
    }

    void bebe (){
        estado.beber();
    }


      void carinho (){
          estado.carinho();
    }


}
