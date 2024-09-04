package com.springid.spring_di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18SpanishGreetingService implements GreetingService {
    @Override
    public String sayGretting() {
        return "Hola Mundo - ES";
    }
}
