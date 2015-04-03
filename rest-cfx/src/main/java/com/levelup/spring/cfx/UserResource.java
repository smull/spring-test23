package com.levelup.spring.cfx;

import com.levelup.spring.model.user.User;
import com.levelup.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by SMULL on 4/3/2015.
 */
@Path("/user")
@Component
public class UserResource {

    @Autowired
    UserService userService;


    @Path("/get/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsers() {
        //initContext();
        List<User> users = userService.getAllUsers();
        return users;
    }

    @Path("/get/{userId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(@PathParam("userId") Long userId) {
        //initContext();
        User user = userService.getUserById(userId);
        return user;
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public User createUser(@FormParam("id") Long id,
                                 @FormParam("firstName") String firstName,
                                 @FormParam("lastName") String lastName,
                                 @FormParam("age") Integer age){
        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        userService.createUser(user);
        return user;
    }

//    @Path("/res")
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response doWork(User person) {
//        try {
//            userService.createUser(person);
//            return Response.ok().build();
//        }catch (Exception e) {
//            return Response.status(Response.Status.CONFLICT).build();
//        }
//    }


    @Path("/delete/{userId}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public User deleteUserById(@PathParam("userId") Long userId){
        return userService.deleteById(userId);
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public User updateUser(@FormParam("id") Long id,
                           @FormParam("firstName") String firstName,
                           @FormParam("lastName") String lastName,
                           @FormParam("age") Integer age){

        return userService.update(id,firstName,lastName,age);
    }

}
