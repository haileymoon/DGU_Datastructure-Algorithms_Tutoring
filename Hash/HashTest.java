package Hash;

public class HashTest {
    public static void main(String[] args) {
        HashTable h = new HashTable(3);
        h.put("sung", "sungho");
        h.put("jin", "myeongjin");
        h.put("hee", "heejin");
        h.put("min", "minyoung");
        //h.put("sung", "sungmin");
        System.out.println(h.get("sung"));
        System.out.println(h.get("jin"));
        System.out.println(h.get("hee"));
        System.out.println(h.get("min"));
        System.out.println(h.get("jae"));
    }
}
