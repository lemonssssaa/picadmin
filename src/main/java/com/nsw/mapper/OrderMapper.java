package com.nsw.mapper;

import com.nsw.dirs.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Select("select * from image_01")
    List<Order> findAll();
    @Select("select * from image_02dybj")
    List<Order>FindAll();
    @Select("select * from image_03wmrx")
    List<Order> FindALL();
    @Select("select * from image_04cych")
    List<Order> FIndall();
    @Select("select * from image_05mkpng")
    List<Order> mk();
    @Select("select * from image_01 where imagename=#{imagename}")
    List <Order>kindAll(Order user);
    //添加
     @Insert("insert into image_01 (id,name,imagename) values (#{id},#{name},#{imagename})")
    public int save(Order user);
     @Delete("delete from image_01 where id= #{id}")
     public void delete(int id);
     @Select("select * from image_01 where id= #{id}")
     public Order get(int id);
         @Update("update image_01 set name=#{name},imagename=#{imagename},imagesize=#{imagesize},tp=#{tp} where id=#{id}")
      public int update(Order user);

//    @Query("select * from image_01  where imagename = ?1")
//    default List<User> findByUser(String imagename) {
//        return null;
//    }
//@Query(value = "select * from User u where u.user_name like CONCAT('%', :user_name, '%')",nativeQuery=true)
//List<User> findByUser_nameLike(@Param("user_name") String user_name);


}
