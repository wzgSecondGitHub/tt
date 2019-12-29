
public class JudgeRole {

	public String judge(String roleName) {
		return RoleEnum.valueOf(roleName).op();
	}
	public static void main(String[] args) {
		JudgeRole j = new JudgeRole();
		String s = j.judge("Role_ROOT_ADMIN");
		System.out.println(s);
		
	}
}
