package stylestumble.com.chessen.stylestumble.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import stylestumble.com.chessen.stylestumble.data.ProductsService;
import stylestumble.com.chessen.stylestumble.data.ProductsServiceImp;

/**
 * Created by carolinamarin on 7/23/16.
 */
@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application=application;
    }

    @Provides @Singleton
    public Context provideContext(){
        return application;
    }

    @Provides @Singleton
    public ProductsService provideProductsService(Retrofit retrofit){
        return new ProductsServiceImp(retrofit);
    }

}
