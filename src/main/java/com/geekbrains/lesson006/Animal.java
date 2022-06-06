package com.geekbrains.lesson006;

public abstract class Animal {
    protected String type;
    protected String name;
    private static int count;

    protected abstract int maxSwimmingDistance();
    protected abstract int maxRunningDistance();

    protected Animal(){
        count++;
    }

    protected static int getCount(){
        return count;
    }

    protected void run(int runningDistance){
        if (runningDistance <= maxRunningDistance() && runningDistance >= 0) {
            System.out.println(type + " по кличке " + name + " пробежал(а) " + runningDistance + " метра(ов)!");
        } else {
            System.out.println("\n" + type + " по кличке " + name + " не смог(ла) пробежать " + runningDistance + " метра(ов)!");
            System.out.println(type + " может пробежать от 0 до "+ maxRunningDistance() + " метра(ов)!\n");
        }
    }

    protected void swim(int swimmingDistance){
        if (swimmingDistance <= maxSwimmingDistance() && swimmingDistance >= 0){
            System.out.println(type + " по кличке " + name + " проплыл(а) " + swimmingDistance + " метра(ов)!");
        } else {
            System.out.println("\n" + type + " по кличке " + name + " не смог(ла) проплыть " + swimmingDistance + " метра(ов)!");
            System.out.println(type + " может проплыть от 0 до " + maxSwimmingDistance() + " метра(ов)!\n");
        }
    }
}
