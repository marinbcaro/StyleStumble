package stylestumble.com.chessen.stylestumble.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import stylestumble.com.chessen.stylestumble.data.ProductsPresenter;
import stylestumble.com.chessen.stylestumble.data.ProductsPresenterImp;
import stylestumble.com.chessen.stylestumble.data.ProductsService;

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



    @Provides
    public ProductsPresenter provideProductsPresenter(ProductsService service){
        return new ProductsPresenterImp(service);

    }

//
//    @Provides
//    public ProductsApiService provideProductsApiService(Retrofit retrofit) {
//        return retrofit.create(ProductsApiService.class);
//    }

}
