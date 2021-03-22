public class TestGame{
    public static void main(String[] args) {
        GamePlayer Sani = new GamePlayer(1.1, 2.2, 3, 4);

        System.out.println(Sani.getWidth());
        System.out.println(Sani.getHeight());
        System.out.println(Sani.getX());
        System.out.println(Sani.getY());
        System.out.println();

        Sani.setDimension(6.6, 7.7);
        Sani.setPosition(10, 20);

        System.out.println(Sani.getWidth());
        System.out.println(Sani.getHeight());
        System.out.println(Sani.getX());
        System.out.println(Sani.getY());
        System.out.println();

        Sani.Run();
        System.out.println();

        Sani.Run(10);
    }
}
