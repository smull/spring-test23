package com.levelup.spring.rest.resources;

import com.levelup.spring.model.user.User;
import com.levelup.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by java on 31.03.2015.
 */
@Path("/user")
@Component
public class UserResource {

    @Autowired
    UserService userService;


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
    public User createUser(@QueryParam("id") Long id,
                                 @QueryParam("firstName") String firstName,
                                 @QueryParam("lastName") String lastName,
                                 @QueryParam("age") Integer age){

        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);userService.createUser(user);
        return user;
    }

    @Path("/delete/{userId}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public User deleteUserById(@PathParam("userId") Long userId){
        return userService.deleteById(userId);
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public User updateUser(@QueryParam("id") Long id,
                           @QueryParam("firstName") String firstName,
                           @QueryParam("lastName") String lastName,
                           @QueryParam("age") Integer age){

        return userService.update(id,firstName,lastName,age);
    }

}
