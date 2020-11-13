package linklist.single;

/**
 * @author zlz
 * @version 1.0 CreateTime:2020-11-12 14:57
 * @description 单向链表
 */
public interface MyLink<T> {

    /**
     * 向链表中添加元素(向链表尾部添加)
     * @param t 待添加的元素
     * @return boolean
     */
    boolean put(T t);

    /**
     * 向指定位置插入
     * @param index 坐标
     * @param t value
     * @return boolean
     */
    boolean put(int index, T t);

    /**
     * 移除元素（移除距离头部较近的节点）
     * @param t 待移除的元素
     * @return 是否成功
     */
    boolean remove(T t);

    /**
     * 通过下标移除节点
     * @param index
     * @return
     */
    boolean remove(int index);

    /**
     * 链表长度
     * @return 链表长度
     */
    int length();

    /**
     * 通过坐标获取value
     * @param index 坐标
     * @return value
     */
    T get(int index);

    /**
     * 链表中是否包含要查询的值
     * @param t 要查询的值
     * @return boolean
     */
    boolean containsValue(T t);

    /**
     * 链表是否为空
     * @return boolean
     */
    boolean isEmpty();

    class Node<T>{

        /**
         * 要储存的对象
         */
        T t;

        /**
         * 下一个节点
         */
        Node<T> next;

        public Node(T t) {
            this.t = t;
        }

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

}
