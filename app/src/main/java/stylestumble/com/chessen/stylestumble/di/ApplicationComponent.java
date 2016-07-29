package stylestumble.com.chessen.stylestumble.di;

import javax.inject.Singleton;

import dagger.Component;
import stylestumble.com.chessen.stylestumble.products.ProductsActivity;

/**
 * Created by carolinamarin on 7/23/16.
 */
@Singleton
@Component(modules= {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {
    void inject(ProductsActivity target);
    void inject(StyleStumbleApplication target);

}
