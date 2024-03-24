package projectClass;

import projectObject.objLcd;

public class clsLcd {
        public static void main(String[] args) {
            objLcd lcd1 = new objLcd();
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