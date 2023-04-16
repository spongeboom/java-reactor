package com.sample.dispatcher;

import java.net.ServerSocket;

public interface Dispatcher {
    public void dispatch(ServerSocket socket, HandleMap handlers);
}
