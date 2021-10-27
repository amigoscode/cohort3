package com.helenatech.wedweektwo.unzip;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        MacUnzip macUnzip = new MacUnzip();
        WindowsUnzip windowsUnzip = new WindowsUnzip();
        LinuxUnzip linuxUnzip = new LinuxUnzip();

        List<Unzip> unzips = List.of(
                macUnzip,
                windowsUnzip,
                linuxUnzip);
        unzip(unzips);
    }

    static void unzip(List<Unzip> unzips) {
        unzips.forEach(unzip -> unzip.unzip("pictures.zip"));
    }
}
