package stylestumble.com.chessen.stylestumble.products;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import javax.inject.Inject;

import stylestumble.com.chessen.stylestumble.R;
import stylestumble.com.chessen.stylestumble.data.ProductsPresenter;
import stylestumble.com.chessen.stylestumble.data.ProductsView;
import stylestumble.com.chessen.stylestumble.data.model.Product;
import stylestumble.com.chessen.stylestumble.di.StyleStumbleApplication;

/**
 * A placeholder fragment containing a simple view.
 */
public class ProductsActivityFragment extends Fragment implements ProductsView {


    @Inject
    ProductsPresenter mProductsPresenter;

    public ProductsActivityFragment() {
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((StyleStumbleApplication) getActivity().getApplication()).getComponent().inject(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_products, container, false);
    }



    @Override
    public void onResume() {
        super.onResume();
        mProductsPresenter.setView(this);
//        String catId="womens";
//        String search="";
//        int offset=0;
        mProductsPresenter.getProducts();
    }
    @Override
    public void showProducts(ArrayList<Product> products) {
        Log.d("products",""+ products.size());
    }
}
