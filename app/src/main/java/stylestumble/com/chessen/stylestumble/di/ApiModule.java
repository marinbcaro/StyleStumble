package stylestumble.com.chessen.stylestumble.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

;

/**
 * Created by carolinamarin on 7/27/16.
 */
@Module
public class ApiModule {

    @Provides
    @Singleton
    public Retrofit provideRestAdapter(){

       return new Retrofit.Builder()
               .baseUrl("http://api.shopstyle.com/api/v2/")
               .addConverterFactory(GsonConverterFactory.create())
               .build();

    }

}
