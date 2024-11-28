package petStore;

import com.google.gson.Gson;
import io.restassured.http.Method;
import io.restassured.response.Response;
import juiceShop.frameworkUtils.Utils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import petStore.models.Store;
import petStore.models.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import java.text.SimpleDateFormat;

public class StoreTest extends  BaseTest{
    @DataProvider(name = "storeDp")
    public Iterator<Object[]> storeDp () {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[] {      Utils.generateRandomNumber(100) + "",
                Utils.generateRandomNumber(1000) + "",
                "10",
                "2024-11-28T10:00:00",
                "placed",
                "true"
        });
        return dp.iterator();
    }

    @Test(dataProvider = "storeDp")
    public void createStore(String id, String petId, String quantity, String shipDate, String status, String complete) {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            Date parsedShipDate = dateFormat.parse(shipDate);
            boolean isComplete = Boolean.parseBoolean(complete);

            Store s = new Store(
                    Integer.parseInt(id),
                    Integer.parseInt(petId),
                    Integer.parseInt(quantity),
                    parsedShipDate,
                    status,
                    isComplete
            );
            Gson gson = new Gson();
            System.out.println(gson.toJson(s));
            httpRequest.body(gson.toJson(s));
            Response response = httpRequest.request(Method.POST, "/store/order");
            System.out.println(response.getBody().asString());
            System.out.println(response.getStatusCode());
        }
        catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Exception occurred: " + e.getMessage());
        }
        }

    }


