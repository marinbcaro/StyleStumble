package stylestumble.com.chessen.stylestumble.data;

import java.util.ArrayList;

import stylestumble.com.chessen.stylestumble.data.model.Product;

/**
 * Created by carolinamarin on 7/28/16.
 */
public class ProductsPresenterImp implements ProductsPresenter {


    protected ProductsService mService;


    protected ProductsView mView;


    public ProductsPresenterImp(ProductsService service) {
        this.mService = service;
    }

    public void setView(ProductsView productsView){
        this.mView=productsView;
    }


    public void getProducts() {
        if(mView==null){
            throw new ViewNotFoundException();
        }

        mService.getProducts(new ProductsService.LoadProductsCallback() {
            @Override
            public void onProductsLoaded(ArrayList<Product> products) {
                mView.showProducts(products);
            }

        });

    }


}
