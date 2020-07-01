package br.com.rafael.springbootmongodb.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private String text;
	
	private Date data;
	
	private AuthorDTO authoDTO;	
	
	
	public CommentDTO() {
		// TODO Auto-generated constructor stub
	}


	public CommentDTO(String text, Date data, AuthorDTO authoDTO) {
		super();
		this.text = text;
		this.data = data;
		this.authoDTO = authoDTO;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public AuthorDTO getAuthoDTO() {
		return authoDTO;
	}


	public void setAuthoDTO(AuthorDTO authoDTO) {
		this.authoDTO = authoDTO;
	}
	
	
	

}
