class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friends;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}

class SocialMediaLinkedList {
    private UserNode head;

    public void addUser(int id, String name, int age) {
        UserNode user = new UserNode(id, name, age);
        user.next = head;
        head = user;
    }

    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void searchById(int id) {
        UserNode u = findUserById(id);
        if (u != null)
            displayUser(u);
    }

    public void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                displayUser(temp);
            temp = temp.next;
        }
    }

    public void addFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);
        if (u1 == null || u2 == null)
            return;
        u1.friends = addFriend(u1.friends, id2);
        u2.friends = addFriend(u2.friends, id1);
    }

    private FriendNode addFriend(FriendNode head, int id) {
        FriendNode node = new FriendNode(id);
        node.next = head;
        return node;
    }

    public void removeFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);
        if (u1 == null || u2 == null)
            return;
        u1.friends = removeFriend(u1.friends, id2);
        u2.friends = removeFriend(u2.friends, id1);
    }

    private FriendNode removeFriend(FriendNode head, int id) {
        if (head == null)
            return null;
        if (head.friendId == id)
            return head.next;
        FriendNode temp = head;
        while (temp.next != null) {
            if (temp.next.friendId == id) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }

    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null)
            return;
        FriendNode temp = user.friends;
        System.out.print("Friends of " + user.name + ": ");
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void mutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);
        if (u1 == null || u2 == null)
            return;

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friends;
        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId)
                    System.out.print(f1.friendId + " ");
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    private void displayUser(UserNode u) {
        System.out.println("ID: " + u.userId + ", Name: " + u.name + ", Age: " + u.age);
    }
}

public class SocialMediaFriends {
    public static void main(String[] args) {
        SocialMediaLinkedList sm = new SocialMediaLinkedList();

        sm.addUser(1, "Alice", 22);
        sm.addUser(2, "Bob", 24);
        sm.addUser(3, "Charlie", 23);
        sm.addUser(4, "David", 25);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(2, 4);

        sm.displayFriends(1);
        sm.displayFriends(2);

        sm.mutualFriends(1, 2);

        sm.countFriends();

        sm.searchByName("Alice");
        sm.searchById(4);

        sm.removeFriendConnection(1, 2);
        sm.displayFriends(1);
    }
}
