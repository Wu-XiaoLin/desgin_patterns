package template.client;

import template.base.Cricket;
import template.base.Football;
import template.base.Game;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
