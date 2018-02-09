package service;

/**
 * Created by likun on 2018/2/5 0005.
 */
public class ServiceTest {
    public String sayHello(String data){
        System.out.println("------------"+data);
        return "------service--------"+data;
    }
}
