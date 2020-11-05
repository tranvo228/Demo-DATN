package edu.poly.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class user implements Serializable{
	@Id
	@Column(name = "maKH", length = 10)
	private String maKH;
	
	@Column(name = "hoTen", length = 100)
	private String hoTen;
	
	@Column(name = "diaChi", length = 200)
	private String diaChi;
	
	@Column(name = "soDienThoai", length = 20)
	private String soDienThoai;
	
	@Column(name = "taiKhoan", length = 100)
	private String taiKhoan;
	
	@Column(name = "matKhau", length = 100)
	private String matKhau;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "vaiTro", length = 100)
	private String vaiTro;

	public user() {
		super();
	}

	public user(String maKH, String hoTen, String diaChi, String soDienThoai, String taiKhoan, String matKhau,
			String email, String vaiTro) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.email = email;
		this.vaiTro = vaiTro;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVaiTro() {
		return vaiTro;
	}

	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}
	
	
}
