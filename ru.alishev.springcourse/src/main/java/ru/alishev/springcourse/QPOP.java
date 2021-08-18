package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class QPOP implements Music{
//    private QPOP() {}
//
//    public static QPOP getqpop() {
//        return new QPOP();
//    }
//
//    public void doMyInit() {
//        System.out.println("Doing my initialization");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Do my destructuib");
//    }
    @Override
    public String getSong(){
        return "NinetyOne";
    }
}
