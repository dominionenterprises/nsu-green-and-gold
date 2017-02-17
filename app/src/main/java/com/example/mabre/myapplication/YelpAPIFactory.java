package com.example.mabre.myapplication;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import se.akerfeldt.okhttp.signpost.OkHttpOAuthConsumer;
import se.akerfeldt.okhttp.signpost.SigningInterceptor;

/**
 * Created by mabre on 2/17/2017.
 */

 public class YelpAPIFactory {

    private static final String YELP_API_BASE_URL = "https://api.yelp.com";
    private static YelpApi YELP_API_CONNECTIONS;
        static {
            createService("VvVXaLNWV1NQNk5ey3r2Gg", "hCiHJnS5BKLlQhudNvFq8zE09GM", "9tAoiPguQVhucpvJa0TSMLiQxgP6H-u7", "sZMXcl_e0Y6_f21PmZfeD6oEUwY");
        }


    public static YelpApi yelpApi(){
        return YELP_API_CONNECTIONS;
    }
        /**
         * Construct a new {@code YelpAPIFactory}.
         *
         * @param consumerKey    the consumer key.
         * @param consumerSecret the consumer secret.
         * @param token          the access token.
         * @param tokenSecret    the token secret.
         * @see <a href="https://www.yelp.com/developers/manage_api_keys">https://www.yelp.com/developers/manage_api_keys</a>
         */
        public YelpAPIFactory(String consumerKey, String consumerSecret, String token, String tokenSecret) {
            OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(consumerKey, consumerSecret);
            consumer.setTokenWithSecret(token, tokenSecret);

        }


        public static void createService(String consumerKey, String consumerSecret, String token, String tokenSecret) {
            OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(consumerKey, consumerSecret);
            consumer.setTokenWithSecret(token, tokenSecret);
            OkHttpClient httpClient;
            httpClient = new OkHttpClient.Builder()
                    .addInterceptor(new SigningInterceptor(consumer))
                    .build();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(YELP_API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient)
                    .build();

            YELP_API_CONNECTIONS = retrofit.create(YelpApi.class);
        }

}