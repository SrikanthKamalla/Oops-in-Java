public class ClassAndObjects {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Srinivas");
        System.out.println(s1.getId() + " " + s1.getName());
        s1.eat();
        s1.code();
        s1.sleep();

        Student s2 = new Student(2, "Srikanth");
        System.out.println(s2.getId() + " " + s2.getName());
        s2.eat();
        s2.code();
        s2.sleep();

    }
}

class Student {
    final private int id;
    final private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " will eat");
    }

    public void code() {
        System.out.println(name + " will code");
    }

    public void sleep() {
        System.out.println(name + " will sleep");
    }

}