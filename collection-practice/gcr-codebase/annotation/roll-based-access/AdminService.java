public class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully");
    }

    @RoleAllowed("USER")
    public void viewProfile() {
        System.out.println("Profile viewed");
    }
}
