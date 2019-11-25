package com.ahmedsobhy.facebookv2.data;

import com.ahmedsobhy.facebookv2.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostClient {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private PostInterface postInterface;
    private static PostClient INSATNCE;

    public PostClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        postInterface = retrofit.create(PostInterface.class);

    }

    public static PostClient getINSATNCE() {
        if (null == INSATNCE){
            INSATNCE = new PostClient();
        }
        return INSATNCE;
    }
    public Call<List<PostModel>> getPosts(){
        return postInterface.getPosts();
    }

}
