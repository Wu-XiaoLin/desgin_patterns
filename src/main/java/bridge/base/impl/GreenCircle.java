package bridge.base.impl;

import bridge.base.DrawAPI;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw a green circle");
    }
}
