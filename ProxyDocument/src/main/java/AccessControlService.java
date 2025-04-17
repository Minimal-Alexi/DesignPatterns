public class AccessControlService {
    private static AccessControlService instance;
    private AccessControlService() {

    }
    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }
    public boolean isAllowed(int UID,User user){
        return true;
    }
}
