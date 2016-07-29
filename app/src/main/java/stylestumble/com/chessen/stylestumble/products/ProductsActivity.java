package stylestumble.com.chessen.stylestumble.products;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import javax.inject.Inject;

import stylestumble.com.chessen.stylestumble.R;
import stylestumble.com.chessen.stylestumble.data.ProductsService;
import stylestumble.com.chessen.stylestumble.di.StyleStumbleApplication;

public class ProductsActivity extends AppCompatActivity {

    @Inject
    ProductsService mTestService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        ((StyleStumbleApplication) getApplication()).getComponent().inject(this);

        ArrayList marray = mTestService.getProducts();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
