public class Singleton {
    private static Singleton instance;
    public String name;

    private Singleton(String name) {
        this.name = name;
        System.out.println("value = " + name);
    }

    public static Singleton getSingleton(String name) {
        if (instance == null) {
            instance = new Singleton(name);
        } else {
            System.out.println("El objeto ya tiene una instancia creada");
        }
        return instance;
    }
}
