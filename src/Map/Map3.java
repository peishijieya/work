package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 需求：
        创建一个ArrayList?集合，存储三个元素，每一个元素都是HashMap,每一个HashMap的键和值都是String,并遍历
        思路：
        1:创建ArrayList集合
        2:创建HashMap?集合，并添加键值对元素
        3:把HashMap作为元素添加到ArrayList集合
        4:遍历ArrayList集合
        给出如下的数据：
        第的iop集合的元素。
        孙策大乔
        周瑜小乔
        第二个HashMap集合的元素：
        郭靖黄蓉
        杨过小龙女
        第三个Has hMap集合的元素：
        令狐冲 任盈盈
        林平之岳灵珊
 */
public class Map3 {
    public static void main(String[] args) {
        //仓创建ArrayList集合
        ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();
//创建HashMap集合，并添加键值对元素
        HashMap<String,String>hm1 = new HashMap< String,String > ();
        hm1.put("孙策" ,"大乔");
        hm1.put("周瑜" ,"小乔");
//把HashMap作为元素添加到ArrayList集合
       array.add(hm1);
//创建HashMap集合，并添加键值对元素
        HashMap<String,String> hm2 = new HashMap< String,String > ();
        hm2.put("孙策" ,"大乔");
        hm2.put("周瑜" ,"小乔");
//把HashMap作为元素添加到ArrayList集合
        array.add(hm2);
        //创建HashMap集合，并添加键值对元素
        HashMap<String,String> hm3 = new HashMap< String,String > ();
        hm3.put("孙策" ,"大乔");
        hm3.put("周瑜" ,"小乔");
//把HashMap作为元素添加到ArrayList集合
        array.add(hm3);

        for (HashMap<String,String> hm:array){
            Set<String> keySet = hm.keySet();

        for (String key:keySet){
            String value = hm.get(key);
            System.out.println(key+","+value);
             }
        }
    }
}
