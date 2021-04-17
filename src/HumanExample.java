public class HumanExample {

    private final String name;
    private final Integer height;
    private Double weight;
    private Boolean isOverWeight;

    HumanExample(String name, Integer height, Double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.calculateOverweight();
    }
    //private helper function
    private void calculateOverweight(){
        this.isOverWeight = this.height - 100 > this.weight;
    }

    public String eat(Food food) {
        String eatStatus = this + " has eaten " + food + " and reached weight " + (this.weight + food.fat);
        this.weight = this.weight + food.fat;
        this.calculateOverweight();
        return eatStatus;
    }

    public void burnFat(Double fat) {
        this.weight = this.weight - fat;
        this.calculateOverweight();
    }

    @Override
    public String toString() {
        String isOver = "";
        if (!this.isOverWeight) {
            isOver = " not";
        }
        return this.name + ", height " + this.height + ", weight " + this.weight + " and is" + isOver + " overweight";
    }

    public static Food getBurger() {
        return new Food("burger", 4.0);
    }

    public static Food getSalat() {
        return new Food("salat", 0.1);
    }

    public static void main(String[] arg) {
        HumanExample kamen = new HumanExample("kamen", 190, 86.4);
        System.out.println(
                kamen.eat(
                        HumanExample.getBurger()
                )
        );
        kamen.burnFat(20.0);
        System.out.println(
                kamen.eat(
                        HumanExample.getSalat()
                )
        );
    }

    public static class Food {
        public String name;
        public Double fat;

        public Food(String name, Double fat) {
            this.name = name;
            this.fat = fat;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

}