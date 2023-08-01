import greenfoot.*;

public class Musica extends Actor {
    private GreenfootSound music;
    public void act()
    {
        reproducir();
        detener();
    }
    public Musica(String nombreArchivo) {
        music = new GreenfootSound(nombreArchivo);
    }
    public void reproducir() {
        music.play();
    }

    public void detener() {
        music.stop();
    }

    public void pausar() {
        music.pause();
    }

    public void continuar() {
        music.play();
    }

    public void ajustarVolumen(int volumen) {
        music.setVolume(volumen);
    }

    public boolean estaReproduciendo() {
        return music.isPlaying();
    }
}