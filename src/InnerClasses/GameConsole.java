package InnerClasses;


public class GameConsole implements Powered {
    private final Brand brand;
    private String model;
    private final String serial;
    private int waitingCounter = 0;
    public class Gamepad implements Powered{
        private final Brand brand;
        private final String consoleSerial;
        private  int connectedNumber;
        private  Color color;
        private double chargeLevel = 100.0;
        private boolean isOn;

        public Gamepad(Brand brand, int connectedNumber)  {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            consoleSerial = serial;
        }
        public void powerOn(){
            if (chargeLevel == 0) {
                System.out.println("Джойстик номер "+connectedNumber+"  не может быть включен заряд= "+chargeLevel+'%');
            }else {
                isOn = true;
                System.out.println("Джойстик номер "+connectedNumber+"  включился заряд= "+chargeLevel+'%');
                if(!getOn()) {
                    setOn(true);
                }
                if (!firstGamepad.isOn()) {
                    secondGamepad.connectedNumber = 1;
                    System.out.println("Первый джойстик отключен, второй джойстик становится первым");
                } else {
                    firstGamepad.connectedNumber = 1;
                    secondGamepad.connectedNumber = 2;
                }
            }
        }
        public void powerOff(){
            isOn=false;
            if(this==firstGamepad){
                secondGamepad.connectedNumber=1;
            }
            System.out.println("Джойстик номер "+connectedNumber+"  отключился");;
        }
        public void setColor(Color color) {
            this.color = color;
        }

        public void setChargeLevel(double chargeLevel) {
            this.chargeLevel = chargeLevel;
        }


        public Brand getBrand() {
            return brand;
        }

        public String getConsoleSerial() {
            return consoleSerial;
        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        public Color getColor() {
            return color;
        }

        public double getChargeLevel() {
            return chargeLevel;
        }

        public boolean isOn() {
            return isOn;
        }
    }
    private final Gamepad secondGamepad;
    private final Gamepad firstGamepad;
    private boolean isOn;
    public GameConsole(Brand brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        firstGamepad = new Gamepad(brand,1);
        secondGamepad = new Gamepad(brand,2);
    }
    public static class Game{
        private final String name;
        private final Genre genre;
        private final Type type;
        public enum Type {
            VIRTUAL,
            PHYSICAL
        }
        private Game(String name, Genre genre, Type type) {
            this.name = name;
            this.genre = genre;
            this.type = type;
        }
public static class GameDisk{
      private final String description;
      private final Game data;

    private GameDisk(String name,Genre genre,String description) {
        this.description = description;
        data=new Game(name,genre,Type.PHYSICAL);
    }

    @Override
    public String toString() {
        return "GameDisk{" +
                "name=" + data.name +
                ", genre=" + data.genre +
                ", description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public Game getData() {
        return data;
    }
}
        public static class VirtualGame{
            private int rating;
            private final Game data;

            private VirtualGame(String name,Genre genre) {
                data=new Game(name,genre,Type.VIRTUAL);
            }

            public void setRating(int rating) {
                if (rating >= 0 && rating <= 5) {
                    this.rating = rating;
                } else {
                    System.out.println("Рейтинг должен быть от 0 до 5");
                }
            }

            @Override
            public String toString() {
                return "VirtualGame{" +
                        "name=" + data.name +
                        ", rating=" + rating +
                        '}';
            }

            public int getRating() {
                return rating;
            }

            public Game getData() {
                return data;
            }
        }
        public static GameDisk getDisk( String name,Genre genre,String description){
            return new GameDisk(name,genre,description);
        }
        public static VirtualGame getVirtualGame( String name,Genre genre){
            return new VirtualGame(name,genre);
        }
        public String getName() {
            return name;
        }

        public Genre getGenre() {
            return genre;
        }

        public Type getType() {
            return type;
        }
    }
    private Game activeGame;
    public void loadGame(Game game)
    {
        if(isOn){
        activeGame = game;
        System.out.println("Игра: "+game.name+"  загружается!" );
        }
        else{
            System.out.println("Включите приставку!");
        }
    }
    public void playGame(){
        if(isOn){
        System.out.println("*** Играем в игру: "+activeGame.name );
        if (firstGamepad.isOn){
            System.out.println("   Джойстик номер "+firstGamepad.connectedNumber+" включен и заряжен на "+firstGamepad.chargeLevel+'%');
        }
        if (secondGamepad.isOn){
            System.out.println("   Джойстик номер "+secondGamepad.connectedNumber+" включен и заряжен на "+secondGamepad.chargeLevel+'%');
        }
        if(!firstGamepad.isOn && !secondGamepad.isOn){
            System.out.println("   Джойстики отключены");
        }
        checkStatus();
        changePower(firstGamepad);
        changePower(secondGamepad);
        }
        else{
            System.out.println("Включите приставку!");
        }

    }
    private void changePower(Gamepad gp){
        if (gp.isOn) {
            gp.setChargeLevel(gp.getChargeLevel() - 10);
            if (gp.getChargeLevel() == 0) {
                gp.isOn = false;
                System.out.println("Джойстик номер "+gp.connectedNumber+" полностью разрядился");
            }
        }
    }
    private void checkStatus(){
        if(!firstGamepad.isOn && !secondGamepad.isOn){
            System.out.println("Подключите джойстик!");
            waitingCounter++;
        }
        else{
            waitingCounter=0;
        }
        if(waitingCounter==5){
            isOn=false;
            waitingCounter=0;
            powerOff();
            throw new ToLongNoActivity();
        }
    }
    public void powerOn(){
        isOn=true;
        System.out.println("--Приставка включилась--");
    }
    public void powerOff(){
        isOn=false;
        System.out.println("--Приставка выключилась--");
    }
    public void setModel(String model) {
        this.model = model;
    }

    private void setOn(boolean on) {
        isOn = on;
        System.out.println("--Приставка включилась при включении джойстика--");
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerial() {
        return serial;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public boolean getOn() {
        return isOn;
    }
}
