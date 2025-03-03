package org.example;

import org.example.config.AppConfig;
import org.example.config.LazyBean;
import org.example.service.TaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Используем сервис по умолчанию (TaskServiceImpl1)
        TaskService defaultService = context.getBean(TaskService.class);
        defaultService.addTask("Сделать ДЗ");
        System.out.println("Задачи (по умолчанию): " + defaultService.getTasks());

        // Используем вторую реализацию сервиса через @Qualifier
        TaskService secondService = context.getBean("taskServiceImpl2", TaskService.class);
        secondService.addTask("Выучить Spring");
        System.out.println("Задачи (TaskServiceImpl2): " + secondService.getTasks());

        // Проверяем singleton-бины
        System.out.println("Создаём LazyBean...");
        LazyBean lazyBean = context.getBean(LazyBean.class); // Он создастся только сейчас


    }
}
