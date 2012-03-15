package no.antares.phonegap;

import android.os.Bundle;

import com.phonegap.*;

public class Oppgave2 extends DroidGap {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/compassExample.html");
    }
}