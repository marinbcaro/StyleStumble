package stylestumble.com.chessen.stylestumble.data;

import java.util.ArrayList;

import retrofit2.Retrofit;

/**
 * Created by carolinamarin on 7/27/16.
 */
public class ProductsServiceImp implements ProductsService {

    private Retrofit mRetrofit;
    public ProductsServiceImp(Retrofit retrofit){
        this.mRetrofit=retrofit;
    }

    @Override
    public ArrayList getProducts() {

        ArrayList arrayList=new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        return arrayList;
    }
}
