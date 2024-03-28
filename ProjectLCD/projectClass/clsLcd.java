package projectClass;

public class clsLcd {
    String Status;
    int Volume;
    int Brightness;
    String Cable;
    int cc;

    public String turnOff(){
        return Status = "Off";
    }

    public String turnOn(){
        return Status = "On";
    }

    public String Freeze(){
        return Status = "Freeze";
    }

    public int volumeUp(){
        Volume++;
        return Volume;
    }

    public int volumeDown(){
        Volume--;
        return Volume;
    }

    public int setVolume(int Volume){
        this.Volume = Volume;
        return Volume;
    }

    public int brightnessUp(){
        Brightness++;
        return Brightness;
    }

    public int brightnessDown(){
        Brightness--;
        return Brightness;
    }

    public int setBrightness(int Brightness){
        this.Brightness = Brightness;
        return Brightness;
    }

    public void cableUp(){
        this.cc++;
        Cek();
        setCable();
    }

    public void cableDown(){
        this.cc--;
        Cek();
        setCable();
    }

    public void Cek(){
        if(cc < 1){
            cc += 3;
        }
    }

    public void setCable(){
        switch(cc){
            case 1:
                Cable = "HDMI";
            break;
            case 2:
                Cable = "DIV";
            break;
            case 3:
                Cable = "Display Port";
            break;
        }
    }

    public void displayMessage(){
        System.out.println("============== LCD ==============");
        System.out.println("Status LCD saat ini     : " + Status);
        System.out.println("Volume LCD saat ini     : " + Volume);
        System.out.println("Brightness LCD saat ini : " + Brightness);
        System.out.println("Cable LCD saat ini      : " + Cable);
    }

}
