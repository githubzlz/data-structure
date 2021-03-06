package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-11-11 17:44
 * @description
 */
public class TestClass {

    public static void main(String[] args) {

        MyMap<String, String> map = new MyHashMap<>(10);

        map.put("zlz","zlz");
        map.put("zlz","zlz-zlz");
        map.put("zlz1","zlz1");
        map.put("zlz2","zlz2");
        map.put("zlz3","zlz3");
        map.put("zlz4","zlz4");

        System.out.println("-----------remove-test-------------");
        System.out.println("Key-zlz4存在：" + map.containsKey("zlz4"));
        map.remove("zlz4");
        System.out.println("Key-zlz4存在：" + map.containsKey("zlz4"));
        System.out.println("-----------containsValue-test-----------");

        System.out.println("Value-zlz存在：" + map.containsValue("zlz"));
        System.out.println("Value-zlz-zlz存在：" + map.containsValue("zlz-zlz"));
    }
}
