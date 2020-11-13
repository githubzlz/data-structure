package linklist.single;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-11-12 16:54
 * @description
 */
public class TestClass {

    public static void main(String[] args) {
        MyLink<String> link = new MyLintList<>();

        link.put(0,"1");
        link.put(1,"2");
        link.put(1,"3");
        System.out.println("-------------put，length，remove-------------");
        System.out.println("link：" + link);
        System.out.println("length：" + link.length());
        System.out.println("移除1：" + link.remove("1"));
        System.out.println("移除1：" + link.remove("1"));
        System.out.println("link：" + link);
        System.out.println("length：" + link.length());
        System.out.println("--------------get---------------");
        link.put("1");
        System.out.println("link：" + link);
        System.out.println("下标0->value：" + link.get(0));
        System.out.println("下标1->value：" + link.get(1));
        System.out.println(link.remove("2"));
        System.out.println("link：" + link);
        System.out.println("下标0->value：" + link.get(0));
        System.out.println("下标1->value：" + link.get(1));

        System.out.println("--------------containsValue---------------");
        System.out.println("link：" + link);
        System.out.println("包含3：" + link.containsValue("3"));
        System.out.println("移除3：" + link.remove("3"));
        System.out.println("包含3：" + link.containsValue("3"));
        System.out.println("移除2：" + link.remove("1"));
        System.out.println("link：" + link);
        System.out.println("空链表：" + link.isEmpty());
    }
}
