package com.liu.thrift.impl;


import com.liu.thrift.Test01;
import org.apache.thrift.TException;

public class Test01Impl implements Test01.Iface {

    @Override
    public String hello() throws TException {
        return "hello world";
    }
}
