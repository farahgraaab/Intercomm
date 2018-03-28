package com.graaab.intercomm.retrofit;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.graaab.intercomm.helper.ApiConstantHelper;
import com.graaab.intercomm.library.DateDeserializer;
import com.graaab.intercomm.library.DateSerializer;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by USER-28 on 16/3/2018.
 */

public class HttpService {

    private static final int TIME_OUT = 60;
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    public static <T> T callJSONService(final Class<T> serviceClass, final boolean withAuth) {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request.Builder builder;

                builder = chain.request().newBuilder()
                        .header("Connection", "Keep-Alive")
                        .header("Accept", "application/json")
                        .header("Content-Type", "application/json")
                        .header("Content-Language", Locale.getDefault().getLanguage());

                if (withAuth) {
//                    User user = new UserRepository().get();
//                    String token = user.getToken();
//                    String email = user.getEmail();

//                    UserRepository repository = new UserRepository();
//                    if(repository != null) {
//                        String token = repository.get().getToken();
//                        String email = repository.get().getEmail();
//
//                        builder.header("Authorization", "Token=" + token + ",User-Email=" + email);
//                    }

                }

                return chain.proceed(builder.build());
            }
        };

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .registerTypeAdapter(Date.class, new DateDeserializer())
                .registerTypeAdapter(Date.class, new DateSerializer())
                .create();

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .addInterceptor(logging)
                .addInterceptor(interceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConstantHelper.HOST)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build();

        return retrofit.create(serviceClass);
    }
}
