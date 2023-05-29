package entities;

import java.time.LocalDate;

public class GenStudent {

	private String name;
	private LocalDate birthDate;
	private String sign;
	private String songLink;
	
	public GenStudent() {}

	public GenStudent(String name, LocalDate birthDate, String sign, String songLink) {
		this.name = name;
		this.birthDate = birthDate;
		this.sign = sign;
		this.songLink = songLink;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSongLink() {
		return songLink;
	}

	public void setSongLink(String songLink) {
		this.songLink = songLink;
	}

	@Override
	public String toString() {
		StringBuilder  sb = new StringBuilder();
			sb.append("Data de nascimento: " + getBirthDate() + "\n");
			sb.append("Signo: " + getSign() + "\n");
			sb.append("Link/Música: " + getSongLink() + "\n");
		return sb.toString();
	}
	
	
	
	
}
