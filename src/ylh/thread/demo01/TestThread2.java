package ylh.thread.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 15:02
 */
/*
练习Thread，实现多线程同步下载图片
 */
public class TestThread2 extends Thread {

    private String url; //网络图片地址
    private String name; //保存的文件名

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;

    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为：" + name);
    }

    public static void main(String[] args) {
        TestThread2 thread1 = new TestThread2("https://img-blog.csdnimg.cn/20210427081055529.png?x-oss-process=" + "image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10," + "text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZsbG93X3dpbmQ=,size_16,color_FFFFFF,t_70", "1.jpg");
        TestThread2 thread2 = new TestThread2("https://img-blog.csdnimg.cn/20210427081055529.png?x-oss-process=" + "image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10," + "text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZsbG93X3dpbmQ=,size_16,color_FFFFFF,t_70", "2.jpg");
        TestThread2 thread3 = new TestThread2("https://img-blog.csdnimg.cn/20210427081055529.png?x-oss-process=" + "image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10," + "text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZsbG93X3dpbmQ=,size_16,color_FFFFFF,t_70", "3.jpg");

        thread1.start();
        thread2.start();
        thread3.start();
        /*
        结果并没有按顺序执行，且每次运行结果不一样
         */
    }
}


//下载器
class WebDownloader {
    //下载方法
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}
