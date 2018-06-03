package com.taurusnail.eden.serialize;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class XmlSerializer implements MySerializer {

    XStream xStream = new XStream(new DomDriver());

    @Override
    public <T> byte[] serialize(T obj) {
        return xStream.toXML(obj).getBytes();
    }

    @Override
    public <T> T deSerialize(byte[] data, Class<T> clazz) {
        return (T) xStream.fromXML(new String(data));
    }

}
