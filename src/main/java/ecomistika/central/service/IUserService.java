/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ecomistika.central.service;

import ecomistika.central.model.User;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Nicolas
 */
public interface IUserService {

    public List<User> getAllUsers();

    public Optional<User> getUserById(Long id);

    public User createUser(User tax);

    public User LimitedUpdateUser(Long id, User updatedUser);

    public User SecuredUpdateUser(Long id, User updatedUser);

    public void deleteUser(Long id);
}
