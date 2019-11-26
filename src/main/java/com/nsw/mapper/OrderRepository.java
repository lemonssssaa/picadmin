package com.nsw.mapper;

import com.nsw.dirs.Order;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface OrderRepository {
    @Select("select * from image_02dybj")
    @Results({
            @Result(property = "address", column = "address_id",
                    one = @One(select = "com.kingboy.repository.address.AddressRepository.findAddressById"))
    })
    Order findUserWithAddress(int id);
}
