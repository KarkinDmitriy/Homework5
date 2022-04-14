package ru.geekbrains.lesson5;

public class StuffTest {
    public static void main(String[] args) {
        Stuff[]stuffsArray = new Stuff[5];

        stuffsArray[0]= new Stuff("Karkin Dmitriy", "Chief", "123445@mail.ru", "+7911111111", 100000, 34);
        stuffsArray[1]= new Stuff("Ivanov Petr", "Specialist", "123422@mail.ru", "+7911111112", 90000, 45);
        stuffsArray[2]= new Stuff("Petrov Ivan", "Engineer", "123423@mail.ru", "+7911111113", 50000, 57);
        stuffsArray[3]= new Stuff("Sidorov Vladislav", "Engineer", "123424@mail.ru", "+7911111114", 500000, 25);
        stuffsArray[4]= new Stuff("Zverev  Pavel", "Worker", "123425@mail.ru", "+7911111115", 47000, 41);
        for (Stuff stuffs: stuffsArray) {
            if (stuffs.getAge() > 40) {
                 stuffs.printInfo();

           }
        }

    }
}
