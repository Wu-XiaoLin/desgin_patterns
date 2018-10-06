package template.client;

import template.base.Cricket;
import template.base.Football;
import template.base.Game;

/**
 * 模板方法模式
 * 使用场景：1、有多个子类共有的方法，且逻辑相同。
 *          2、重要的复杂的方法可以考虑作为模板。
 * 注意事项：为防止恶意操作，一般模板方法都加上final方法
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
