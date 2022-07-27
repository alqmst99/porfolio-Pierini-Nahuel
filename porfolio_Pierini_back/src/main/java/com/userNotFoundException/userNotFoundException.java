package com.userNotFoundException;

public class userNotFoundException extends RuntimeException {
    public userNotFoundException( String messege){
        super(messege);
    }
}
