package com.company.slide161;

public class Slide161 {
    class Human{
        int age;
        String name;
        float kg;
        String gender;
    }

    class Girl extends Human{
        Girl(String onoma, int ilikia, float KG){
            this.name = onoma;
            this.age = ilikia;
            this.kg = KG;
            this.gender = "Feamle";
        }

        void StrengthG(){
            System.out.println("Girls are strong, but they cannot do all the jobs like boys.");
        }

    }

    class Boy extends Human{
        Boy(String onoma, int ilikia, float KG){
            this.name = onoma;
            this.age = ilikia;
            this.kg = KG;
            this.gender = "Male";
        }

        void StrengthB(){
            System.out.println("Boys are stronger than girls.");
        }
    }

        public void slide161(){
            /*
             * Classes boy and girl are using (extend) class human variables.
             * This is what we call Inheritance.
             */
            new Girl("Niki", 26, 36.5f).StrengthG();
            new Boy("Nikos",23, 45).StrengthB();
        }
}
