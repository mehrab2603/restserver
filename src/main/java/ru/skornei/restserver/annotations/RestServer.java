package ru.skornei.restserver.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RestServer {

    /**
     * Порт сервера
     * @return порт
     */
    int port();

    /**
     * Конвертер объектов
     * @return класс конвертера
     */
    Class<?> converter();

    /**
     * Контроллеры сервера
     * @return список классов
     */
    Class<?>[] controllers();
}
