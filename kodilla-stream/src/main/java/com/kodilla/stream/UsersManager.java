package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    public static String getUsername(User user) {
        return user.getUsername();
    }

    static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }
    public static String getUserName(User user){
        return user.getUsername();

    }
    public static List<String> filterUsersOlderThanAverageAge(int age) {
        List<String> usernames = UsersRepository.getUsersList() // wywołujemy metodę, która zwraca ArrayList obiektów User
                .stream() // uruchamiamy struimeń. Wynikiem jest Stream, przez który przepływają obiekty User
                .filter(user -> user.getAge() > age) // Jako argument przekazujemy wyr. lambda, które zwraca T lub F
                .map(UsersManager :: getUserName)
                .collect(Collectors.toList()); // kolektor tworzy z elementów przepływających przez strumień listę.
        return usernames;
    }

    // Na koniec wymyśl własny strumień, wykorzystując poznane zagadnienia i odpowiednio go przetestuj.
    public static List<String> filterIfUserPostedAnyPost() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(numberOfPost -> numberOfPost.getNumberOfPost() >0)
                .map(UsersManager :: getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<String> usersOlderThanAverageAge = filterUsersOlderThanAverageAge(43);
        System.out.println(usersOlderThanAverageAge);

        List<String> userPostedAnyPost = filterIfUserPostedAnyPost();
        System.out.println(userPostedAnyPost);
    }
}