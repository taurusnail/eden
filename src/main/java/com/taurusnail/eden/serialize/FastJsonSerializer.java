package com.taurusnail.eden.serialize;

import com.alibaba.fastjson.JSON;

public class FastJsonSerializer implements MySerializer {

    @Override
    public <T> byte[] serialize(T obj) {
        return JSON.toJSONBytes(obj);
    }

    @Override
    public <T> T deSerialize(byte[] data, Class<T> clazz) {
        return JSON.parseObject(data, clazz);
    }
}
