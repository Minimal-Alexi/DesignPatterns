package Security;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService instance;
    private final Map<Integer, Set<String>> accessMap;
    private AccessControlService() {
        accessMap = new HashMap<Integer, Set<String>>();
    }
    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }
    public void grantAccess(int documentId, User user) {
        accessMap.computeIfAbsent(documentId, k -> new HashSet<>()).add(user.getUsername());
    }
    public boolean isAllowed(int UID,User user){
        return accessMap.containsKey(UID) && accessMap.get(UID).contains(user.getUsername());
    }
}
