package com.techelevator;

public class Television {
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    //* method below
    public void turnOff() {
        isOn = false;
    }

   public void turnOn() {
        isOn = true;
        currentVolume = 2;
        currentChannel = 3;
    }

   public void changeChannel(int newChannel) {
        if (isOn) {
            if (newChannel >= 3 && newChannel <= 18) {
                currentChannel = newChannel;
            }
        }
    }
    public void channelUp() {
        if (isOn && currentChannel < 18 ) {
            currentChannel++;
        }else if (isOn && currentChannel == 18){
            this.currentChannel = 3;
        }
    }
    public void channelDown() {
        if (isOn && currentChannel > 3) {
            currentChannel--;
        }else if (isOn && currentChannel == 3){
            this.currentChannel= 18;
        }
    }
    public void raiseVolume() {
        if (isOn && currentVolume < 10) {
            currentVolume++;
        }
    }
    public void lowerVolume() {
        if (isOn && currentVolume > 0) {
            currentVolume--;
        }
    }
}
