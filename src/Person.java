public class Person {

    private String name;
    private int age;
    private int growth;


    public Person(String name, int age, int growth) {
        this.name = name;
        this.age = age;
        this.growth = growth;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }


}
