package com.ahmedsobhy.facebookv2.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ahmedsobhy.facebookv2.data.PostClient;
import com.ahmedsobhy.facebookv2.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostViewModel extends ViewModel {
    MutableLiveData<List<PostModel>> postMutableLiveData = new MutableLiveData<>();

    public void getData(){

        PostClient.getINSATNCE().getPosts().enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                postMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {

            }
        });
    }
}
