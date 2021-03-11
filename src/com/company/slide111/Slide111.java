package com.company.slide111;

public class Slide111 {
    class Human{
        protected String name, id;
        protected int age;

        //Creat 2 constructors
        private Human(){
        }
        protected Human(String humanName, int humanAge, String humanID){
            this.name = humanName;
            this.age = humanAge;
            this.id = humanID;
        }
    }

        public void slide111(){

            new Human("Takis", 54, "571616826"){
                void print(){
                    System.out.println("Name: "+name+"\nAge: "+age+"\nID: "+id);
                }
            }.print();
        }

}
