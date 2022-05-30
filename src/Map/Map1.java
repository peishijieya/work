package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
//        V get(object key) : 根据键获取值
        //System.out.println(map.get("张无忌"));
//        Set<k> keyset():获取所有键的集合
       /* Set<String> keyset=map.keySet();
          for (String key :keyset){
            System.out.println(key);
            }
       */
//      collection<V> values():获取所有值的集合
        Collection<String> values=map.values();
        for (String value :values){
            System.out.println(value);
        }
    }
}
