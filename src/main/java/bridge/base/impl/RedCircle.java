package bridge.base.impl;

import bridge.base.DrawAPI;

public class RedCircle implements DrawAPI {


    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw a red circle");
    }
}
