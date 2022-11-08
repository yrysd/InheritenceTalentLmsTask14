public class Hobby extends Person {

    private String hobby;

    public Hobby(String name,int age,int growth,String hobby) {
        super(name,age,growth);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+"\n"+
                "Age:"+getAge()+"\n"+
                "Growth: "+getGrowth()+"\n"+
                "Hobby: "+hobby;
    }
}
