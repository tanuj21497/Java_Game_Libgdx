package Sprites;
//import com.badlogic.gdx.Gdx

import com.mygdx.game.MyGdxGame;
//import org.intellij.lang.;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;


public class mytest {
    final MyGdxGame game;
    int flag =0;

    //    MyGdxGame game;
    public mytest(MyGdxGame game) {
        this.game = game;
    }

    class mytes {

        @Test
        public void check() {
            long d1 =0;
//            double d2 =0;
            String s1 = "t";
            assertEquals(s1, s1);
//            asser

        }
    }

    public int give() {
        Result r = JUnitCore.runClasses(mytest.mytes.class);
        for (Failure f : r.getFailures()) {
            System.out.println("fail");
            return 1;



        }
        System.out.println("success");
        return 0;


    }
}


