package utils.example.utils;


import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    User user1 = new User(1, "Ali", "karachi");
    User user2 = new User(2, "Muhammad", "Lahore");
    User user3 = new User(3, "Abdullah", "Lahore");
    User user4 = new User(4, "Rehan", "Peshawar");
    User user5 = new User(5, "Owais", "Quetta");

    List<User> list = new ArrayList<>();

    public void addList() {
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
    }

    public void getList() {
        for (int i=0; i<list.size(); i++){
            list.get(i);
        }

    }
}

    class User {
        private Integer id;
        private String name;
        private String city;

        public User(Integer id, String name, String city) {
            this.city = city;
            this.name = name;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
