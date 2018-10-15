package com.dung.api.webservice;

import com.dung.api.dto.EmployeeDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;

public interface Service {//retrofit tu co thead de ket noi voi internet
    //viet phuong thuc lay data ve
    @GET("api/v1/employees")
    //day la phuong thuc get,ben trong la duong dan den API
    Call<List<EmployeeDto>> getEmployees();

    @GET("api/v1/employees/{id}")//day la 1 therd,tao request  bnag thread
    Call<EmployeeDto> getEmployee(@Part("id") String id);//phai co call thi api moi cahy dc ow baground thread ,api phai chay o backgrourd thread moi requast la 1 thread

}
