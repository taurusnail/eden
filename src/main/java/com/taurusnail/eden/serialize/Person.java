package com.taurusnail.eden.serialize;

import java.io.*;

public class Person implements Cloneable, Serializable {

    private String name;

    private int age;

    private Email email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

    protected Person deepClone() throws IOException, ClassNotFoundException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {

            objectOutputStream.writeObject(this);

            try (ObjectInputStream objectInputStream = new ObjectInputStream(
                    new ByteArrayInputStream(byteArrayOutputStream.toByteArray()))) {
                return (Person) objectInputStream.readObject();
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email=" + email +
                '}';
    }
}
