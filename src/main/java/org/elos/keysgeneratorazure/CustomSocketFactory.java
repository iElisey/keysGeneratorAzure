package org.elos.keysgeneratorazure;

import javax.net.SocketFactory;
import java.io.IOException;
import java.net.Socket;

public class CustomSocketFactory extends SocketFactory {
    private final Socket socket;

    public CustomSocketFactory(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Socket createSocket() throws IOException {
        return socket;
    }

    @Override
    public Socket createSocket(String host, int port) throws IOException {
        return socket;
    }

    @Override
    public Socket createSocket(String host, int port, java.net.InetAddress localAddress, int localPort) throws IOException {
        return socket;
    }

    @Override
    public Socket createSocket(java.net.InetAddress host, int port) throws IOException {
        return socket;
    }

    @Override
    public Socket createSocket(java.net.InetAddress address, int port, java.net.InetAddress localAddress, int localPort) throws IOException {
        return socket;
    }
}