package dev.mark;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person mark = new Person(71.0f, 1.88f);
        IMC markImc = new IMC(mark);
        markImc.setPersonState();
    }
}
