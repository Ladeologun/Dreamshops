package com.projects.dreamshops.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message){
        super(message);
    }

}
