package com.helenatech.wedweektwo.unzip;

public abstract class Unzip {

    public void unzip(String filename) {
        System.out.println("starting unzip process");
        String os = getOS();
        if (os.equalsIgnoreCase("WINDOWS")) {
            System.out.println("Doing extra windows unzip process...");
        } else if (os.equalsIgnoreCase("MACOS")) {
            System.out.println("No need unzip process because its a mac :)");
        } else {
            throw new IllegalStateException(os + " not supported");
        }
        System.out.println("ended unzip process");
    }

    public abstract String getOS();

}
