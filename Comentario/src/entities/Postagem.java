package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy, HH:mm:ss");
	
	private Date momento;
	private String Titulo;
	private String opiniao;
	private Integer likes;
	
	private List<Comentarios> comentarios = new ArrayList<>();

	public Postagem() {
		
	}

	public Postagem(Date momento, String Titulo, String opiniao, Integer likes) {
		
		this.momento = momento;
		this.Titulo = Titulo;
		this.opiniao = opiniao;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String Titulo) {
		this.Titulo = Titulo;
	}

	public String getOpiniao() {
		return opiniao;
	}

	public void setOpiniao(String opiniao) {
		this.opiniao = opiniao;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}

	/*public void setComentarios(List<Comentarios> comentarios) {
		this.comentarios = comentarios;
	não pode*/
	
	public void addComentarios(Comentarios comentario) {
		comentarios.add(comentario);
	}
	public void removeComentarios(Comentarios comentario) {
		comentarios.remove(comentario);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Titulo + "\n");
		sb.append(likes);
		sb.append("likes-" + "\n");
		sb.append(sdf.format(momento) + "\n");
		sb.append(opiniao + "/n");
		sb.append("Comentarios:\n");
		for(Comentarios c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
}