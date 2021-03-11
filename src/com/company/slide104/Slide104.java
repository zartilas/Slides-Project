package com.company.slide104;

public class Slide104 {
    class Person{
        int id;
        String name;
        Person(int id,String name){
            this.id=id;
            this.name=name;
        }
    }
     class PersonExtends extends Person{
        float salary;
         PersonExtends(int id,String name,float salary){
            super(id,name);//reusing parent constructor
            //The super keyword in Java is a reference variable which is used to refer immediate parent class object.
            this.salary=salary;
            //The this keyword in Java is a reference variable that refers to the current object.
        }
        void display()
        {
            System.out.println(id+" "+name+" "+salary);
        }
    }

        public  void slide104(){
            PersonExtends person = new PersonExtends(1,"Bill",6669);
            person.display();
        }
}
