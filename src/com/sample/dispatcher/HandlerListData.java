package com.sample.dispatcher;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class HandlerListData {

    @ElementList(entry = "handler", inline = true)
    private List<HandlerData> handler;

    @Attribute(required = false)
    private String name;

    public List<HandlerData> getHandler() {
        return handler;
    }

    public String getName() {
        return name;
    }
}
