package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {
//    创建集合对象
    public static void main(String[] args) {
//       添加元素
        HashMap<String, String> map = new HashMap<>();
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","龙儿");
// 获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
//        遍历所有键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, String> me : entrySet){
//            根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }
    }
}
