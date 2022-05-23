package simplemessage;

public class UserModel {
    private int id;
    private String nama;
    private String email;
    private String pass;
    private int status;
    
    public UserModel(){
        
    }
    public UserModel(int id, String nama, String email, String password){
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.pass = password;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setStatus(int status){
        this.status = status;
    }
    
    public int getStatus(){
        return this.status;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPass(){
        return this.pass;
    }
}
