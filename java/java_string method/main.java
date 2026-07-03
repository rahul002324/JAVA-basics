public class main {
    public static void main(String[] args) {
        String name = "JAVA";
        String name2 = "JaVA";
        String word = "rathinam";
        System.out.println("equal = " + name.equals(name2));
        System.out.println("igrnorecase = " +name.equalsIgnoreCase(name2));
        System.out.println("word = " + word.substring(0, 4));
        System.out.println("word = " + word.replace("a","o"));
        System.out.println("word = " + word.contains("ra"));
    }
}
