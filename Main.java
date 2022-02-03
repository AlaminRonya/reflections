package main;

import main.callbacks.OnCarCompeleted;
import main.model.*;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
      OnCarCompeleted onCarCompeleted;
        Vehicle vehicle = new Vehicle("Vehicle");
//        System.out.println("Vehicle "+vehicle.getName());
//        OnCarCompeleted onCarCompeleted = null;
//
//
//        Vehicle vehicle1 = new Vehicle();
//        System.out.println(vehicle1.getName());
        OnCarCompeleted car = new Car("BMW");
        vehicle.onCar((Car) car);
//        car.setObject(onCarCompeleted, car);
//        Vehicle bike = new Bike("Bike");
//        bike.show(bike);
//
//        CarObject carObject = new CarObject();
//        carObject.setOnCarCompeleted(onCarCompeleted);
//        carObject.show();
//
//        vehicle.show(car);
//        vehicle.show(bike);
////        System.out.println(car);
//        System.out.println(vehicle.getName());

        Student student = new Student(1, "Al Amin",16);

        Class className = student.getClass();
        System.out.println("Class name : "+ className);
        System.out.println("Class interface : "+ className.isInterface());
        System.out.println("Class array : "+ className.isArray());
        Constructor[] constructors = className.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
        for (Constructor constructor: constructors){
          if (constructor.getParameterCount() == 0){
            System.out.println("no-args constructor");
          }else{
            Parameter[] parameters = constructor.getParameters();

            System.out.println("args constructor");
            for (Parameter parameter: parameters){
              System.out.println("Parameter name : "+parameter.getName()+" & Parameter type : "+parameter.getType());
            }

          }

        }
        Method[] methods = className.getMethods();
        for (Method method: methods){
//          System.out.println(method);
          System.out.println("Method name: "+method.getName()+" , method type: "+method.getReturnType()
                  +" , method modifier: "+ Modifier.toString(method.getModifiers()));
        }
      System.out.println("private value");
        Method[] methods1 = className.getDeclaredMethods();
      for (Method method: methods1){
//          System.out.println(method);
        System.out.println("Method name: "+method.getName()+" , method type: "+method.getReturnType()
                +" , method modifier: "+ Modifier.toString(method.getModifiers()));
      }
      Field fieldSet = className.getDeclaredField("name");
      fieldSet.setAccessible(true);
      fieldSet.set(student, "JAVA");


      Field[] fields = className.getDeclaredFields();
      for (Field field: fields){
//        if (field.equals(className.getDeclaredField("name"))){
//
//        }


        field.setAccessible(true);
//
//        Object o = field.get(student);
        System.out.println(field.getName()+" : value -> "+field.get(student));
//        System.out.println(field.getName());
      }
      Method[] privateMethodAccess = className.getDeclaredMethods();
      for (Method method: privateMethodAccess){
        if (method.getParameterCount() == 0){
          method.setAccessible(true);
          method.invoke(student);
        }
      }
//      privateMethodAccess.setAccessible(true);
//      privateMethodAccess.invoke(className);





    }
}
