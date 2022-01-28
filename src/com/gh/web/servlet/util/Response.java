package com.gh.web.servlet.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.OutputStream;

public class Response {

    private static ObjectMapper om = new ObjectMapper();

    public static void toJSON( OutputStream os,Object obj){
        try {
            om.writeValue(os,obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
