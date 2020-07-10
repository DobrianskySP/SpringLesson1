package ru.springlesson1.dobrianskysp;

public class MusikPlayer {
    private Musik musik;

    public MusikPlayer(Musik musik) {
        this.musik = musik;
    }

    public void playMusik(){
        System.out.println("Musik playing: " + musik.getSong());
    }
}
