public class Level1 {
    public static void main(String[] args) {
        String name = "Tom Cruise";
        int yearOfBorn = 1962;

        String[] movieTitles = {"American Made", "Mission Impossible", "The Mummy", "Jack Richer", "Edge of Tomorrow"};
        float[] rating = {3, 4.7f, 5, 4.5f, 5};

        System.out.println("\n\nName of the actor is : " + name + "\nYear of birth : " + yearOfBorn);
        int age = 2021 - yearOfBorn;
        System.out.println("Age of the actor : " + age);

        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println("index :" + i+ " -- " + movieTitles[i]+ "\nRating and comment: " + rating[i] + getRating(rating[i]));
        }


    }
    static String getRating(float rating){
        if(rating > 4.0) {
            return " excellent";
        }else
            return " Nice";

    }
}