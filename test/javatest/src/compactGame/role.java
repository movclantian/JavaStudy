package compactGame;

import java.util.Random;

public class role {
	private String name;
	private int blood;
	
	public role(String name, int blood) {
		super();
		this.name = name;
		this.blood = blood;
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
	
	//用于攻击
	public void attack(role role) {
		//计算造成伤害
		Random r =new Random();
		int hurt =r.nextInt(20)+1;
		
		//修改挨揍人的血量
		
		int lastblood=role.getBlood()-hurt;
		//如果为负数
		lastblood =lastblood<0?0:lastblood;
		
		role.setBlood(lastblood);
		
		System.out.println(this.getName()+"举起拳头打了"+role.getName()+"一下,"+"造成了"+hurt+
				 "点伤害,"+role.getName()+"还剩下"+lastblood+"点血量");
	}
	
		
	
}
