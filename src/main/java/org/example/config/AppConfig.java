package org.example.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")  // Сканируем пакеты для бинов
public class AppConfig {

    @Bean
    public EagerBean eagerBean() {
        return new EagerBean();
    }

    @Bean
    @Lazy
    public LazyBean lazyBean() {
        return new LazyBean();
    }
}
