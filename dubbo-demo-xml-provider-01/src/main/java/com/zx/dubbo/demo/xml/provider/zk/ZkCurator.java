package com.zx.dubbo.demo.xml.provider.zk;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.api.BackgroundCallback;
import org.apache.curator.framework.api.CuratorEvent;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.retry.RetryForever;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 操作zk的api
 *
 * @author zhaoxu
 * @className ZkCurator
 * @projectName ConcentrationDubbo
 * @date 2020/5/27 12:40
 */
public class ZkCurator {

    /**
     * zookeeper地址
     */
    static final String CONNECT_ADDR = "localhost:2181";
    /**
     * session超时时间
     */
    static final int SESSION_OUTTIME = 5000;//ms

    public static void main(String[] args) throws Exception {

        //1.声明重试策略：重试间隔1s 重试10次
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 10);


        //2.工厂模式创建a new builder that builds a CuratorFramework
        //最终返回一个 CuratorFramework(Zookeeper framework-style client)
        CuratorFramework curator = CuratorFrameworkFactory.builder()
                .connectString(CONNECT_ADDR)
                .sessionTimeoutMs(SESSION_OUTTIME)
                .retryPolicy(retryPolicy)
                .namespace("zhaoxu1943")
                .build();
        //3 开启连接
        curator.start();

        //4.查看zk状态
        System.out.println(ZooKeeper.States.CONNECTED);
        System.out.println(curator.getState());

        // 添加zk node和删除

        //4 建立节点 创建parent if needed,如果已经有了就不再创建父节点
        // 指定节点类型（不加withMode默认为持久类型节点,这样也是创建持久节点）、路径、数据内容
    //    curator.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/zhaoxu1943/xiaosi", "my birthday is 2088".getBytes());


        //5 删除节点
        //Will also delete children if they exist.
     //   curator.delete().guaranteed().deletingChildrenIfNeeded().forPath("/zhaoxu1943");
//
//
//        //6 读取、修改
//
//
//
        //读取节点
        String zNode_1 = new String(curator.getData().forPath("/zhaoxu1943/xiaosi"));
        System.out.println(zNode_1);

        //修改节点
        curator.setData().forPath("/zhaoxu1943/xiaosi", "after some time be better".getBytes());
        String zNode_modified = new String(curator.getData().forPath("/zhaoxu1943/xiaosi"));
        System.out.println(zNode_modified);
//

        // 绑定回调函数


        //回忆newCachedThreadPool,core pool size 为0,无限的max pool size
        //队列不缓存任务
        ExecutorService pool = Executors.newCachedThreadPool();

        //使用curator
        //callback a functor that will get called when the operation has completed,
        //后台执行,并执行完毕后调用回调函数,具体执行的工作交给一个线程池

        curator.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT)
                .inBackground((curatorFramework, curatorEvent) -> {
                    System.out.println("code:" + curatorEvent.getResultCode());
                    System.out.println("type:" + curatorEvent.getType());
                    System.out.println("线程为:" + Thread.currentThread().getName());
                }, pool)
                .forPath("/zhaoxu1943/background", "test curator background".getBytes());
        //无线sleep
        //Thread.sleep(Integer.MAX_VALUE);


        // 读取子节点getChildren方法 和 判断节点是否存在checkExists方法

        List<String> list = curator.getChildren().forPath("/zhaoxu1943");
        for (String p : list) {
            System.out.println(p);
        }

        Stat stat = curator.checkExists().forPath("/zhaoxu1943/xiaosi");
        System.out.println(stat);

        Thread.sleep(2000);
        curator.delete().guaranteed().deletingChildrenIfNeeded().forPath("/zhaoxu1943");



    }


}
