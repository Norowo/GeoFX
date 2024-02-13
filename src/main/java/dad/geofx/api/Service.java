package dad.geofx.api;

import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service {

	private static final String BASE_URL = "https://ipapi.com/";

	 private static IpApiService service;
	
	  public static IpApiService getInstance() {
	        if (service == null) {
	            Retrofit retrofit = new Retrofit.Builder()
	                    .baseUrl(BASE_URL)
	                    .addConverterFactory(GsonConverterFactory.create())
	                    .build();

	            service = retrofit.create(IpApiService.class);
	        }
	        return service;
	    }

}
