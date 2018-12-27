package com.example.demo.entities;

import java.util.*;

import javax.persistence.*;

@Entity
public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Long id;
	@Column(unique = true)
	private String username;
	private String password;
	/* un attribut enable pour activer et désactiver l'utilisateur */
	private Boolean enable;
	/* un utilisateur peut avoir plusieur role : user & admin*/
	/* à chaque select d'un user de la BD on collecte directement ses roles ; par contre lazy, si on collecte un user pas forcément on collecte ses role*/ 
	@ManyToMany(fetch=FetchType.EAGER)  
	@JoinTable(name="USER_ROLES", joinColumns= {@JoinColumn(name="USER_ID")}, inverseJoinColumns= {@JoinColumn(name="ROLE_ID")})									
	private List<Role> roles = new ArrayList<>();
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, Boolean enable) {
		super();
		this.username = username;
		this.password = password;
		this.enable = enable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}
