package com.hx.test.leetcodeTopic;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description: 146. LRU缓存机制
 * @author: hux
 * @create: 2020-08-11 15:12
 **/
public class LRUCache_146 {
    public static class LRUCache {

        private class Node {
            int key, val;
            Node prev, next;

            Node(int key, int val, Node prev, Node next) {
                this.key = key;
                this.val = val;
                this.prev = prev;
                this.next = next;
            }
        }

        private Node head = new Node(-1, -1, null, null);
        private Map<Integer, Node> map = new HashMap<>();

        private void move2Head(Node cur) {
            if (cur == head) {
                head = head.prev;
                return;
            }
            // detach
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
            // attach
            cur.next = head.next;
            cur.next.prev = cur;
            head.next = cur;
            cur.prev = head;
        }

        public LRUCache(int capacity) {
            Node cur = head;
            for (int i = 0; i < capacity-1; ++i) {
                cur.next = new Node(-1, -1, cur, null);
                cur = cur.next;
            }
            cur.next = head;
            head.prev = cur;
        }

        public int get(int key) {
            if (!map.containsKey(key)) return -1;
            Node cur = map.get(key);
            move2Head(cur);
            return cur.val;
        }


        public void put(int key, int value) {
            if (map.containsKey(key)) {
                Node cur = map.get(key);
                cur.val = value;
                move2Head(cur);
            } else {
                if (head.val != -1) map.remove(head.key);
                head.key = key;
                head.val = value;
                map.put(key, head);
                head = head.prev;
            }
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得关键字 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4

        System.out.println("ok ");

    }
}
