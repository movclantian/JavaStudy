package compactGamePlus;

import java.util.Random;

public class role {
	private String name;
	private int blood;
	private String gender;
	private String face;

	String[] boyfaces = { "风流俊雅", "气字轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞" };

	String[] girlfaces = { "美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹" };

	String[] attacks_desc = { "%s使出了一招【背心钉】转到对方的身后，一掌向%s背心的灵台穴拍去。", "%s使出了一招【游空探爪】，" + "飞起身形自半空中变掌为抓锁向%s。",
			"%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。", "%s运气于掌，" + "一瞬间掌心变得血红，一式【掌心雷】，推向%s。", "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的向%s。",
			"%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s" };
	String[] injureds_desc = { "结果%s退了半步，毫发无损", "结果给%s造成一处瘀伤", "结果一击命中，%s痛得弯下腰", "结果%s痛苦地闷哼了一声，显然受了点内伤",
			"结果%s摇摇晃晃，一跤摔倒在地", "结果%s脸色一下变得惨白，连退了好几步", "结果『轰』的一声，%s口中鲜血狂喷而出", "结果%s一声惨叫，像滩软泥般塌了下去", };

	public role(String name, int blood, String gender) {
		super();
		this.name = name;
		this.blood = blood;
		this.gender = gender;
		setFace(gender);

	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String gender) {
		// 长相随机分男女
		Random f = new Random();
		if (gender == "男") {
			int index = f.nextInt(boyfaces.length);
			face = boyfaces[index];
		} else if (gender == "女") {
			int index = f.nextInt(girlfaces.length);
			face = girlfaces[index];
		} else {
			this.face = "面目狰狞";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	// 用于攻击
	public void attack(role role) {
		// 计算造成伤害
		Random r = new Random();
		int hurt = r.nextInt(20) + 1;

		// 修改挨揍人的血量

		int lastblood = role.getBlood() - hurt;
		// 如果为负数
		lastblood = lastblood < 0 ? 0 : lastblood;

		role.setBlood(lastblood);
		
		int index=r.nextInt(attacks_desc.length);
		String kungfu=attacks_desc[index];
		System.out.printf(kungfu,this.getName(),role.getName());
		
	
		//受伤
		if(lastblood>90) {
			System.out.printf(injureds_desc[0],role.getName());
		}else if(lastblood>79&&lastblood<91) {
			System.out.printf(injureds_desc[1],role.getName());
		}else if(lastblood>69&&lastblood<81) {
			System.out.printf(injureds_desc[2],role.getName());
		}else if(lastblood>59&&lastblood<71) {
			System.out.printf(injureds_desc[3],role.getName());
		}else if(lastblood>49&&lastblood<61) {
			System.out.printf(injureds_desc[4],role.getName());
		}else if(lastblood>39&&lastblood<51) {
			System.out.printf(injureds_desc[5],role.getName());
		}else if(lastblood>29&&lastblood<41) {
			System.out.printf(injureds_desc[6],role.getName());
		}else if(lastblood>0&&lastblood<30) {
			System.out.printf(injureds_desc[7],role.getName());
		}
		System.out.println();
	
	}

	public void showroleinfo() {
		System.out.println("姓名是:" + getName());
		System.out.println("血量是:" + getBlood());
		System.out.println("性别是:" + getGender());
		System.out.println("长相是:" + getFace() + "\n");

	}

}
