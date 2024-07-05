import java.util.*;
class EntryEx{
    public static void main(String[] args) {
        HashMap<String,String> product=new HashMap<String,String>();
        product.put("p_id","101");
        product.put("p_name", "IPhone");
        product.put("price", "65000");
        product.put("color", "navy blue");
        product.put("avail", "true");
        Set<Map.Entry<String,String>> entries=product.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+ ":" +entry.getValue());
            
        }
    }
}