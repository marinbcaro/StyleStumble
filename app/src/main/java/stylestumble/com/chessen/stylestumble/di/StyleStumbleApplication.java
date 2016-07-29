package stylestumble.com.chessen.stylestumble.di;

import android.app.Application;

/**
 * Created by carolinamarin on 7/23/16.
 */
public class StyleStumbleApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

           component= DaggerApplicationComponent.builder()
                   .applicationModule(new ApplicationModule(this))
                   .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }

}
