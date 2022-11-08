public class Profession extends Person {

    private String profession;

    public Profession(String name,int age,int growth,String profession) {
        super(name,age,growth);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+"\n"+
                "Age: "+getAge()+"\n"+
                "Growth: "+getGrowth()+"\n"+
                "Profession: "+profession;
    }
}
