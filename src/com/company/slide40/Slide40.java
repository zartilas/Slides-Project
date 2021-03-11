package com.company.slide40;

class sports {
    void print(){
        System.out.println("Word of sports");
    }

    static class swimming {
        static class freestyle {
            void printStyleOfSwimming() {
                System.out.println("Freestyle is a kind of swimming style");
            }
        }
    }

    static class volley {
        void printVolley(){
            System.out.println("Volleyball is a popular team sport in which two teams of six players are separated by a net");
        }
    }
}

 class Main40 {

    static class StatiClass{
        void printWithStaticClass(){
            System.out.println("Static Class");
        }
    }

    public static void main(String[] args) {
        //anonymous class
        new sports().print();
        sports x=new sports();
        sports.swimming.freestyle y= new sports.swimming.freestyle();
        y.printStyleOfSwimming();
        sports.volley v= new sports.volley();
        v.printVolley();
        new StatiClass().printWithStaticClass();
    }
}




