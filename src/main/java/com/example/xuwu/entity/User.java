package com.example.xuwu.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

/**
 * @Description  
 * @Author liuhuan
 * @Date 2019-07-28 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="user" )
public class User  implements Serializable {

	private static final long serialVersionUID =  4658381749038274634L;

	/**
	 * 用户唯一id
	 */
   	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 用户名
	 */
   	@Column(name = "name" )
	private String name;

	/**
	 * 电子邮箱
	 */
   	@Column(name = "email" )
	private String email;

	/**
	 * 电话号码
	 */
   	@Column(name = "phone_number" )
	private String phoneNumber;

	/**
	 * 密码
	 */
   	@Column(name = "password" )
	private String password;

	/**
	 * 用户状态 0-正常 1-封禁
	 */
   	@Column(name = "status" )
	private Long status;

	/**
	 * 用户账号创建时间
	 */
   	@Column(name = "create_time" )
	private Date createTime;

	/**
	 * 上次登录时间
	 */
   	@Column(name = "last_login_time" )
	private Date lastLoginTime;

	/**
	 * 上次更新记录时间
	 */
   	@Column(name = "last_update_time" )
	private Date lastUpdateTime;

	/**
	 * 头像
	 */
   	@Column(name = "avatar" )
	private String avatar;

}
