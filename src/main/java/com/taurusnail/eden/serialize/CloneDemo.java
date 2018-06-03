package com.taurusnail.eden.serialize;

import java.io.IOException;

public class CloneDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.setName("person");
        person.setAge(4);

        Email email = new Email();
        email.setContent("这是一封发给person的邮件");
        person.setEmail(email);

//        Person person1 = person.clone();
        Person person1 = person.deepClone();
        person1.setName("person1");
        person1.getEmail().setContent("这是一封发给person1的邮件");

        System.out.println(person.toString());
        System.out.println(person1.toString());
    }

}
