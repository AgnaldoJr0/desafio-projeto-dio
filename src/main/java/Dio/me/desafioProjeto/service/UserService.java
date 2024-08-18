package Dio.me.desafioProjeto.service;

import Dio.me.desafioProjeto.domain.model.User;

public interface UserService {

    User findById(long id);

    User create(User userToCreate);
}
