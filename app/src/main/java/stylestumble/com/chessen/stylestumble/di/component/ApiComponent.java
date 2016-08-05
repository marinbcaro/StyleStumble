package stylestumble.com.chessen.stylestumble.di.component;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import stylestumble.com.chessen.stylestumble.di.ApiModule;
import stylestumble.com.chessen.stylestumble.di.ApplicationModule;


/**
 * Created by carolinamarin on 8/2/16.
 */
@Singleton
@Component(modules={ApplicationModule.class, ApiModule.class})
public interface ApiComponent {

    Retrofit retrofit();
    OkHttpClient okHttpClient();

}
