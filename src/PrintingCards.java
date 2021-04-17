public class PrintingCards {
    public static void main(String[] args) {
        String doc = "Kamen's number: 08050505\n"+
                "Dido can be found at 08050504\n"+
                "so as Vasko 08050503\n";
        String replacedDoc = doc.replaceAll("(08)[0-9]{6}","$1******");
        System.out.println(replacedDoc);
    }
}
