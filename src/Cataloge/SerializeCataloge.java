package Cataloge;

import java.io.*;

public class SerializeCataloge {

    public   void serializeObjects(String fileName, Serializable... objects) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            // Сериализуем все переданные объекты
            for (Serializable object : objects) {
                outputStream.writeObject(object);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    private static Edition[] deserializeObjects(String fileName) {
//        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
//            // Десериализуем объекты из файла
//            int numberOfObjects = inputStream.available() / (Long.BYTES + Integer.BYTES * 2); // Рассчитываем количество объектов
//            Person[] people = new Person[numberOfObjects];
//
//            for (int i = 0; i < numberOfObjects; i++) {
//                people[i] = (Person) inputStream.readObject();
//            }
//
//            return people;
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}
