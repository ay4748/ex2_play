public class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("the guitar is playing");
    }

    public boolean strings()
    {
        return true;
    }
}
