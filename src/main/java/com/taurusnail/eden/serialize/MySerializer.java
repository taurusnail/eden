package com.taurusnail.eden.serialize;

public interface MySerializer {

    <T> byte[] serialize(T obj);

    <T> T deSerialize(byte[] data, Class<T> clazz);
}
