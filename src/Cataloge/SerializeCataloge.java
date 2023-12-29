package Cataloge;

import java.io.*;
import java.util.List;

public class SerializeCataloge {

    public   void serializeObjects(String fileName, Cataloge cat) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            // Сериализуем все переданные объекты
            List<Edition> editions=cat.getEditions();
            for (var object : editions) {
                outputStream.writeObject(object);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  Cataloge deserializeObjects(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            // Десериализуем объекты из файла
            Cataloge cat=new Cataloge();

                while (inputStream.available() !=-1) {
                    try {
                        Edition b = (Edition) inputStream.readObject();

                        cat.addEditionToCataloge(b);
                    }
                catch(Exception e){   return cat;}}
            return cat;
       } catch (IOException  e) {
            e.printStackTrace();
            return null;
        }
    }

}
