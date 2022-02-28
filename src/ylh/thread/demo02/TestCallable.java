package ylh.thread.demo02;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 15:36
 */
public class TestCallable implements Callable<Boolean> {

    private String url; //网络图片地址
    private String name; //保存的文件名

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为：" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable thread1 = new TestCallable("https://img-blog.csdnimg.cn/20210427081055529.png?x-oss-process=" + "image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10," + "text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZsbG93X3dpbmQ=,size_16,color_FFFFFF,t_70", "1.jpg");
        TestCallable thread2 = new TestCallable("https://img-blog.csdnimg.cn/20210427081055529.png?x-oss-process=" + "image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10," + "text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZsbG93X3dpbmQ=,size_16,color_FFFFFF,t_70", "2.jpg");
        TestCallable thread3 = new TestCallable("https://img-blog.csdnimg.cn/20210427081055529.png?x-oss-process=" + "image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10," + "text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZsbG93X3dpbmQ=,size_16,color_FFFFFF,t_70", "3.jpg");

        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> r1 = ser.submit(thread1);
        Future<Boolean> r2= ser.submit(thread2);
        Future<Boolean> r3 = ser.submit(thread3);

        //获取结果
        boolean res1 = r1.get();
        boolean res2 = r2.get();
        boolean res3 = r3.get();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        //关闭服务
        ser.shutdownNow();
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
/*
Callable接口
    实现Callable接口，需要返回值类型
    重写call方法，需要抛出异常
    创建目标对象
    创建执行服务：ExecutorService ser = Executors.newFixedThreadPool(1);
    提交执行：Future result1 = ser.submit(11);
    获取结果：boolean r1 = result1.get()
    关闭服务：ser.shutdownNow();
 */
/*
方式三：实现Callable接口
    可以返回值
    可以抛出异常
 */