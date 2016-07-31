package stylestumble.com.chessen.stylestumble.data;

import android.support.annotation.NonNull;

import java.util.ArrayList;

import stylestumble.com.chessen.stylestumble.data.model.Product;

/**
 * Created by carolinamarin on 7/27/16.
 */
public interface ProductsService {
    void getProducts(@NonNull LoadProductsCallback productsCallback);
    interface LoadProductsCallback {

        void onProductsLoaded(ArrayList<Product> products);

    }
}
