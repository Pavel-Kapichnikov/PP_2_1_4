package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier(value = "dog")
    private Animal animal;

    @Autowired
    private ApplicationContext applicationContext;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(getTimer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        Timer timer =
                applicationContext.getBean(Timer.class);
        return timer;
    }
}
