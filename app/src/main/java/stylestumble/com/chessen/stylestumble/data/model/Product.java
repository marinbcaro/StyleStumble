package stylestumble.com.chessen.stylestumble.data.model;

import android.support.annotation.Nullable;

/**
 * Created by carolinamarin on 7/28/16.
 */
public  class Product {
    private   Brand brand;
    private final Image image;
    private final String id;
    @Nullable
    private final String description;
    private final String name;
    private final String unbrandedName;
    private final String url;
    private final String price;
    private final String salePrice;


    public Product(@Nullable String mid, @Nullable String mdescription, String mname, String murl, Brand mbrand, String mprice, Image mimage, String msalePrice, String munBrandedName) {
        id = mid;
        description = mdescription;
        name = mname;
        url = murl;
        brand = mbrand;
        price = mprice;
        image = mimage;
        salePrice = msalePrice;
        unbrandedName = munBrandedName;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public String getName() {
        return name;
    }

    @Nullable
    public String getUrl() {
        return url;
    }


    @Nullable
    public Brand getBrand() {
        return brand;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    @Nullable
    public Image getImage() {
        return image;
    }

    @Nullable
    public String getPrice() {
        return price;
    }

    @Nullable
    public String getSalePrice() {
        return salePrice;
    }

    @Nullable
    public String getUnbrandedName() {
        return unbrandedName;
    }

    public class Brand {
        public String name;
    }

    public class Image {
        public Sizes sizes;
    }

    public class Sizes {
        public IPhoneSmall IPhoneSmall;
    }

    public class IPhoneSmall {
        public String url;
    }

}