package linklist.single;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-11-12 14:59
 * @description 单向链表
 */
public class MyLintList<T> implements MyLink<T>{

    /**
     * 链表头节点
     */
    private Node<T> head;

    @Override
    public boolean put(T t) {
        Node<T> node = new Node<>(t);
        // 首次添加元素
        if(head == null){
            head = node;
        } else if (head.next == null){
            head.next = node;
        }
        else {
            Node<T> lastNode = head.next;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
        return true;
    }

    @Override
    public boolean put(int index, T t) {
        //从
        if(index != 0 && head == null){
            return false;
        }
        Node<T> cur = new Node<>(t);
        Node<T> node = head;
        if(index == 0){
            cur.next = head;
            head = cur;
        }

        Node<T> pre = head;
        for (int i = 0; i < index; i++) {
            //下标过大时直接返回插入失败，不进行插入操作
            if(node == null){
                return false;
            }
            pre = node;
            node = node.next;
        }
        //将cur插入per和node的中间
        pre.next = cur;
        cur.next = node;
        return true;
    }

    @Override
    public boolean remove(T t) {
        Node<T> current = this.head;
        // 链表为空
        if(current == null){
            return false;
        }

        //首元素匹配成功


        // 不是首元素
        // 遍历链表获取此元素，此元素的上级和下级元素，从首元素开始
        Node<T> pre = null;
        while (current != null){
            if (current.t.equals(t)){
                if(pre == null){
                    head = current.next;
                }else {
                    pre.next = current.next;
                }
                return true;
            }
            pre = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public int length() {
        int length = 0;
        Node<T> node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    @Override
    public T get(int index){
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            if(node == null){
                return null;
            }
            node = node.next;
        }
        if(node == null){
            return null;
        }else {
            return node.t;
        }
    }

    @Override
    public boolean containsValue(T t) {
        Node<T> node = head;
        while (node != null) {
            if(node.t.equals(t)){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[ ");
        Node<T> node = head;
        while (node != null) {
            sb.append(node.t).append("，");
            node = node.next;
        }
        sb.replace(sb.length()-1, sb.length(), "");
        sb.append(" ]");
        return sb.toString();
    }
}
