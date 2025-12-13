package com.titancache.core;

public class CacheNode<K, V> {
    K key = null;
    V value = null;
    CacheNode next = null;
    CacheNode prev = null;
}
