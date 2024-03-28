package projectObject;

import projectClass.clsLcd;

public class objLcd {
        public static void main(String[] args) {
            clsLcd lcd1 = new clsLcd();
            lcd1.turnOff();
            lcd1.turnOn();
            lcd1.cableDown();
            lcd1.cableDown();
            lcd1.setVolume(50);
            lcd1.volumeDown();
            lcd1.Freeze();
            lcd1.setBrightness(20);
            lcd1.brightnessDown(); 
            lcd1.brightnessDown();
            lcd1.cableUp();

            lcd1.displayMessage();
        
    }
}