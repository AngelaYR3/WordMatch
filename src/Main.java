public class Main {
    public static void main(String[] args) {
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));

        WordMatch h = new WordMatch("aaaabb");
        System.out.println(h.scoreGuess("a"));
        System.out.println(h.scoreGuess("aa"));
        System.out.println(h.scoreGuess("aaa"));
        System.out.println(h.scoreGuess("aabb"));
        System.out.println(h.scoreGuess("c"));

        WordMatch game = new WordMatch("concatenation");
        System.out.println(game.scoreGuess("ten"));
        System.out.println(game.scoreGuess("nation"));
        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.scoreGuess("con"));
        System.out.println(game.scoreGuess("cat"));
        System.out.println(game.findBetterGuess("con", "cat"));
    }
}
