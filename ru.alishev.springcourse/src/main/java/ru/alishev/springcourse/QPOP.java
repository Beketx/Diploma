package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class QPOP implements Music{
    @Override
    public String getSong(){
        return "NinetyOne";
    }
}
