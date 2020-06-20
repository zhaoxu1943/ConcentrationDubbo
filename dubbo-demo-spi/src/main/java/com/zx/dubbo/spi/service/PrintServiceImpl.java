package com.zx.dubbo.spi.service;

/**
 * @author zhaoxu
 * @className PrintServiceImpl
 * @projectName ConcentrationDubbo
 * @date 2020/6/20 14:02
 */
public class PrintServiceImpl implements PrintService {

    @Override
    public void print() {
        System.out.println("hello dubbo Spi");
    }
}
