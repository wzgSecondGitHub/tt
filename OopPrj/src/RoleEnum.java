
public enum RoleEnum implements RoleOperation{
	Role_ROOT_ADMIN{
		@Override
		public String op() {
			// TODO Auto-generated method stub
			return "Role_ROOT_ADMIN has AAA permission";
		}
	},
	ROLE_ORDER_ADMIN{
		@Override
		public String op() {
			// TODO Auto-generated method stub
			return "ROLE_ORDER_ADMIN has BBB permission";
		}
	},
	ROLE_NORMAL{
		@Override
		public String op() {
			// TODO Auto-generated method stub
			return "ROLE_NORMAL has CCC permission";
		}
	}

}
