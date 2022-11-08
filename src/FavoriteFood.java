public class FavoriteFood extends Person {


    private String favoriteFood;

    public FavoriteFood(String name,int age,int growth,String favoriteFood) {
        super(name, age, growth);
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
        public String toString() {
            return "Name: "+getName()+"\n"+
                    "Age: "+getAge()+"\n"+
                    "Growth: "+getGrowth()+"\n"+
                    ": "+favoriteFood;

    }

}
