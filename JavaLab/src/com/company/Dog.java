package com.company;

public abstract class Dog{
    private String name="dog";
    private int age;
    String getName(){return name;}
    int getAge(){return age;};
    Dog(String name,int age){this.name=name;this.age=age;}
    public abstract void displayInfo();

}
class BreedImpl implements Nameable{
    @Override
    public String getName() {
        Breed obj=new Breed("Veny",4,"Husky");
        return obj.getName();
    }

}
class Breed extends Dog{
    private String breed;

    Breed(String name, int age,String bread) {
        super(name, age);
        this.breed=bread;
    }


    public void displayInfo(){
        System.out.println("Имя собачки :"+getName()+" Возраст милахи : "+getAge()+" Парода : "+breed);
        }

    }
    class newOwener extends Breed{
    private String city;
    private String foneNumber;
        newOwener(String name, int age, String bread,String city,String foneNumber) {
            super(name, age, bread);
            this.city=city;
            this.foneNumber=foneNumber;
        }
        public void DisplayInfo2(){
            System.out.println("Город в который забрали собачку : "+city+" Мобилбный телефон : "+foneNumber);
        }
    }
