package com.msb.test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class test {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        //套接字,指定服务器的ip和端口号
        Socket s=new Socket ("10.38.25.160",8888);
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeUTF("你好，服务器我是客户端");
        dos.close();
        s.close();
        s.close();
    }
}
