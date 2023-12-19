package InnerClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class PlayRoom {
    public static void main(String[] args) {
        List<GameConsole.Game.GameDisk> diskList=new ArrayList<>();
        GameConsole.Game.GameDisk disk1= GameConsole.Game.getDisk("Зомби",Genre.ACTION," убивайте зомби ,чтоб выжить");
        GameConsole.Game.GameDisk disk2= GameConsole.Game.getDisk("Гонки",Genre.RACE," выиграй гонку на спортивной машине");
        GameConsole.Game.GameDisk disk3= GameConsole.Game.getDisk("Шахматы",Genre.SPORT," играте в шахматы с другом или с компьютером");
        GameConsole.Game.GameDisk disk4= GameConsole.Game.getDisk("Лабиринт",Genre.ACTION," пройдите лабиринт и получите приз");
        diskList.add(disk1);
        diskList.add(disk2);
        diskList.add(disk3);
        diskList.add(disk4);

        List<GameConsole.Game.VirtualGame> virtualList=new ArrayList<>();
        GameConsole.Game.VirtualGame game1= GameConsole.Game.getVirtualGame("Лесное приключение",Genre.ACTION);
        game1.setRating(3);
        GameConsole.Game.VirtualGame game2= GameConsole.Game.getVirtualGame("Американские горки",Genre.ACTION);
        game2.setRating(5);
        GameConsole.Game.VirtualGame game3= GameConsole.Game.getVirtualGame("Горные лыжи",Genre.SPORT);
        game3.setRating(4);
        GameConsole.Game.VirtualGame game4= GameConsole.Game.getVirtualGame("Прыжок с парашютом",Genre.ACTION);
        game4.setRating(2);

        virtualList.add(game1);
        virtualList.add(game2);
        virtualList.add(game3);
        virtualList.add(game4);

        GameConsole gameConsole= new GameConsole(Brand.SONY,"XC123QeWR");
        System.out.println("     --------------");
        diskList.sort(Comparator.comparing(o -> o.getData().getGenre()));

        for (GameConsole.Game.GameDisk obj : diskList) {
            System.out.println(obj);
        }
        System.out.println("     --------------");
        virtualList.sort(Comparator.comparingInt(GameConsole.Game.VirtualGame::getRating));

        for (GameConsole.Game.VirtualGame obj : virtualList) {
            System.out.println(obj);
        }

        System.out.println("     --------------");

        try{
            gameConsole.loadGame(diskList.get(1).getData());
            gameConsole.powerOn();
            gameConsole.loadGame(diskList.get(1).getData());
            gameConsole.getFirstGamepad().powerOn();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.getSecondGamepad().powerOn();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.getFirstGamepad().powerOff();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.getSecondGamepad().powerOff();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
        }
        catch(ToLongNoActivity e){
            System.out.println(e.getMessage());
        }
        System.out.println("     --------------");
        System.out.println("     --------------");
        try{
            gameConsole.loadGame(virtualList.get(2).getData());
            gameConsole.getFirstGamepad().powerOn();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.getFirstGamepad().powerOff();
            gameConsole.getSecondGamepad().powerOn();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.getSecondGamepad().powerOff();
            gameConsole.getFirstGamepad().powerOn();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
        }
        catch(ToLongNoActivity e){
            System.out.println(e.getMessage());
        }

        System.out.println("     --------------");
        System.out.println("     --------------");

        try{
            gameConsole.loadGame(diskList.get(0).getData());
            gameConsole.getFirstGamepad().powerOn();
            gameConsole.playGame();
            gameConsole.getSecondGamepad().powerOn();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
            gameConsole.playGame();
        }
        catch(ToLongNoActivity e){
            System.out.println(e.getMessage());
        }

    }
}
