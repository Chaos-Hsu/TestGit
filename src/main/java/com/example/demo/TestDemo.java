package com.example.demo;

/**
 * @author: xqc
 * @date: 2019/4/2
 * @description:
 */
public class TestDemo {


    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }


}
