package ru.springlesson1.dobrianskysp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Musik testMusik = context.getBean("testMusik", Musik.class);

        MusikPlayer player = new MusikPlayer(testMusik);

        player.playMusik();
        context.close();
    }
}
