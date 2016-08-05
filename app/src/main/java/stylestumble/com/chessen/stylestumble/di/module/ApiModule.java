package stylestumble.com.chessen.stylestumble.di.module;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import stylestumble.com.chessen.stylestumble.BuildConfig;
import stylestumble.com.chessen.stylestumble.data.ProductsService;
import stylestumble.com.chessen.stylestumble.data.ProductsServiceImp;

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

        OkHttpClient okHttpClient= new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();
        return okHttpClient;
    }

    @Provides
    public Retrofit provideRetrofit(OkHttpClient okHttpClient){

       Retrofit retrofit= new Retrofit.Builder()
               .baseUrl("http://api.shopstyle.com/api/v2/")
               .addConverterFactory(GsonConverterFactory.create())
               .client(okHttpClient)
               .build();
        return retrofit;

    }

    @Provides
    public ProductsService provideProductsService(OkHttpClient okHttpClient){
        return new ProductsServiceImp(provideRetrofit(okHttpClient));
    }

//
//    @Provides
//    public ProductsApiService provideProductsApiService(OkHttpClient okHttpClient) {
//        return provideRetrofit(okHttpClient).create(ProductsApiService.class);
//    }



}
