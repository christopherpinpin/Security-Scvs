package Model;

public class User {
    private int id;
    private String username;
    private String password;
    private int role = 2;
    private int locked = 0;
    private int attempts = 0;
    private String secQ1;
    private String secQ2;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public User(int id, String username, String password, int role, int locked, int attempts, String secQ1, String secQ2){
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.locked = locked;
        this.attempts = attempts;
        this.secQ1 = secQ1;
        this.secQ2 = secQ2;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }
    
    public int getAttempts(){
        return attempts;
    }
    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
    
    public String getSecQ1(){
        return this.secQ1;
    }
    
    public void setSecQ1(String secQ1){
        this.secQ1 = secQ1;
    }
    
    public String getSecQ2(){
        return this.secQ2;
    }
    
    public void setSecQ2(String secQ2){
        this.secQ2 = secQ2;
    }
}
