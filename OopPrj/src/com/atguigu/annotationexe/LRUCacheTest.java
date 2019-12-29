package com.atguigu.annotationexe;

/**
 * Created by liuzhao on 14-5-15.
 */
public class LRUCacheTest  {

    public static void main(String[] args) throws Exception {
        System.out.println("start...");

        lruCache2();
     
        System.out.println("over...");
    }
 


static   <T> void lruCache2() {
        System.out.println();
        System.out.println("===========================LRU LinkedHashMap(inheritance)й╣ож===========================");
        LRUCache2<Integer, String> lru = new LRUCache2(5);
        lru.put(1, "11");
        lru.put(2, "11");
        lru.put(3, "11");
        lru.put(4, "11");
        lru.put(5, "11");
        System.out.println(lru.toString());
        lru.put(6, "66");
        lru.get(2);
        lru.put(7, "77");
        lru.get(4);
        System.out.println(lru.toString());
        System.out.println();
    }

  

}
