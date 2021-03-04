package ClassPackage;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*  //单集合的方法汇总
boolean add(E e)
确保此集合包含指定的元素（可选操作）。
boolean addAll(Collection<? extends E> c)
将指定集合中的所有元素添加到此集合（可选操作）。
void clear()
从此集合中删除所有元素（可选操作）。
boolean contains(Object o)
如果此集合包含指定的元素，则返回 true 。
boolean containsAll(Collection<?> c)
如果此集合包含指定 集合中的所有元素，则返回true。
boolean equals(Object o)
将指定的对象与此集合进行比较以获得相等性。
int hashCode()
返回此集合的哈希码值。
boolean isEmpty()
如果此集合不包含元素，则返回 true 。
Iterator<E> iterator()
返回此集合中的元素的迭代器。
default Stream<E> parallelStream()
返回可能并行的 Stream与此集合作为其来源。
boolean remove(Object o)
从该集合中删除指定元素的单个实例（如果存在）（可选操作）。
boolean removeAll(Collection<?> c)
删除指定集合中包含的所有此集合的元素（可选操作）。
default boolean removeIf(Predicate<? super E> filter)
删除满足给定谓词的此集合的所有元素。
boolean retainAll(Collection<?> c)
仅保留此集合中包含在指定集合中的元素（可选操作）。
int size()
返回此集合中的元素数。
default Spliterator<E> spliterator()
创建一个Spliterator在这个集合中的元素。
default Stream<E> stream()
返回以此集合作为源的顺序 Stream 。
Object[] toArray()
返回一个包含此集合中所有元素的数组。
<T> T[] toArray(T[] a)
返回包含此集合中所有元素的数组; 返回的数组的运行时类型是指定数组的运行时类型。

 */
public class collection {
    public static void main(String[] args) {
        {
            Collection list = new ArrayList();
        }
        Collection list = new ArrayList();
        System.out.println(list);
        list.add("圆");
        System.out.println(list);
        list.add(1);
        list.add(true);
        System.out.println(list);
        list.toArray();
        Iterator it = list.iterator();    //迭代器使用
        while(it.hasNext()){           //判断迭代器有没有下一个元素
            System.out.println(it.next());   //next()方法取出下一个元素；
        }
        list.remove(1);
    }
}
