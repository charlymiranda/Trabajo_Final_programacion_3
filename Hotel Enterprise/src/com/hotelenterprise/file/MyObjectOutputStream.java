package com.hotelenterprise.file;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {

    @Override
    protected void writeStreamHeader() throws IOException{
        // do nothing
        //reset();
    }

    public MyObjectOutputStream() throws IOException{
        super();
    }
    public MyObjectOutputStream(OutputStream out) throws IOException{
        super(out);
    }
}
