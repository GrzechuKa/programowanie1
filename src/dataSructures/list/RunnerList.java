package dataSructures.list;

public class RunnerList {

    public static void main(String[] args) {
        List<String> listString = new List<>();

        listString.append("Grzesiek");
        listString.append("Kaczor");

        System.out.println(listString.search("Kaczor"));

        listString.insert("Monia", 0);
        listString.insert("Ksawery", 2);
        listString.insert("Grzesiek", 1000);

        listString.search("Kaczor").ifPresent(System.out::println);
    }



}
