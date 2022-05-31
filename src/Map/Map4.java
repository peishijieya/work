package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
    需求：创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String,值是ArrayList,
        每一个ArrayList的元素是String,.并遍历
        思路：
        1:创建HashMap集合
        2:创建ArrayList集合，并添加元素
        3:把ArrayList作为元素添加到HashMap?集合
        4:遍历HashMap集合
        给出如下的数据：
        第一个ArrayList集合的元素：（三国演义）
        诸葛亮  赵云
        第二个4 rrayList集合的元素：（西游记）
        唐僧  孙悟空
        第三个ArrayList集合的元素：（水浒传）
        武松 鲁智深
*/
public class Map4 {
    public static void main(String[] args) {
//       创建Hashmap集合
        HashMap<String, ArrayList<String>> hm= new HashMap<>();
//        创建ArrayList集合，并添加元素
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");
//        把AaaryList作为元素添加到Hashmap
        hm.put("三国演义",sgyy);
        ArrayList<String> sg  = new ArrayList<String>();
        sg .add("唐僧");
        sg .add("孙悟空");
//        把AaaryList作为元素添加到Hashmap
        hm.put("西游记",sg );
        ArrayList<String>  yy = new ArrayList<String>();
         yy.add("武松");
         yy.add("鲁智深");
//        把AaaryList作为元素添加到Hashmap
        hm.put("水浒传", (yy));
//水浒传
        Set<String> keySet = hm.keySet();
        for (String key:keySet){
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s:value){
                System.out.println("\t"+s);
            }
        }


    }
}
