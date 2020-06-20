package com.zx.dubbo.spi.service;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author zhaoxu
 * @className PrintService
 * @projectName ConcentrationDubbo
 * @date 2020/6/20 14:00
 */
@SPI("impl")
public interface PrintService {
    void print();

}
