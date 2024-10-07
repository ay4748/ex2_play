//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Playable[] p = new Playable[3];
        p[0] = (new Guitar());
        p[1] = (new Piano());
        p[2] = (new Drum());

        for(Playable pl : p)
        {
            pl.play();
        }
    }
}