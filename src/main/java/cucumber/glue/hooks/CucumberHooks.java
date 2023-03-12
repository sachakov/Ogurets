package cucumber.glue.hooks;

import io.cucumber.java.Before;

public class CucumberHooks {

    @Before(order = 0)//order - порядок выполнения
    public void beforeMethod (){//чтобы сработало надо запускать всю фичу файл, не отдельный файл
        System.out.println("Before All");
    }
    @Before(order = 1, value = "@SecondBefore")//тут велью дает возможность выполнить этот прекондишт только перед одним
    //конкретным сценарием, который будет отмечен такой же аннотацией
    public void secondBefore(){
        System.out.println("Second before");
    }
}
