package stylestumble.com.chessen.stylestumble.products;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import stylestumble.com.chessen.stylestumble.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ProductsActivityFragment extends Fragment {

    public ProductsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_products, container, false);
    }
}
