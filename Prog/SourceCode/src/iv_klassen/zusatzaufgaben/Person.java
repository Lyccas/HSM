package iv_klassen.zusatzaufgaben;

public class Person {
    private String name;
    private int alter;

    public Person() {

    }

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public Person(String name) {
        this.name = name;
        alter = 18;
    }

    public String getPerson() {
        return "Name: " + name + ",\nAlter: " + alter;
    }

    public void nameAendern(String neuerName) {
        name = neuerName;
    }

    public void nameAendern() {
        name = "unbekannter Name";
    }

    public static void heiraten(Person person1, Person person2) {
        person1.name += "-" + person2.name;
        person2.name = person1.name;
    }
}
