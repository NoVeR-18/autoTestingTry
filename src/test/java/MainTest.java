
import org.junit.Test;

public class MainTest {
    //not accepted
    @Test
    public void firstTest(){        //3 3 ?
        Main main = new Main();
    }
    //negative test accepted
    @Test
    public void secondTest(){       //3 0 /
        Main main = new Main();
        main.div(3f, 0f);
    }
    //not accepted
    @Test
    public void thirdTest(){    //600000000000 5 *
        Main main = new Main();


    }
    //not accepted
    @Test
    public void fourTest(){     //-600000000000 5 *
        Main main = new Main();

    }
    //possitive test accepted
    @Test
    public void fiveTest(){     //67 34 +
        Main main = new Main();
        main.add(67f, 34f);
    }
    //possitive test accepted
    @Test
    public void sixTest(){      //125 3 -
        Main main = new Main();
        main.minus(125f,3f);
    }
    //possitive test accepted
    @Test
    public void sevenTest(){    //5 71 *
        Main main = new Main();
        main.mull(5f, 71f);
    }
    //possitive test accepted
    @Test
    public void eightTest(){    //27 3 /
        Main main = new Main();
        main.div(27f, 3f);
    }
    //possitive test accepted
    @Test
    public void nineTest(){    //3 4 ^
        Main main = new Main();
        main.exponentiation(3f, 4f);
    }

}


