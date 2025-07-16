public class PoemTester {
    public static void main(String[] args) {
        Poem p1 = new Poem(12);
        System.out.println(p1.getNumLines());
        p1.printRhythm();

        Haiku h1 = new Haiku();
        System.out.println(h1.getNumLines());
        System.out.println(h1.getSyllables(2));
        h1.printRhythm();

        Limerick lim1 = new Limerick();
        System.out.println(lim1.getNumLines());
        System.out.println(lim1.getSyllables(2));
        System.out.println(lim1.getSyllables(4));
        lim1.printRhythm();

    }
}