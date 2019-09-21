package com.oelprince.webservice;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LambdaRequestStreamHandler
        implements RequestStreamHandler {
    public void handleRequest(InputStream inputStream,
                              OutputStream outputStream, Context context) throws IOException {

        outputStream.write(("Hello World").getBytes());
    }
}
