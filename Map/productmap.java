import java.util.*;
class ProductEx{
    public static void main(String[] args) {
        HashMap<String,String> product=new HashMap<String,String>();
        product.put("p_id","101");
        product.put("p_name", "IPhone");
        product.put("price", "65000");
        product.put("color", "navy blue");
        product.put("avail", "true");
        System.out.println(product);
        System.out.println(product.keySet());
        System.out.println(product.values());
        Set<String> keys=product.keySet();
        for(String key:keys){
            System.out.println(key+ ":" +product.get(key));

        }
        Collection<String> values=product.values();
        for(String value:values){
            System.out.println(value);
        }

    }
}