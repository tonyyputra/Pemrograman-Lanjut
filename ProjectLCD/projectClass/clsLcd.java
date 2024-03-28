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
            cc += 4;
        }
    }

    public void setCable(){
        switch(cc){
            case 1:
                Cable = "VGA";
            break;
            case 2:
                Cable = "DVI";
            break;
            case 3:
                Cable = "HDMI";
            break;
            case 4:
                Cable = "Display Port";
            break;
        }
    }

    public void displayMessage(){
        System.out.println("============== LCD ==============");
        System.out.println("LCD Status : " + Status);
        System.out.println("Volume     : " + Volume);
        System.out.println("Brightness : " + Brightness);
        System.out.println("Cable      : " + Cable);
    }

}
