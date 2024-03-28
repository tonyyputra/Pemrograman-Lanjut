package projectObject;

import projectClass.clsLcd;

public class objLcd {
        public static void main(String[] args) {
            clsLcd lcd1 = new clsLcd();
            lcd1.turnOn();
            lcd1.turnOff();
            lcd1.setVolume(51);
            lcd1.Freeze();
            lcd1.setBrightness(38);
            lcd1.cableUp();
            lcd1.cableUp();
            lcd1.cableUp();

            lcd1.displayMessage();
        
    }
}