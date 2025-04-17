import Document.*;

import Security.AccessControlService;
import Security.User;

import java.nio.file.AccessDeniedException;

public class Main {
    private static User[] users;
    private static AccessControlService accessControlService;
    private static Library library;
    public static void main(String[] args) {
        userInitialization();
        libraryInitialization();
        acsInitialization();

        // Good access requests
        accessDocument(0,users[0]);
        accessDocument(0,users[1]);
        accessDocument(0,users[2]);

        accessDocument(1,users[0]);
        accessDocument(1,users[1]);
        accessDocument(1,users[2]);

        accessDocument(2,users[2]);

        // Bad access requests
        accessDocument(2,users[0]);
        accessDocument(2,users[1]);
    }
    private static void userInitialization(){
        users = new User[3];
        users[0] = new User("John");
        users[1] = new User("Jane");
        users[2] = new User("Jack");

    }
    private static void libraryInitialization(){
        // Initialization
        library = new Library();

        // Document creation
        Document publicDocument = library.createUnsecureDocument(0,"This is a public service announcement." +
                " This library can never, ever be hacked."), protectedDocument = library.createSecureDocument(1,
                "It would be bad if I accidentally leak these war plans on #general."),
                protectedDocument2 = library.createSecureDocument(2,"To make a good cookie, you need sugar, " +
                        "flour,egg,and chocolate!");

        library.addDocument(publicDocument);
        library.addDocument(protectedDocument);
        library.addDocument(protectedDocument2);
    }
    private static void acsInitialization() {
        // Initialization
        accessControlService = AccessControlService.getInstance();

        // Give users access to documents
        accessControlService.grantAccess(1,users[0]);
        accessControlService.grantAccess(1,users[1]);
        accessControlService.grantAccess(1,users[2]);

        accessControlService.grantAccess(2,users[2]);
    }
    private static void accessDocument(int document,User user){
        Document doc = library.getDocument(document);
        try{
            String content = doc.getContent(user);
            System.out.println("User " + user.getUsername() + " accessed document " + doc.getUID()+": " + content);
        }catch (AccessDeniedException accessDeniedException){
            System.out.println(accessDeniedException.getMessage());
        }

    }

}
