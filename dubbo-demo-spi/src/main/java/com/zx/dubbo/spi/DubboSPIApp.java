package com.zx.dubbo.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.zx.dubbo.spi.service.PrintService;

/**
 * @author zhaoxu
 * @className DubboSPIApp
 * @projectName ConcentrationDubbo
 * @date 2020/6/20 14:03
 */
public class DubboSPIApp {
    public static void main(String[] args) {
        PrintService printService = ExtensionLoader.getExtensionLoader(PrintService.class).getDefaultExtension();
        printService.print();
    }
}
