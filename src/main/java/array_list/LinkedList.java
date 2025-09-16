package array_list;

/**
 * <p>
 * 功能描述: 链表的实现类
 * </p>
 *
 * @author Hanxuewei
 * @since 2025/9/16
 */
public class LinkedList<E> implements List<E>{
    // transient：Java关键字，表示该字段不参与序列化过程
    transient int size = 0;
    // 指向链表的第一个节点（头节点）
    transient Node<E> first;
    // 指向链表的最后一个节点（尾节点）
    transient Node<E> last;
    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean addFirst(Object o) {
        return false;
    }

    @Override
    public boolean addLast(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void printLinkList() {

    }

    /**
     * java中泛型的类型参数命名规范和含义
     * ? 标识不确定的java类型
     * T(type) 表示一个具体的java类型
     * K V (key value) 分别表示java中的ley， value
     * E(element) 表示Element
     * @param <E>
     */
    private static class Node<E>{
        // 数据
        E item;
        // 后一个结点的引用
        Node<E> next;
        // 前一个结点的引用
        Node<E> prev;

        public Node(E item, Node<E> next, Node<E> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

}
