package stylestumble.com.chessen.stylestumble.data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import stylestumble.com.chessen.stylestumble.data.model.Product;

/**
 * Created by carolinamarin on 7/28/16.
 */
public interface ProductsApiService {
    @GET("http://api.shopstyle.com/api/v2/sort=Popular&limit=10")
    Call<List<Product>> getProducts(@Query("cat") String catId, @Query("fts") String search, @Query("offset") int offset);
}
