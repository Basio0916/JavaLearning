package com.mishibashi;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumartion implements Enumeration<Object>{
    Iterator<?> iterator;

    public IteratorEnumartion(Iterator<?> iterator){
        this.iterator = iterator;
    }    
    
    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
    
}
