package org.example;

import JavaContent.ClassAndObjects.StudentPOJO;

public class StudentPojoMain {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            StudentPOJO s = new StudentPOJO("S985" +i,
                    switch (i){
                        case 1-> "mary";
                        case 2-> "carol";
                        case 3-> "tim";
                        case 4-> "harry";
                        case 5-> "lisa";
                        default -> "Anonyomus";
                    },
                    "05/11/1985",
                    "Java Maserclass"
                    );

            System.out.println(s);

        }
    }
}
