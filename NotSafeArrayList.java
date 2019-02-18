package com.example.demo.ExampleArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NotSafeArrayList {
    public static void main(String[] args) {
        //ArrayList是不安全的线程，举例，报错java.util.concurrentModificationException
        List<String> list = new ArrayList<String>();

      for (int i = 0; i <=30; i++) {
          new Thread(()->{
               list.add(UUID.randomUUID().toString().substring(0,4));
              System.out.println(list);
          },String.valueOf(i)).start();
      }
    }
}
