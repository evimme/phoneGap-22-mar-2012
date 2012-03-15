package no.antares.phonegap;

import android.os.Bundle;

import com.phonegap.*;

public class Oppgave1 extends DroidGap {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/cameraExample.html");
    }
}