public class Human {
    public static final Boolean mammal = true;

    private String name;
    private Integer age;

    public Human(String name,Integer age){
        this.name = name;
        this.age = age;
    }
    public void rename(String newName){
        if(newName.length() <= 4){
            this.name = newName;
        }else{
            System.out.println("You cannot use more than 4 chars!");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void makeNoise(String str) {
        System.out.println(str);
    }
    public static void walk(Human n){
        System.out.println(n.name +" has walked.");
    }

    public static void main(String[] args) {
        Human kamen = new Human("Kamen",29);
        Human peter = new Human("Peter",34);
        Human.walk(peter);
        Human.walk(kamen);
        kamen.rename("Kam");
        System.out.println(kamen);
        JustOneObject trrr = JustOneObject.getInstance(0);
        trrr.name = "Kamen";
        JustOneObject sdaa = JustOneObject.getInstance(1);
        sdaa.name = "Simeon";
        JustOneObject aaaa = JustOneObject.getInstance(-3);
        aaaa.name = "aaaa";
        JustOneObject rrrr = JustOneObject.getInstance(3);
        rrrr.name = "rrrr";
        System.out.println(trrr.name);
        System.out.println(sdaa.name);
        System.out.println(aaaa.name);
        System.out.println(rrrr.name);

    }
}
