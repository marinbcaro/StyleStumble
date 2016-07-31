package stylestumble.com.chessen.stylestumble;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import stylestumble.com.chessen.stylestumble.data.ProductsPresenter;
import stylestumble.com.chessen.stylestumble.data.ProductsPresenterImp;
import stylestumble.com.chessen.stylestumble.data.ProductsService;
import stylestumble.com.chessen.stylestumble.data.ProductsView;
import stylestumble.com.chessen.stylestumble.data.ViewNotFoundException;

import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.verify;

/**
 * Created by carolinamarin on 7/30/16.
 */
public class ProductsPresenterImpTest {

    @Mock
    ProductsView theView;

    ProductsPresenter mPresenter;

    @Mock
    ProductsService mService;
  private static   ArrayList products = new ArrayList();


    @Captor
    private ArgumentCaptor<ProductsService.LoadProductsCallback> mLoadProductsCallbackCaptor;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);


        products.add("1");
        products.add("1");
        products.add("3");
        mPresenter = new ProductsPresenterImp(mService);
        mPresenter.setView(theView);

    }

    @Test
    public void validPresenterShouldNotBeNull() {

        assertNotNull(mPresenter);
    }

    @Test(expected = ViewNotFoundException.class)
    public void shouldSetTheView() {

        mPresenter.setView(null);
        mPresenter.getProducts();
    }


    @Test
    public void shouldLoadProductsFromService() {


        // Given an initialized NotesPresenter with initialized notes
        // When loading of Notes is requested
        mPresenter.getProducts();

        // Callback is captured and invoked with stubbed notes
        verify(mService).getProducts(mLoadProductsCallbackCaptor.capture());
        mLoadProductsCallbackCaptor.getValue().onProductsLoaded(products);


        verify(theView).showProducts(products);
    }
}