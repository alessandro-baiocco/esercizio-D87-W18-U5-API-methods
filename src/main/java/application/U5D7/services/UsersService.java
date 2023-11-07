package application.U5D7.services;

import application.U5D7.entities.User;
import application.U5D7.exceptions.NotUserFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UsersService {
    private List<User> users = new ArrayList<>();


    public User save(User body){
        Random rnd = new Random();
        body.setId(rnd.nextInt(1 , 1000));
        this.users.add(body);
        return body;
    }


    public List<User> getAllUser(){
        return this.users;
    }



    public User findById(int id){
        User found = null;
        for(User user : this.users){
            if(user.getId() == id){
                found = user;
            }
        }
        if (found == null){
            throw new NotUserFoundException(id);
        }else {
            return found;
        }
    }
    public void findByIdAndDelete(int id){

        ListIterator<User> iterator = this.users.listIterator();
        while (iterator.hasNext()){
            User current = iterator.next();
            if (current.getId() == id){
                iterator.remove();
                System.out.println("utente con id " + id + " è stato rimosso");
            }

        }


    }


    public User findByIdAndUpdate(int id , User body){
        User found = null;
        for(User user:this.users){
            if(user.getId() == id){
                found = user;
                found.setNome(body.getNome());
                found.setCognome(body.getCognome());
                found.setUserPicture(body.getUserPicture());
                found.setEmail(body.getEmail());
                found.setDataDiNascita(body.getDataDiNascita());
            }
        }
        if(found == null){
            throw new NotUserFoundException(id);
        }else {
            System.out.println("utente modificato corretamente");
            return found;
        }

    }


}
