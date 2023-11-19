package com.pixel.dp.factory;

public class AndroidPhone extends Phone{
    @Override
    protected void createPhone() {
        specifications.add(new AndroidCameraImpl());
    }
}
