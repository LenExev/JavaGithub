package Cataloge;

public class CreateCataloge {
    public Cataloge create(int number1,int number2, int number3){
        Cataloge cataloge=new Cataloge();
        for(int index=0;index<number1;index++){
           CreateBook createBook=new CreateBook();
           Book book=createBook.create();
            cataloge.addEditionToCataloge(book);
        }
        for(int index=0;index<number2;index++){
            CreateNewsPaper createNP=new CreateNewsPaper();
            Newspaper np=createNP.create();
            cataloge.addEditionToCataloge(np);
        }
        for(int index=0;index<number3;index++){
            CreateAlmanac createAlm=new CreateAlmanac();
            Almanac alm=createAlm.create();
            cataloge.addEditionToCataloge(alm);
        }
        return cataloge;
    }
}
