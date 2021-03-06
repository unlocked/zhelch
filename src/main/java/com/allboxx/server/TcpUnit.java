package com.allboxx.server;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

/**
 * User: mtolstykh
 * Date: 8/28/13
 * Time: 11:23 PM
 */
public class TcpUnit extends Thread {

    public static final int CAPACITY = 3;    
    private List<Thread> threads;
    private Thread t;
    private ServerSocket socket;
    private volatile boolean shutdown = false;
    private String channelName;

    public List<Thread> getThreads() {
        return threads;
    }

    @Override
    public synchronized void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

    public TcpUnit(ServerSocket socket, String channelName) {
        this.socket = socket;
        this.channelName = channelName;
        threads = new ArrayList<Thread>(CAPACITY);
    }

    public void shutdown(){
        this.shutdown = true;
    }

    @Override
    public void run() {
//        try {
//            while (!shutdown) {
////                Socket clientSocket = socket.accept();
////                Channel channel = new Channel(clientSocket);
////                channel.setName(channelName);
////                Thread item = new Thread(channel);
////                item.start();
////                threads.add(item);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
