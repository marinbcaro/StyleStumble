package stylestumble.com.chessen.stylestumble.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import stylestumble.com.chessen.stylestumble.BuildConfig;

;

/**
 * Created by carolinamarin on 7/27/16.
 */
@Module
public class ApiModule {

    @Provides
    public OkHttpClient provideLoggingCapableHttpClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

        logging.setLevel(BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE);

        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();
    }

    @Provides
    @Singleton
    public Retrofit provideRestAdapter(){

       return new Retrofit.Builder()
               .baseUrl("http://api.shopstyle.com/api/v2/")
               .addConverterFactory(GsonConverterFactory.create())
               .build();

    }



}
