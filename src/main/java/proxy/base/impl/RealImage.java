package proxy.base.impl;

import proxy.base.Image;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("display -" + fileName);
    }

    public void loadFromDisk(String fileName){
        System.out.println("从硬盘上加载图片 = " + fileName);
    }
}
