package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentarios;
import entities.Postagem;


public class Progama {
	public static void main (String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
	Comentarios c1 = new Comentarios( "Tenha uma boa viagem");
	Comentarios c2 = new Comentarios("Uau � isso � maravilhos");
	Postagem p1 = new Postagem (
			sdf.parse("21/06/2018 13:05:44"),
			"Tenha uma boa viagem",
			"Uau � maravilhoso",
			12);// Throws para tratamento nesse momento
	
	
	p1.addComentarios(c1);
    p1.addComentarios(c2);	
    
    Comentarios c3 = new Comentarios("Boa Noite");
    Comentarios c4 = new Comentarios("Voce esta otimo");
    Postagem p2 = new Postagem(
    		sdf.parse("28/07/2018 23:14:19"), 
    		"Boa Noite",
    		"Vejo vcs amanha",
    		5);
    
    p2.addComentarios(c3);
    p2.addComentarios(c4);
    
    System.out.println(p1);
    System.out.println(p2);
	}
}