package no.antares.phonegap;

import android.os.Bundle;
import android.view.KeyEvent;

import com.phonegap.*;

public class Bonus extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/bonusExample.html");
    }
    
    @Override
    public boolean onKeyDown(int code, KeyEvent event){
    	if (code==KeyEvent.KEYCODE_VOLUME_DOWN) this.appView.loadUrl("javascript:onVolumeDownKeyDown();");
    	else if (code==KeyEvent.KEYCODE_VOLUME_UP) this.appView.loadUrl("javascript:onVolumeUpKeyDown();");
    	else return super.onKeyDown(code, event);
    	return true;
    }
}