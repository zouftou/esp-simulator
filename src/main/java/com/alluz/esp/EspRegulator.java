package com.alluz.esp;

import java.util.Observable;
import java.util.Observer;

public class EspRegulator implements Observer {

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof SpeedController) {
			// todo
        }
    }
}
