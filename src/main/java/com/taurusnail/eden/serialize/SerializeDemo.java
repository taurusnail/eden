package com.taurusnail.eden.serialize;


public class SerializeDemo {

    public static void main(String[] args) {
        MySerializer serializer = new NativeJavaSerializer();
//        MySerializer serializer = new XmlSerializer();
//        MySerializer serializer = new FastJsonSerializer();

        User user = new User();
        user.setName("张三");
        user.setAge(3);
        user.setCity("上海");

        byte[] userData = serializer.serialize(user);

        System.out.println("序列化结果："+new String(userData));

        User user1 = serializer.deSerialize(userData, User.class);

        System.out.println("反序列化结果："+user1.toString());
    }
}
