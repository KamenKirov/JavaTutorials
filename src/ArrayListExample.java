import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class ArrayListExample {
    public static String test = new String("Helllloooooo");

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(5);
        list.add(3.14159);
        list.add(new Date());
        list.add("Kamen");
        list.add(new ObjectToString());
        ArrayListExample.test.toUpperCase(Locale.ROOT);

        for (int i = 0; i < list.size(); i++) {
            Object value = list.get(i);
            System.out.printf("Index = %d; Value = %s\n", i, value);
            System.out.println(value.getClass());

        }
        Human ivailo = new Human("Ivailo",23);

    }
}
