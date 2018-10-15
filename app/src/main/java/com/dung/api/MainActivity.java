package com.dung.api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.dung.api.dto.EmployeeDto;
import com.dung.api.webservice.CLient;

import java.util.List;

import retrofit2.Call;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

//    client va server gom  request vareposnse gom 2 phan header va body
    //header :chua dia chi(thong ti requset)
    //body :chua noi dung
    //requset:co the o dang GET hoc DANG POST
    //GET:len sever xin du lieu ve xem chu k thay doi (chi co header),khong co body van day dc du lieu len nhung co body (khong thay dc du liwu)

    //POST:lam moi du lieu (thay doi)(chua co cai nao)
//    su khac nhau
    //PUST:(co tai nguyen roi sua toan bo )
    //PATCH(su mot phan)
    //DELETE:xoa gi ow server thi dung thnag naay
    //doi tuong HTTPURL
    //retofit;no dung gson
    //gson  la loai thu vien lam viec voi json

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callApiDemo();
    }

//    no cah khong tuan tu
    // RxAndroid de kem retrofit
    //RxAndroid chuyen xu ly thread
    //retrofit co internet phai co Thread

    private void callApiDemo() {//cahy kieu nay muot hon
        Log.d("a", "1");//cahy dong 1 thi chay dong 2 luon
        CLient.getService().getEmployees().enqueue(new Callback<List<EmployeeDto>>() {
            @Override
            public void onResponse(Call<List<EmployeeDto>> call,
                                   Response<List<EmployeeDto>> response) {
                if (response.isSuccessful()) {
                    List<EmployeeDto> employeeDtos = response.body();//thanh cong thi vao body lay data
                    //TODO
                    Toast.makeText(MainActivity.this, employeeDtos.get(2).getEmployeeName(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<List<EmployeeDto>> call, Throwable t) {
            }
        });//goi no ra
        Log.d("a", "2");
    }
}
