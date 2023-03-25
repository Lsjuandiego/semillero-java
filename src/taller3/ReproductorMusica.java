package taller3;

public class ReproductorMusica {
    private Reproducible reproductor;

    public ReproductorMusica(Reproducible reproductor){
        this.reproductor = reproductor;
    }

    public void reproducirMusica(){
        reproductor.play();
    }


}
