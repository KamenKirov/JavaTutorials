/**
 * Singleton x duo
 */

public class JustOneObject {
    public String name;
    public static JustOneObject[] instance = new JustOneObject[2];
    private JustOneObject(){

    }
    public static JustOneObject getInstance(int num){
        if(instance.length<=num){
            num = instance.length-1;
        }
        if(num < 0){
            num = 0;
        }
        if(instance[num]==null){
            instance[num] = new JustOneObject();
        }return instance[num];
    }
    public static void main(String[] args) {
    }
}
