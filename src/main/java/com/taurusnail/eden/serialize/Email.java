package com.taurusnail.eden.serialize;

import java.io.Serializable;

public class Email implements Serializable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Email{" +
                "content='" + content + '\'' +
                '}';
    }
}
