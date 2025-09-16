package array_list;

/**
 * <p>
 * 功能描述: 链表接口
 * </p>
 *
 * @author Hanxuewei
 * @since 2025/9/16
 */
// 定义一个泛型接口
public interface List<E>{
    // 添加元素到链表，返回是否成功
    boolean add(E e);

    // 将元素添加到列表的开头
    boolean addFirst(E e);

    // 将元素添加到列表的末尾
    boolean addLast(E e);

    // 从链表中删除指定元素
    boolean remove(Object o);

    // 获取指定位置的索引
    E get(int index);

    // 打印链表的内容
    void printLinkList();
}
