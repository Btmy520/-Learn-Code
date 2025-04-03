package com.itheima.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo01 {
    public static void main(String[] args) {
//        public boolean add(E e)
//        添加
//        public void clear()
//        清空
//        public boolean remove(E e)
//        删除
//        public boolean contains(object obj)
//        判断是否包含
//        public boolean isEmpty()
//        判断是否为空
//        public int size()
//        集合长度
        //Collection是一个接口，我们不能直接创建他的对象。
        //所以，现在我们学习他的方法时，只能创建他实现类的对象。
        //实现类：ArrayList


        //1.添加元素
        //细节1：如果我们要往List系列集合中添加数据，那么方法永远返回true，因为List系列的是允许元素重复的。
        //细节2：如果我们要往Set系列集合中添加数据，如果当前要添加元素不存在，方法返回true，表示添加成功。
        //如果当前要添加的元素已经存在，方法返回false，表示添加失败。
        //因为Set系列的集合不允许重复。
        Collection col = new ArrayList();
        col.add("Hello");
        col.add("World");
        System.out.println(col);

        //2.清除List
        /*col.clear();
        System.out.println(col);*/

        //3.删除集合内元素
        //细节1：因为Collection里面定义的是共性的方法，所以此时不能通过索引进行删除。只能通过元素的对象进行删除。
        //细节2：方法会有一个布尔类型的返回值，删除成功返回true，删除失败返回false
        //如果要删除的元素不存在，就会删除失败。
        /*col.remove("Hello");
        System.out.println(col);*/

        //4.判断元素是否存在
        //细节：底层是依赖equals方法进行判断是否存在的。
        //所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，那么在javabean类中，一定要重写equals方法。
        boolean flag1 = col.contains("Hell");
        System.out.println(flag1);

        //5.判断是否为空
        boolean flag2 = col.isEmpty();
        System.out.println(flag2);

        //6.获取集合长度
        col.size();
        System.out.println(col.size());


    }
}
