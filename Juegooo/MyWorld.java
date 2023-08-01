import greenfoot.*;  

/**
 * Write a description of class MyWorld here. 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Musica musicaFondo;
    private boolean juegoIniciado;
    public MyWorld()
    {    
        super(600, 600, 1); 
        musicaFondo = new Musica("Dogs and Cats.mp3");
        juegoIniciado = false;
    }
    public void act()
    {
        if (!juegoIniciado) 
        {
            musicaFondo.reproducir();
            juegoIniciado = true;
        }
        if (Greenfoot.isKeyDown("space")) 
        {
            Greenfoot.setWorld(new MazeWorld1());
        }
    }
    public void detenerMusica() 
    {
        musicaFondo.detener();
    }
}
