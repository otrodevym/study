package mock;

public class UserRegister {
	private String id;
	private String passwd;
	private String name;
	public UserRegister() {
	}
	public UserRegister(String id, String paswd, String name) {
		super();
		this.id = id;
		this.passwd = paswd;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPaswd() {
		return passwd;
	}
	public void setPaswd(String paswd) {
		this.passwd = paswd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void savePassword(String userId, String encrypt) {
		this.id = userId;
		this.passwd = encrypt;
	}
	
	
}
