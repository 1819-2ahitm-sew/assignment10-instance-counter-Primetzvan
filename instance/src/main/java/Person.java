public class Person {

    private String vorname;
    private String nachname;
    private static int instance = 0;

    public static void main(String[] args) {
        new Person("Vanessa", "Primetzhofer");
        new Person("Sarah", "Feichtinger");
        new Person("Daniela", "Plöchl");
        new Person("Emely", "Steiner");

        System.out.printf("Es sind %s Personen erstellt worden.",getInstance());
    }

    public Person() {
    }

    public Person(String vorname, String nachname) {
        instance = getInstance() + 1;
    }

    public static int getInstance() {
        return instance;
    }
}