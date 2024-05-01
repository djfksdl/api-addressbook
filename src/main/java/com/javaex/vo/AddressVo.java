package com.javaex.vo;

public class AddressVo {
	
	//필드
	private int aNo;
	private int cNo;
	private int acNo;
	private String name;
	private String hp;
	private int gender;
	private String email;
	private String memo;
	private boolean favorite;
	private String cName;
	
	//생성자
	public AddressVo() {
		super();
	}
	
	public AddressVo(int aNo, String name, String hp, int gender, String email, String memo,
			boolean favorite) {
		super();
		this.aNo = aNo;
		this.name = name;
		this.hp = hp;
		this.gender = gender;
		this.email = email;
		this.memo = memo;
		this.favorite = favorite;
	}

	public AddressVo(int aNo, int cNo, int acNo, String name, String hp, int gender, String email, String memo,
			boolean favorite, String cName) {
		super();
		this.aNo = aNo;
		this.cNo = cNo;
		this.acNo = acNo;
		this.name = name;
		this.hp = hp;
		this.gender = gender;
		this.email = email;
		this.memo = memo;
		this.favorite = favorite;
		this.cName = cName;
	}

	
	//메소드-gs
	public int getaNo() {
		return aNo;
	}

	public void setaNo(int aNo) {
		this.aNo = aNo;
	}

	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getAcNo() {
		return acNo;
	}

	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	//메소드-일반
	@Override
	public String toString() {
		return "AddressVo [aNo=" + aNo + ", cNo=" + cNo + ", acNo=" + acNo + ", name=" + name + ", hp=" + hp
				+ ", gender=" + gender + ", email=" + email + ", memo=" + memo + ", favorite=" + favorite + ", cName="
				+ cName + "]";
	}

}
